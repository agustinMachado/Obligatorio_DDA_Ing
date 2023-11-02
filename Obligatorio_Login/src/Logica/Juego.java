/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Logica.exceptions.InvalidColorSubmissionException;
import Logica.exceptions.InvalidPlayerTurnException;
import Logica.exceptions.InvalidValueSubmissionException;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Franco Carreras
 */
public class Juego {
    private int jugadorActual;
    private String[] idsJugadores;
    private Mazo mazo;
    private ArrayList<ArrayList<Carta>> manoJugadores;
    private ArrayList<Carta> reserva;
    private Color colorValido;
    private Valor valorValido;
    boolean direccionJuego;

    public Juego(String[] idsJugadores) {
        this.mazo = new Mazo();
        this.mazo.Barajar();
        this.reserva = new ArrayList<Carta>();
        this.idsJugadores = idsJugadores;
        this.jugadorActual = 0;
        this.direccionJuego = false;
        this.manoJugadores = new ArrayList<ArrayList<Carta>>();
        
        for (int i = 0; i < idsJugadores.length; i++) {
            ArrayList<Carta> mano = new ArrayList<Carta>(Arrays.asList(mazo.RobaCarta(7)));
            this.manoJugadores.add(mano);
        }
    }
    
    public void Empezar(Juego juego) {
        Carta carta = mazo.RobaCarta();
        this.colorValido = carta.getColor();
        this.valorValido = carta.getValor();
        
        if (carta.getValor() == Valor.Wild || carta.getValor() == Valor.Wild_Four || carta.getValor() == Valor.DrawTwo) {
            Empezar(juego);
        }
        
        if (carta.getValor() == Valor.Skip) {
            JLabel mensaje = new JLabel(this.idsJugadores[this.jugadorActual] + "fue salteado");
            mensaje.setFont(new Font("Arial", Font.BOLD, 48));
            JOptionPane.showMessageDialog(null, mensaje);
            
            if (this.direccionJuego == false) {
                this.jugadorActual = (this.jugadorActual + 1) % this.idsJugadores.length;
            }
            else if (this.direccionJuego == true) {
                this.jugadorActual = (this.jugadorActual - 1) % this.idsJugadores.length;
                if(this.jugadorActual == -1) {
                    this.jugadorActual = this.idsJugadores.length - 1;
                }
            }
        }
        
        if (carta.getValor() == Valor.Reverse) {
            JLabel mensaje = new JLabel(this.idsJugadores[this.jugadorActual] + "la dirección del juego cambió");
            mensaje.setFont(new Font("Arial", Font.BOLD, 48));
            JOptionPane.showMessageDialog(null, mensaje);
            this.direccionJuego ^= true;
            this.jugadorActual = this.idsJugadores.length - 1;
        }
        
        this.reserva.add(carta);
    }
    
    public Carta GetCartaSuperior() {
        return new Carta(this.colorValido, this.valorValido);
    }
    
    public ImageIcon GetImagenCartaSuperior() {
        return new ImageIcon(this.colorValido + " - " + this.valorValido + ".png");
    }
    
    public boolean FinDelJuego() {
        for (String jugador : this.idsJugadores) {
            if (ManoVacia(jugador)) {
                return true;
            }
        }
        
        return false;
    }
    
    public String GetJugadorActual() {
        return this.idsJugadores[this.jugadorActual];
    }
    
    public String GetJugadorPrevio(int i) {
        int indice = this.jugadorActual - i;
        
        if(indice == -1) {
            indice = this.idsJugadores.length - 1;
        }
        
        return this.idsJugadores[indice];
    }
    
    public String[] GetJugadores() {
        return this.idsJugadores;
    }
    
    public ArrayList<Carta> GetManoJugador(String id) {
        int indice = Arrays.asList(this.idsJugadores).indexOf(id);
        
        return this.manoJugadores.get(indice);
    }
    
    public int GetTamanioManoJugador(String id) {
        return GetManoJugador(id).size();
    }
    
    public Carta GetCartaJugador(String id, int opcion) {
        ArrayList<Carta> mano = GetManoJugador(id);
        
        return mano.get(opcion);
    }
    
    public boolean ManoVacia(String id) {
        return GetManoJugador(id).isEmpty();
    }
    
    public boolean ValidarCartaJugada(Carta carta) {
        return carta.getColor() == this.colorValido || carta.getValor() == this.valorValido;
    }
    
    public void ChequearTurnoJugador(String id) throws InvalidPlayerTurnException {
        if (this.idsJugadores[this.jugadorActual] != id) {
            throw new InvalidPlayerTurnException("Este no es el turno del jugador ", id);
        }
    }
    
    public void EnviarRobo(String id) throws InvalidPlayerTurnException {
        ChequearTurnoJugador(id);
        
        if (this.mazo.EsVacio()) {
            this.mazo.RemplazarMazoCon(this.reserva);
            this.mazo.Barajar();
        }
        
        GetManoJugador(id).add(this.mazo.RobaCarta());
        
        if (this.direccionJuego == false) {
            this.jugadorActual = (this.jugadorActual + 1) % this.idsJugadores.length;
        }
        else if (this.direccionJuego == true) {
            this.jugadorActual = (this.jugadorActual - 1) % this.idsJugadores.length;
            
            if(this.jugadorActual == -1) {
                this.jugadorActual = this.idsJugadores.length - 1;
            }
        }
    }
    
