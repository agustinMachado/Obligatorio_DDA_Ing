/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Franco Carreras
 */
public class Carta {
    private final Color color;
    private final Valor valor;

    public Carta(final Color color, final Valor valor) {
        this.color = color;
        this.valor = valor;
    }

    public Color getColor() {
        return this.color;
    }

    public Valor getValor() {
        return this.valor;
    }

    @Override
    public String toString() {
        return color + "_" + valor;
    }
}
