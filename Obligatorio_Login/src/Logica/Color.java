/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Logica;

/**
 *
 * @author Franco Carreras
 */
public enum Color {
    Red,
    Blue,
    Green,
    Yellow,
    Wild;
    
    private static final Color[] colores = Color.values();
    
    public static Color getColor(int i) {
        return Color.colores[i];
    }
}
