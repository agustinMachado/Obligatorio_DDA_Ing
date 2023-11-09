/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica.exceptions;

import Logica.Color;

/**
 *
 * @author Franco Carreras
 */
public class InvalidColorSubmissionException extends Exception {
    private Color esperado;
        private Color actual;

        public InvalidColorSubmissionException(String mensaje, Color actual, Color esperado) {
            this.actual = actual;
            this.esperado = esperado;
        }
}
