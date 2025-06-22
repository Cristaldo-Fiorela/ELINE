package modelo.persona;

public class Especialidad {
    private int ID_Especialidad;
    private String descripcion;

    public Especialidad() {
    }

    public Especialidad(int ID_Especialidad, String descripcion) {
        this.ID_Especialidad = ID_Especialidad;
        this.descripcion = descripcion;
    }

    public int getID_Especialidad() {
        return ID_Especialidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setID_Especialidad(int ID_Especialidad) {
        this.ID_Especialidad = ID_Especialidad;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
