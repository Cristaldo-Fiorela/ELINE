package modelo.guardia;

import java.time.LocalDate;
import modelo.ambulancia.Ambulancia;
import modelo.persona.Persona;

public class Guardia {
    private int id_guardia;
    private Persona persona;
    private Sector sector;
    private Turno turno;
    private Ambulancia ambulancia;
    private LocalDate fecha_turno;

    public Guardia() {
    }

    public Guardia(int id_guardia, Persona persona, Sector sector, Turno turno, Ambulancia ambulancia, LocalDate fecha_turno) {
        this.id_guardia = id_guardia;
        this.persona = persona;
        this.sector = sector;
        this.turno = turno;
        this.ambulancia = ambulancia;
        this.fecha_turno = fecha_turno;
    }

    public int getId_guardia() {
        return id_guardia;
    }

    public Persona getPersona() {
        return persona;
    }

    public Sector getSector() {
        return sector;
    }

    public Turno getTurno() {
        return turno;
    }

    public Ambulancia getAmbulancia() {
        return ambulancia;
    }

    public LocalDate getFecha_turno() {
        return fecha_turno;
    }

    public void setId_guardia(int id_guardia) {
        this.id_guardia = id_guardia;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public void setAmbulancia(Ambulancia ambulancia) {
        this.ambulancia = ambulancia;
    }

    public void setFecha_turno(LocalDate fecha_turno) {
        this.fecha_turno = fecha_turno;
    }
}
