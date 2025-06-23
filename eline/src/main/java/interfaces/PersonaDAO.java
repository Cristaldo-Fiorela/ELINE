
package interfaces;

import java.util.List;
import modelo.persona.Persona;


public interface PersonaDAO {
    void guardarPersona(Persona persona);
    List<Persona> listarTodosPersona();
   
}
