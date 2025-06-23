
package interfaces;

import java.util.List;
import modelo.guardia.Guardia;


public interface GuardiaDAO {
    void guardarGuardia(Guardia guardia);
    List<Guardia> listarGuardias();
}
