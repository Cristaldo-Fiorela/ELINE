package interfaces;

import java.util.List;
import modelo.persona.Especialidad;


public interface EspecialidadDAO {
    public void guardarEspecialidad(Especialidad especialidad);
    public List<Especialidad> listarTodos();
    
}