    public void SetColorCarta(Color color) {
        this.colorValido = color;
    }
    
    public void EnviarTarjetaJugador(String id, Carta carta, Color colorDeclarado) throws InvalidColorSubmissionException, InvalidValueSubmissionException, InvalidPlayerTurnException{
        ChequearTurnoJugador(id);
        
        ArrayList<Carta> manoJug = GetManoJugador(id);
        
        if(!ValidarCartaJugada(carta)) {
            if(carta.getColor() == Color.Wild) {
                this.colorValido = carta.getColor();
                this.valorValido = carta.getValor();
            }
            
            if(carta.getColor() != this.colorValido) {
                JLabel mensaje = new JLabel("Movimiento de jugador invalido, se espera el color: " + this.colorValido);
                mensaje.setFont(new Font("Arial", Font.BOLD, 48));
                JOptionPane.showMessageDialog(null, mensaje);
                throw new InvalidColorSubmissionException(mensaje.getText(), carta.getColor(), this.colorValido);
            }
            else if(carta.getValor() != this.valorValido) {
                JLabel mensajeDos = new JLabel("Movimiento de jugador invalido, se espera el valor: " + this.valorValido);
                mensajeDos.setFont(new Font("Arial", Font.BOLD, 48));
                JOptionPane.showMessageDialog(null, mensajeDos);
                throw new InvalidValueSubmissionException(mensajeDos.getText(), carta.getValor(), this.valorValido);
            }
        }
        
        manoJug.remove(carta);
        
        if(ManoVacia(this.idsJugadores[this.jugadorActual])) {
            JLabel mensajeTres = new JLabel(this.idsJugadores[this.jugadorActual] + " ganó el juego. Gracias por jugar");
            mensajeTres.setFont(new Font("Arial", Font.BOLD, 48));
            JOptionPane.showMessageDialog(null, mensajeTres);
            System.exit(0);
        }
        
        this.colorValido = carta.getColor();
        this.valorValido = carta.getValor();
        this.reserva.add(carta);
        
        if(this.direccionJuego == false) {
            this.jugadorActual = (this.jugadorActual + 1) % idsJugadores.length;
        }
        else if(this.direccionJuego == true) {
            this.jugadorActual = (this.jugadorActual - 1) % idsJugadores.length;
            
            if(this.jugadorActual == -1) {
                this.jugadorActual = this.idsJugadores.length - 1;
            }
        }
        
        if(carta.getColor() == Color.Wild) {
            this.colorValido = colorDeclarado;
        }
        
        if(carta.getValor() == Valor.DrawTwo) {
            id = this.idsJugadores[this.jugadorActual];
            GetManoJugador(id).add(this.mazo.RobaCarta());
            GetManoJugador(id).add(this.mazo.RobaCarta());
            JLabel mensaje = new JLabel(id + "roba 2 cartas");
        }
        
        if(carta.getValor() == Valor.Wild_Four) {
            id = this.idsJugadores[this.jugadorActual];
            GetManoJugador(id).add(this.mazo.RobaCarta());
            GetManoJugador(id).add(this.mazo.RobaCarta());
            GetManoJugador(id).add(this.mazo.RobaCarta());
            GetManoJugador(id).add(this.mazo.RobaCarta());
            JLabel mensaje = new JLabel(id + "roba 4 cartas");
        }
        
        if(carta.getValor() == Valor.Skip) {
            JLabel mensaje = new JLabel(this.idsJugadores[this.jugadorActual] + "fue saltado");
            mensaje.setFont(new Font("Arial", Font.BOLD, 48));
            JOptionPane.showMessageDialog(null, mensaje);
            
            if(this.direccionJuego == false) {
                this.jugadorActual = (this.jugadorActual + 1) % idsJugadores.length;
            }
            else if(this.direccionJuego == true) {
                this.jugadorActual = (this.jugadorActual - 1) % idsJugadores.length;
                
                if(this.jugadorActual == -1) {
                    this.jugadorActual = this.idsJugadores.length - 1;
                }
            }
        }
        
        if(carta.getValor() == Valor.Reverse) {
            JLabel mensaje = new JLabel(id + "cambio la direccion del juego!");
            mensaje.setFont(new Font("Arial", Font.BOLD, 48));
            JOptionPane.showMessageDialog(null, mensaje);
            
            this.direccionJuego ^= true;
            
            if(this.direccionJuego == true) {
                this.jugadorActual = (this.jugadorActual - 2) % idsJugadores.length;
                
                if(this.jugadorActual == -1) {
                    this.jugadorActual = this.idsJugadores.length - 1;
                }
                
                if(this.jugadorActual == -2) {
                    this.jugadorActual = this.idsJugadores.length - 2;
                }
            }
            else if(this.direccionJuego == false) {
                this.jugadorActual = (this.jugadorActual + 2) % idsJugadores.length;
            }
        }
    }
}
