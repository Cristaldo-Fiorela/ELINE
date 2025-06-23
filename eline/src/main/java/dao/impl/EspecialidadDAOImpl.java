
package dao.impl;

import interfaces.EspecialidadDAO;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import modelo.persona.Especialidad;


public class EspecialidadDAOImpl implements EspecialidadDAO {
      //ponemos el nombre al archivo
    private final String archivo = "especialidad.txt";

    @Override
    public void guardarEspecialidad(Especialidad especialidad) {
      //generamos un id autoincremental
        int nuevoId = generarNuevoId();
        Especialidad especialidadConID = new Especialidad(nuevoId, especialidad.getDescripcion());

        try (FileWriter fw = new FileWriter(archivo, true);
             PrintWriter pw = new PrintWriter(fw)) {
            pw.println(especialidadConID.toString());// guardamos en el archivo
        } catch (IOException e) {
            System.out.println("Error al guardar el cliente: " + e.getMessage());
        } 
    }

    @Override
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
}
