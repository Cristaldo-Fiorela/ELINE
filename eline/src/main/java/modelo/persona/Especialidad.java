package modelo.persona;

public class Especialidad {
    private int ID_especialidad;
    private String nombre;

    public Especialidad() {
    }

    public Especialidad(int ID_especialidad, String nombre) {
        this.ID_especialidad = ID_especialidad;
        this.nombre = nombre;
    }

    public int getID_especialidad() {
        return ID_especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setID_especialidad(int ID_especialidad) {
        this.ID_especialidad = ID_especialidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // se sobreescribe el metodo de Java por defecto para mostrar los atributos que nos interesan
    @Override
    public String toString() {
        return ID_especialidad + "," + nombre;
    }
    
}
