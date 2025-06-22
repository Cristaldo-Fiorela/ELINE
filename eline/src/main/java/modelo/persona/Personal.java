package modelo.persona;

public class Personal extends Persona {
    private int ID_Especialidad; // fk de especialidad ID
    private Especialidad especialidad; // acceso a objeto entero de especialidad. Se puede asignar un objeto entero desde el uso de este atributo (1, "Enfermero")

    public Personal() {
        super(); // llama a constructor de Persona
    }

    public Personal(int ID_Especialidad) {
        this.ID_Especialidad = ID_Especialidad;
    }

    public Personal(int ID_Especialidad, Especialidad especialidad, String DNI, String nombre, String apellido, String telefono, String correo) {
        super(DNI, nombre, apellido, telefono, correo);
        this.ID_Especialidad = ID_Especialidad;
        this.especialidad = especialidad;
    }

    public int getID_Especialidad() {
        return ID_Especialidad;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setID_Especialidad(int ID_Especialidad) {
        this.ID_Especialidad = ID_Especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
}
