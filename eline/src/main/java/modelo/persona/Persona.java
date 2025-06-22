package modelo.persona;

public abstract class Persona {
    protected String DNI;
    protected String nombre;
    protected String apellido;
    protected String telefono;
    protected String correo;

    public Persona() {
    }

    public Persona(String DNI, String nombre, String apellido, String telefono, String correo) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
