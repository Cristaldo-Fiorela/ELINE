
package controller;

import java.util.List;
import modelo.persona.Especialidad;
import persistencia.DBManager;

public class GestorController {
    DBManager db = DBManager.getInstancia();
    
    public void guardarNuevaEspecialidad(String especialidad_nombre) { 
        String rutaDB = DBManager.ESPECIALIDADES_FILE;
        int ultimoID = encontrarUltimoIdTxt(rutaDB);
        Especialidad nuevaEspecialidad;
        
        // si se encontro
        if(ultimoID != -1) {
            // creamos nueva especialidad!
            nuevaEspecialidad = new Especialidad(ultimoID + 1, especialidad_nombre);
        } else {
            int nuevoID = 1;
            nuevaEspecialidad = new Especialidad(nuevoID, especialidad_nombre);
        }
        
        db.agregarLineaAlFinal(rutaDB, nuevaEspecialidad);
    }
    
    public int encontrarUltimoIdTxt(String ruta_archivo) {
        try {
            List<String> lineas = db.leerTodasLinesArchivo(ruta_archivo);
            
            if(!lineas.isEmpty()) {
                String ultimaLinea = lineas.getLast();
                String[] seccionarLinea = ultimaLinea.split(",");
                return Integer.parseInt(seccionarLinea[0]);
            } else {
                return -1;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return -1;
    }

    
    /*
    private final EspecialidadService servicio = new EspecialidadService();
    private final String archivo = "especialidad.txt";

    
    public void guardarEspecialidad(Especialidad especialidad) {
      //generamos un id autoincremental
        int nuevoId = generarNuevoId();
        Especialidad especialidadConID = new Especialidad(nuevoId, especialidad.getNombre());

        try (FileWriter fw = new FileWriter(archivo, true);
             PrintWriter pw = new PrintWriter(fw)) {
            pw.println(especialidadConID.toString());// guardamos en el archivo
        } catch (IOException e) {
            System.out.println("Error al guardar el cliente: " + e.getMessage());
        } 
    }
    
    //  Genera un nuevo ID buscando el número más alto en el archivo y sumando 1
    private int generarNuevoId() {
        int maxId = 0;
        List<Especialidad> especialidades = listarTodos();

        for (Especialidad esp : especialidades) {
            if (esp.getID_Especialidad()> maxId) {
                maxId = esp.getID_Especialidad();
            }
        }
        return maxId + 1;
    }
  
    public List<Especialidad> listarTodos() {
      List<Especialidad> especialidades = new ArrayList<>();

        try {
            File file = new File(archivo);
            if (!file.exists()) {
                return especialidades; // Si el archivo no existe devuelve lista vacía
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");//separar por comas
                if (datos.length == 2) {
                    int id = Integer.parseInt(datos[0]);
                    String descripcion= datos[1];

                    Especialidad especialidad = new Especialidad(id,descripcion);
                    especialidades.add(especialidad);
                }
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return especialidades; }   
    
    
 
    public void guardarEspecialidad(Especialidad especialidad)throws Exception {
        if(especialidad.getDescripcion()==null || especialidad.getDescripcion().isEmpty()){
            throw new Exception("No puede estar vacio");
        }
        dao.guardarEspecialidad(especialidad);
        
    }
    
    public List<Especialidad> listarTodos(){
        return dao.listarTodos();
    }

  

  public void guardarEspecialidad(String descripcion) throws Exception{
     Especialidad esp = new Especialidad(0,descripcion);//creamos con id 0 , luego al mandar al servicio genera un id nuevo 
     servicio.guardarEspecialidad(esp);
     
  }
  
   // método para listar todas las especialidades
    public List<Especialidad> listarTodos() {
        return servicio.listarTodos();
    }
    */
    
}
