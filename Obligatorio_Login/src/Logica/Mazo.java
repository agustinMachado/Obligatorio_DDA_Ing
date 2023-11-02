/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author Franco Carreras
 */
public class Mazo {
    private Carta[] cartas;
    private int cartasEnElMazo;
    
    public Mazo() {
        this.cartas = new Carta[108];
    }
    
    public void Resetear() {
        Color[] colores = Color.values();
        this.cartasEnElMazo = 0;
        
        for (int i = 0; i < colores.length - 1; i++) {
            Color color = colores[i];
            this.cartas[this.cartasEnElMazo++] = new Carta(color, Valor.getValor(0));
            
            for (int j = 1; j < 10; j++) {
                this.cartas[this.cartasEnElMazo++] = new Carta(color, Valor.getValor(j));
                this.cartas[this.cartasEnElMazo++] = new Carta(color, Valor.getValor(j));
            }
            
            Valor[] valores = new Valor[]{Valor.DrawTwo, Valor.Skip, Valor.Reverse};
            for (Valor valor : valores) {
                this.cartas[this.cartasEnElMazo++] = new Carta(color, valor);
                this.cartas[this.cartasEnElMazo++] = new Carta(color, valor);
            }
        }
        
        Valor[] valores = new Valor[]{Valor.Wild, Valor.Wild_Four};
        for (Valor valor : valores) {
            for (int i = 0; i < 4; i++) {
                this.cartas[this.cartasEnElMazo++] = new Carta(Color.Wild, valor);
            }
        }
    }
    
    public void RemplazarMazoCon(ArrayList<Carta> cartas) {
        this.cartas = cartas.toArray(new Carta[cartas.size()]);
        this.cartasEnElMazo = this.cartas.length;
    }
    
    public boolean EsVacio() {
        return this.cartasEnElMazo == 0;
    }
    
    public void Barajar() {
        int n = this.cartas.length;
        Random random = new Random();
        
        for (int i = 0; i < this.cartas.length; i++) {
            int valorRandom = i + random.nextInt(n - 1);
            Carta cartaRandom = this.cartas[valorRandom];
            this.cartas[valorRandom] = this.cartas[i];
            this.cartas[i] = cartaRandom;
        }
    }
    
    public Carta RobaCarta() throws IllegalArgumentException {
        if (EsVacio()) {
            throw new IllegalArgumentException("No puedes robar una carta de un mazo vacio");
        }
        
        return this.cartas[--this.cartasEnElMazo];
    }
    
    public ImageIcon RobaImagenCarta() throws IllegalArgumentException {
        if (EsVacio()) {
            throw new IllegalArgumentException("No puedes robar una carta de un mazo vacío");
        }
        
        return new ImageIcon(this.cartas[--this.cartasEnElMazo].toString() + ".png");
    }
    
    public Carta[] RobaCarta(int n) {
        if(n < 0)  {
            throw new IllegalArgumentException("Solo puedes robar cartas positivas");
        }
        
        if(n > this.cartasEnElMazo) {
            throw new IllegalArgumentException("No puedes robar " + n + "cartas porque hay solamente" + this.cartasEnElMazo + "cartas en el mazo");
        }
        
        Carta[] ret = new Carta[n];
        for (int i = 0; i < n; i++) {
            ret[i] = this.cartas[--this.cartasEnElMazo];
        }
        
        return ret;
    }
}
