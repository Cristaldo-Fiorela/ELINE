package interfaces;

import java.util.List;
import modelo.ambulancia.Ambulancia;


public interface AmbulanciaDAO {
     public void guardarAmbulancia(Ambulancia ambulancia);
    public List<Ambulancia> listarTodos();
    
}
