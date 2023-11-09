/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica.exceptions;

import Logica.Valor;

/**
 *
 * @author Franco Carreras
 */
public class InvalidValueSubmissionException extends Exception {
    private Valor esperado;
    private Valor actual;

    public InvalidValueSubmissionException(String mensaje, Valor actual, Valor esperado) {
        this.actual = actual;
        this.esperado = esperado;
    }
}
