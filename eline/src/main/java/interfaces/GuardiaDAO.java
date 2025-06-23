
package interfaces;

import java.util.List;
import modelo.guardia.Guardia;


public interface GuardiaDAO {
   public void guardarGuardia(Guardia guardia);
   public List<Guardia> listarGuardias();
}
