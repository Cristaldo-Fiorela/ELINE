package modelo.persona;

public class Persona {
    private  int DNI;
    private  String nombre;
    private  String apellido;
    private  String telefono;
    private  String correo;

    public Persona() {
    }

    public Persona(int DNI, String nombre, String apellido, String telefono, String correo) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getDNI() {
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

    public void setDNI(int DNI) {
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

    @Override
    public String toString() {
        return  DNI + "," + nombre + "," + apellido + "," + telefono + "," + correo;
    }
    
    
}
