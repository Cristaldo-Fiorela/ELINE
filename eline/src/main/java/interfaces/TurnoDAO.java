
package interfaces;

import java.util.List;
import modelo.guardia.Turno;

public interface TurnoDAO {
    public void guardarTurno(Turno turno);
    public List<Turno> listarTodos(); 
}
