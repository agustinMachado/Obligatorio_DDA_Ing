/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Logica;

/**
 *
 * @author Franco Carreras
 */
public enum Valor {
    Zero,
    One,
    Two,
    Three,
    Four,
    Five,
    Six,
    Seven,
    Eight,
    Nine,
    DrawTwo,
    Skip,
    Reverse,
    Wild,
    Wild_Four;
    
    private static final Valor[] valores = Valor.values();
    
    public static Valor getValor(int i) {
        return Valor.valores[i];
    }
}
