/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplojava;

/**
 *
 * @author CarlosAlfredo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente cliente = new Cliente(1, "Carlos Alfredo", "Osorio Pérez", "12345678", true, "Av. Nose 125", "270002", "948304096", "aries_10227@hotmail.com");
        Cliente cliente1 = new Cliente(2, "Nelida Janeth", "Valencia Cerna", "12345678", true, "Av. mouse 125", "206385", "948506274", "neli@gmail.com");
        
        System.out.println("CLIENTE 1 : "+cliente.getCodigo() + cliente.getNombre() + cliente.getApellido() + cliente.getDni() + cliente.isActivo() + cliente.getDireccion() + cliente.getTelefono() + cliente.getCelular() + cliente.getCorreo());
        System.out.println("CLIENTE 2 : "+cliente1.getCodigo() + cliente1.getNombre() + cliente1.getApellido() + cliente1.getDni() + cliente1.isActivo() + cliente1.getDireccion() + cliente1.getTelefono() + cliente1.getCelular() + cliente1.getCorreo());
        
        Empleado empleado = new Empleado(5, 1, "Jose", "Lopez Huaman", "12587496", true, "Av. los angeles 125", "272258", "948305871", "kiss@gmail.com");
        Empleado empleado1 = new Empleado(10, 2, "Miguel", "Vega Pérez", "12587496", true, "Av. los motufar 475", "256987", "873029685", "miguel@gmail.com");
        
        System.out.println("EMPLEADO 1 : "+empleado.getTiempoDeServicio() + empleado.getCodigo() + empleado.getNombre() + empleado.getApellido() + empleado.getDni() + empleado.isActivo() + empleado.getDireccion() + empleado.getTelefono() + empleado.getCelular() + empleado.getCorreo());
        System.out.println("EMPLEADO 2 : "+empleado1.getTiempoDeServicio() + empleado1.getCodigo() + empleado1.getNombre() + empleado1.getApellido() + empleado1.getDni() + empleado1.isActivo() + empleado1.getDireccion() + empleado1.getTelefono() + empleado1.getCelular() + empleado1.getCorreo());
        System.out.println("Sueldo Empleado 1 : "+empleado.calcularSueldo());
        System.out.println("Sueldo Empleado 2 : "+empleado1.calcularSueldo());
                
    }
    
}
