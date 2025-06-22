package modelo.guardia;

public class Sector {
    private int id_sector;
    private String descripcion;
    private String ubicacion;

    public Sector() {
    }

    public Sector(int id_sector, String descripcion, String ubicacion) {
        this.id_sector = id_sector;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
    }

    public int getId_sector() {
        return id_sector;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setId_sector(int id_sector) {
        this.id_sector = id_sector;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
