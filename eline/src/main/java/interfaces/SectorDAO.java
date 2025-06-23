
package interfaces;

import java.util.List;
import modelo.guardia.Sector;


public interface SectorDAO {
     public void guardarSector(Sector sector);
    public List<Sector> listarTodos();
}
