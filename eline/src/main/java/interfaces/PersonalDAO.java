
package interfaces;

import java.util.List;
import modelo.persona.Personal;

public interface PersonalDAO {
    public void guardarPersonal(Personal personal);
    public List<Personal> listarTodosPersonal();
    
}
