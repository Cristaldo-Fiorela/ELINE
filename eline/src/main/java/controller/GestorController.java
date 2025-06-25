
package controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
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
            System.out.println("Error en encontrarUltimoIdTxt: " + e.getMessage());
        }
        return -1;
    }

    public void listarDatosTabla(JTable nombre_var_tabla, String[] columnasACrear, String ruta_archivo) {
        String[] columnas = columnasACrear;
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
        
        try {
            List<String> todasLasLineas = db.leerTodasLinesArchivo(ruta_archivo);
            
            for (String linea : todasLasLineas) {
                if(linea != null && !linea.trim().isEmpty()) {
                    String[] partes = linea.split(",");
                    
                    // tiene que haber en cada linea la misma cantidad de datos que columnas
                    if(partes.length >= columnas.length) {
                        Object[] fila = new Object[columnas.length];
                        for (int i = 0; i < columnas.length; i++) {
                            fila[i] = partes[i].trim();
                        }
                        
                        modelo.addRow(fila);
                    }
                }
            }
            nombre_var_tabla.setModel(modelo);
        } catch (Exception e) {
            System.out.println("Error al cargar datos en listarDatosTabla: " + e.getMessage());
            nombre_var_tabla.setModel(modelo); // tabla vacia
        }
        
    }

    public void eliminarElemento(String ruta_archivo, int id) {
        List<String> lineas = db.leerTodasLinesArchivo(ruta_archivo);
        List<String> lineasActualizadas = new ArrayList<>();

        for (String linea : lineas) {
            if(linea != null && !linea.trim().isEmpty()) {
                String[] partes = linea.split(",");
                if(Integer.parseInt(partes[0]) == id) {
                    continue; // ignora en la reescritura del archivo la linea con el ID que coincide.
                }
            }
            lineasActualizadas.add(linea); // las demas lineas las escribimos de nuevo
        }
        db.escribirTodoArchivo(ruta_archivo, lineasActualizadas);
    }    
}
