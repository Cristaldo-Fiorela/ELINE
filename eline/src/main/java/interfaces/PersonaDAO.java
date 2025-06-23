
package interfaces;

import java.util.List;
import modelo.persona.Persona;


public interface PersonaDAO {
    public void guardarPersona(Persona persona);
    public List<Persona> listarTodosPersona();
   
}
