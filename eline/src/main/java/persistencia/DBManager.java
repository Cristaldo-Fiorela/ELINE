package persistencia;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/*
    Utilizacion de patron singleton para una instancia unica de DB y dar acceso global del mismo a todo el proyecto.
*/
public class DBManager {
    // ruta donde estan los archivos
    public static final String RUTA_RAIZ = "data/";

    // nombre de archivos
    public static final String TURNOS_FILE = "turnos.txt";    
    public static final String ESPECIALIDADES_FILE = "especialidades.txt";
    public static final String PERSONAL_FILE = "personal.txt";

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
        return RUTA_RAIZ + nombre_archivo;
    }
    
    public boolean existeArchivo(String nombre_archivo) {
        return Files.exists(Paths.get(getRutaCompleta(nombre_archivo)));
    }
    
    public List<String> leerTodasLinesArchivo(String nombre_archivo) {
        try {
            return Files.readAllLines(Paths.get(getRutaCompleta(nombre_archivo)));
        } catch (Exception e) {
            System.err.println("Error al leer archivo: " + e.getMessage());
            // Devuelve lista vacía en caso de error
            return new ArrayList<>(); 
        }
    }
        
    public void agregarLineaAlFinal(String ruta_archivo, Object linea) {
        try (
                FileWriter fw = new FileWriter(getRutaCompleta(ruta_archivo), true);
                PrintWriter pw = new PrintWriter(fw)
            ) {   
            pw.println(linea);
        } catch (Exception e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
    
    public void escribirTodoArchivo(String ruta_archivo, List<String> lineas) {
        // escribir el txt linea por linea
        try (PrintWriter writer = new PrintWriter(new FileWriter(getRutaCompleta(ruta_archivo)))) {
            for (String linea : lineas) {
                writer.println(linea);
            }
        } catch (Exception e) {
            System.out.println("Error en escribirTodoArchivo: " + e.getMessage());
        }
    }

}
