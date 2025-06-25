package persistencia;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
    Utilizacion de patron singleton para una instancia unica de DB y dar acceso global del mismo a todo el proyecto.
*/
public class DBManager {
    // ruta donde estan los archivos
    public static final String RUTA_RAIZ = "data/";

    // nombre de archivos
    public static final String TURNOS_FILE = "turnos.txt";
    
    // instancia singleton!!
    private static DBManager instancia;

    // constructor privado para patron singleton
    private DBManager() {
        // crear carpeta raiz si no existe
        crearCarpetaRaiz();
    }
    
    public static DBManager getInstancia() {
        if (instancia == null) {
            // si no existe crear nueva (Y UNICA) instancia
            instancia = new DBManager();
        }
        
        return instancia;
    }
    
    public void crearCarpetaRaiz() {
        try {
            Path ruta = Paths.get(RUTA_RAIZ);
            
            if(!Files.exists(ruta)) {
                Files.createDirectories(ruta);
            }
        } catch (Exception e) {
            System.out.println("Error crando directorio: " + e.getMessage());
        }
    }
    
    public String getRutaCompleta(String nombre_archivo) {
        return RUTA_RAIZ + TURNOS_FILE;
    }
    
    public boolean existeArchivo(String nombre_archivo) {
        return Files.exists(Paths.get(getRutaCompleta(nombre_archivo)));
    }
}
