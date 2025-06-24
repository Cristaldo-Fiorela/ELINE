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
    private int id_ambulancia;    
    private int id_sector;
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

    public Guardia(int id_guardia, int id_ambulancia, int id_sector, LocalDate fecha, Turno turno) {
        this.id_guardia = id_guardia;
        this.id_ambulancia = id_ambulancia;
        this.id_sector = id_sector;
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

    public LocalDate getFecha() {
        return fecha;
    }

    public Turno getTurno() {
        return turno;
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

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    

}
