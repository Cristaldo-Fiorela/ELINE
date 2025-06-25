package modelo.guardia;

public enum TipoTurno {
    MANIANA("Turno mañana"),
    TARDE("Turno tarde"),
    NOCHE("Turno noche");
    
    private final String descripcion; // no puede cambiar

    private TipoTurno(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
}
