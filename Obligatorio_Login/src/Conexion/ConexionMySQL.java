/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Usuario
 */
public class ConexionMySQL {
    Connection cn;
    
    public Connection conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/obli_DDA_IngS","root","");
            System.out.println("CONECTADO");
        } catch (Exception ex){
            System.out.println("ERROR DE CONEXION BD: " + ex);
        }
        
        return cn;
    }
}
