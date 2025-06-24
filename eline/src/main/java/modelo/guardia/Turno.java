package modelo.guardia;

public class Turno {
    private int id_turno;
    private String descripcion_turno;
    private int hora_inicio;
    private int hora_salida;

    public Turno() {
    }

    public Turno(int id_turno, String descripcion_turno, int hora_inicio, int hora_salida) {
        this.id_turno = id_turno;
        this.descripcion_turno = descripcion_turno;
        this.hora_inicio = hora_inicio;
        this.hora_salida = hora_salida;
    }

    public int getId_turno() {
        return id_turno;
    }

    public String getDescripcion_turno() {
        return descripcion_turno;
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

    public void setDescripcion_turno(String descripcion_turno) {
        this.descripcion_turno = descripcion_turno;
    }

    public void setHora_inicio(int hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public void setHora_salida(int hora_salida) {
        this.hora_salida = hora_salida;
    }

    
}
