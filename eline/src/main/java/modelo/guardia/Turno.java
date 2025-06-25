package modelo.guardia;

/*
    solo imprimir turno con datos emmet
    no va a tener: CRUD
    solo se va a poder LEER (read)
    nada de setter, solo getter
*/

public class Turno {
    private int id_turno;
    private TipoTurno tipo_turno;
    private int hora_inicio;
    private int hora_salida;

    public Turno() {
    }

    public Turno(int id_turno, TipoTurno tipo_turno, int hora_inicio, int hora_salida) {
        this.id_turno = id_turno;
        this.tipo_turno = tipo_turno;
        this.hora_inicio = hora_inicio;
        this.hora_salida = hora_salida;
    }

    public int getId_turno() {
        return id_turno;
    }

    public TipoTurno getTipo_turno() {
        return tipo_turno;
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

    public void setTipo_turno(TipoTurno tipo_turno) {
        this.tipo_turno = tipo_turno;
    }

    public void setHora_inicio(int hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public void setHora_salida(int hora_salida) {
        this.hora_salida = hora_salida;
    }
}
