package modelo.ambulancia;

public class Ambulancia {
    private int id_ambulancia;
    private String observacion;
    private String matricula;

    public Ambulancia() {
    }

    public Ambulancia(int id_ambulancia, String observacion, String matricula) {
        this.id_ambulancia = id_ambulancia;
        this.observacion = observacion;
        this.matricula = matricula;
    }

    public int getId_ambulancia() {
        return id_ambulancia;
    }

    public String getObservacion() {
        return observacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setId_ambulancia(int id_ambulancia) {
        this.id_ambulancia = id_ambulancia;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
