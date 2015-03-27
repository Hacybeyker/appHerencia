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
public class Empleado extends Persona{
    
    public int tiempoDeServicio;
    private final double SUELDO = 1000.0;    

    public Empleado(int tiempoDeServicio, int codigo, String nombre, String apellido, String dni, boolean activo, String direccion, String telefono, String celular, String correo) {
        super(codigo, nombre, apellido, dni, activo, direccion, telefono, celular, correo);
        this.tiempoDeServicio = tiempoDeServicio;
    }

    public Empleado(int tiempoDeServicio, String nombre, String apellido, String dni, String direccion, String telefono, String celular, String correo) {
        super(nombre, apellido, dni, direccion, telefono, celular, correo);
        this.tiempoDeServicio = tiempoDeServicio;
    }
    
    public int getTiempoDeServicio() {
        return tiempoDeServicio;
    }

    public void setTiempoDeServicio(int tiempoDeServicio) {
        this.tiempoDeServicio = tiempoDeServicio;
    }
    
    
    public double calcularSueldo(){
        double sueldo;
        if(tiempoDeServicio<=5)
            sueldo = SUELDO;
        else if(tiempoDeServicio<=10)
            sueldo = SUELDO+SUELDO*0.1;
        else 
            sueldo  =SUELDO+SUELDO*0.5;
        return sueldo;
    }
    
    
}
