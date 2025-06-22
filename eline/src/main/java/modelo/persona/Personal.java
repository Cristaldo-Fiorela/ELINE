package modelo.persona;

public class Personal extends Persona {
    private Especialidad especialidad; // acceso a objeto entero de especialidad. Se puede asignar un objeto entero desde el uso de este atributo (1, "Enfermero")

    public Personal() {
        super(); // llama a constructor de Persona
    }

    public Personal(int ID_Especialidad, Especialidad especialidad, String DNI, String nombre, String apellido, String telefono, String correo) {
        super(DNI, nombre, apellido, telefono, correo);
        this.especialidad = especialidad;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
}
