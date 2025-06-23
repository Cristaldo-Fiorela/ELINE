
package servicios;

import dao.impl.EspecialidadDAOImpl;
import interfaces.EspecialidadDAO;
import java.util.List;
import modelo.persona.Especialidad;


public class EspecialidadService {
    private final EspecialidadDAO dao= new EspecialidadDAOImpl();
    
    public void guardarEspecialidad(Especialidad especialidad)throws Exception{
        if(especialidad.getDescripcion()==null || especialidad.getDescripcion().isEmpty()){
            throw new Exception("No puede estar vacio");
        }
        dao.guardarEspecialidad(especialidad);
        
    }
    
    public List<Especialidad> listarTodos(){
        return dao.listarTodos();
    }
}
