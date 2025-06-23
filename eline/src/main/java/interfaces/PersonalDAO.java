
package interfaces;

import java.util.List;
import modelo.persona.Personal;

public interface PersonalDAO {
    void guardarPersonal(Personal personal);
    List<Personal> listarTodosPersonal();
    
}
