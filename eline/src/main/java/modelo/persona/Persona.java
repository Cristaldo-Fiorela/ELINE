package modelo.persona;

/*
    PERSONA Y ESPECILIDAD DEBEN:
    C - vamos a poder crear
    R - vamos a poder leer datos
    U - NO vamos a poder
    D - vamos a poder borrar por ID

    controllador borrar tiene que recibir el nombre del archivo o tipo que debe borrar y id
    el select de especialidad debe de actualizarse cuando se cree una nueva especialidad.
*/

public class Persona {
    private  int DNI;
    private  String nombre;
    private  String apellido;
    private  String telefono;
    private  String correo;    
    private int ID_Especialidad;

    public Persona() {
    }

    public Persona(int DNI, String nombre, String apellido, String telefono, String correo, int ID_Especialidad, String descripcion) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.ID_Especialidad = ID_Especialidad;
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

    public int getID_Especialidad() {
        return ID_Especialidad;
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

    public void setID_Especialidad(int ID_Especialidad) {
        this.ID_Especialidad = ID_Especialidad;
    }

}
