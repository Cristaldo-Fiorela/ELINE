package modelo.persona;

public class Persona {
    private  int DNI;
    private  String nombre;
    private  String apellido;
    private  String telefono;
    private  String correo;    
    private int ID_Especialidad;
    private String descripcion;

    public Persona() {
    }

    public Persona(int DNI, String nombre, String apellido, String telefono, String correo, int ID_Especialidad, String descripcion) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.ID_Especialidad = ID_Especialidad;
        this.descripcion = descripcion;
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

    public String getDescripcion() {
        return descripcion;
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

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

   
    /*
    @Override
    public String toString() {
        return  DNI + "," + nombre + "," + apellido + "," + telefono + "," + correo;
    }
    
    */
}
