/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplojava;

/**
 * @author Osorio P�rez Carlos
 * @version 1.0
 * @created 25-feb-2015 09:00:35 p.m.
 */
public class Cliente extends Persona{
    
    public Cliente(int codigo, String nombre, String apellido, String dni, boolean activo, String direccion, String telefono, String celular, String correo) {
        super(codigo, nombre, apellido, dni, activo, direccion, telefono, celular, correo);
    }
    
    public Cliente(String nombre, String apellido, String dni, String direccion, String telefono, String celular, String correo) {
        super(nombre, apellido, dni, direccion, telefono, celular, correo);
    }
    
    
    
}
