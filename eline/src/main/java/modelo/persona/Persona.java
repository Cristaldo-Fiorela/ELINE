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
    private  String DNI;
    private  String nombre;
    private  String apellido;
    private  String telefono;
    private  String correo;    
    private  String especialidad;

    public Persona() {
    }

    public Persona(String DNI, String nombre, String apellido, String telefono, String correo, String ID_Especialidad) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.especialidad = ID_Especialidad;
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

    public String getEspecialidad() {
        return especialidad;
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

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return DNI + "," + nombre + "," + apellido + "," + telefono + "," + correo + "," + especialidad;
    }
    
}
