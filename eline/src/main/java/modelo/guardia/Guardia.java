package modelo.guardia;

import java.time.LocalDate;

public class Guardia {
    private int id_guardia;
    private int id_ambulancia;    
    private int id_sector;
    private String observacion_guardia;
    private String matricula;
    private String descripcion_sector;
    private String ubicacion;
    private LocalDate fecha;
    private Turno turno;

    public Guardia() {
    }

    /*
    //aca iria como en la tabla y el txt
    @Override
    public String toString() {
        return  id_guardia + "," + persona + "," + sector + "," + turno + "," + ambulancia + "," + fecha_turno;
    }
    
    */

    public Guardia(int id_guardia, int id_ambulancia, int id_sector, String observacion_guardia, String matricula, String descripcion_sector, String ubicacion, LocalDate fecha, Turno turno) {
        this.id_guardia = id_guardia;
        this.id_ambulancia = id_ambulancia;
        this.id_sector = id_sector;
        this.observacion_guardia = observacion_guardia;
        this.matricula = matricula;
        this.descripcion_sector = descripcion_sector;
        this.ubicacion = ubicacion;
        this.fecha = fecha;
        this.turno = turno;
    }

    public int getId_guardia() {
        return id_guardia;
    }

    public int getId_ambulancia() {
        return id_ambulancia;
    }

    public int getId_sector() {
        return id_sector;
    }

    public String getObservacion_guardia() {
        return observacion_guardia;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getDescripcion_sector() {
        return descripcion_sector;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setId_guardia(int id_guardia) {
        this.id_guardia = id_guardia;
    }

    public void setId_ambulancia(int id_ambulancia) {
        this.id_ambulancia = id_ambulancia;
    }

    public void setId_sector(int id_sector) {
        this.id_sector = id_sector;
    }

    public void setObservacion_guardia(String observacion_guardia) {
        this.observacion_guardia = observacion_guardia;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setDescripcion_sector(String descripcion_sector) {
        this.descripcion_sector = descripcion_sector;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }
}
