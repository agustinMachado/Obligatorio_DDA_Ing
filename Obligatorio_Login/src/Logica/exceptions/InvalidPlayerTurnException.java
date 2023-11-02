/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica.exceptions;

/**
 *
 * @author Franco Carreras
 */
public class InvalidPlayerTurnException extends Exception {
    String idJug;

    public InvalidPlayerTurnException(String mensaje, String id) {
        super(mensaje);
        this.idJug = id;
    }

    public String GetIdJugador() {
        return this.idJug;
    }
}
