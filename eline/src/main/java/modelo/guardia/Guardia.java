package modelo.guardia;

import java.time.LocalDate;

/* 
    C - vamos a poder crear
    R - vamos a poder leer datos
    U - veremos...
    D - vamos a poder borrar por ID

    guardia debe abrir el archivo de persona, turno.
    colocar en UI planilla un sector para eliminar guardia por ID
*/

public class Guardia {
    private int id_guardia;
    private String persona;  
    private String turno;
    private String sector;
    private LocalDate fecha;

    public Guardia() {
    }

    public Guardia(int id_guardia, String persona, String turno, String sector, LocalDate fecha) {
        this.id_guardia = id_guardia;
        this.persona = persona;
        this.turno = turno;
        this.sector = sector;
        this.fecha = fecha;
    }

    public int getId_guardia() {
        return id_guardia;
    }

    public void setId_guardia(int id_guardia) {
        this.id_guardia = id_guardia;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

  

    @Override
    public String toString() {
        return  id_guardia + "," + persona + "," + turno + "," + sector + "," + fecha;
    }


}
