package modelo.guardia;

public class Turno {
    private int id_turno;
    private String descripcion;
    private int hora_inicio;
    private int hora_salida;

    public Turno() {
    }

    public Turno(int id_turno, String descripcion, int hora_inicio, int hora_salida) {
        this.id_turno = id_turno;
        this.descripcion = descripcion;
        this.hora_inicio = hora_inicio;
        this.hora_salida = hora_salida;
    }

    public int getId_turno() {
        return id_turno;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getHora_inicio() {
        return hora_inicio;
    }

    public int getHora_salida() {
        return hora_salida;
    }

    public void setId_turno(int id_turno) {
        this.id_turno = id_turno;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setHora_inicio(int hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public void setHora_salida(int hora_salida) {
        this.hora_salida = hora_salida;
    }
}
