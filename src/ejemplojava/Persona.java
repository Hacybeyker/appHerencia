package ejemplojava;

/**
 * @author Osorio P�rez Carlos
 * @version 1.0
 * @created 25-feb-2015 09:00:35 p.m.
 */
public abstract class Persona {

	protected int codigo;
	protected String nombre;
	protected String apellido;
	protected String dni;
	protected boolean activo;
	protected String direccion;
	protected String telefono;
	protected String celular;
	protected String correo;

    public Persona(int codigo, String nombre, String apellido, String dni, boolean activo, String direccion, String telefono, String celular, String correo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.activo = activo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.celular = celular;
        this.correo = correo;
    }

    public Persona(String nombre, String apellido, String dni, String direccion, String telefono, String celular, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.celular = celular;
        this.correo = correo;
        activo = true;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
        
        
}