/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ControladoraLogica {
    ControladoraPersistencia CP = new ControladoraPersistencia();
    
    public void crearUsuario(Usuario usu) {
        CP.crearUsuario(usu);
    }
    
    public void eliminarUsuario(int id) {
        CP.eliminarUsuario(id);
    }
    
    public void editarUsuario(Usuario usu){
        CP.editarUsuario(usu);
    }
    
    public Usuario buscarUsuario(int id){
        return CP.buscarUsuario(id);
    }
    
    public List<Usuario> getListaUsuarios(){
        return CP.getListaUsuarios();
    }
}
