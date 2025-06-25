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
    private int id_persona;  
    private String turno;
    private String descripcionSector;
    private String ubicacionSector;  
    private LocalDate fecha;

    public Guardia() {
    }

    public Guardia(int id_guardia, int id_persona, int id_turno, String descripcionSector, String ubicacionSector, LocalDate fecha) {
        this.id_guardia = id_guardia;
        this.id_persona = id_persona;
        this.turno = turno;
        this.descripcionSector = descripcionSector;
        this.ubicacionSector = ubicacionSector;
        this.fecha = fecha;
    }

    public int getId_guardia() {
        return id_guardia;
    }

    public void setId_guardia(int id_guardia) {
        this.id_guardia = id_guardia;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getId_turno() {
        return turno;
    }

    public void setId_turno(int id_turno) {
        this.turno = turno;
    }

    public String getDescripcionSector() {
        return descripcionSector;
    }

    public void setDescripcionSector(String descripcionSector) {
        this.descripcionSector = descripcionSector;
    }

    public String getUbicacionSector() {
        return ubicacionSector;
    }

    public void setUbicacionSector(String ubicacionSector) {
        this.ubicacionSector = ubicacionSector;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return  id_guardia + "," + id_persona + "," + turno + "," + descripcionSector + "," + ubicacionSector + "," + fecha;
    }


}
