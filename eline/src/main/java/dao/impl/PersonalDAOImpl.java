package dao.impl;

public class PersonalDAOImpl {
    //ponemos el nombre al archivo
    private final String archivo = "personal.txt";

    /*
    @Override
    public void guardarPersonal(Personal personal) {
     try (FileWriter fw = new FileWriter(archivo, true);
             PrintWriter pw = new PrintWriter(fw)) {
            pw.println(personal.toString());// guardamos en el archivo
        } catch (IOException e) {
            System.out.println("Error al guardar el cliente: " + e.getMessage());
        }
    }

    @Override
    public List<Personal> listarTodosPersonal() {
        List<Personal> listaPersonal = new ArrayList<>();

        try {
            File file = new File(archivo);
            if (!file.exists()) {
                return listaPersonal; // Si el archivo no existe devuelve lista vacía
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String linea;

            while ((linea = br.readLine()) != null) {
               // Aseguramos que la línea tenga el formato de la tabla
                String[] datos = linea.split(",");
                if (datos.length == 6) {
                    int dni = Integer.parseInt(datos[0]); //parseamos para que sea string
                    String nombre = datos[1];
                    String apellido = datos[2];
                    String telefono = datos[3];
                    String correo = datos[4];
                    Especialidad especialidad =new Especialidad(Integer.parseInt(datos[5]),datos[6]); // pasamos a un objeto de especialidad

                    Personal personal = new Personal(especialidad,dni,nombre,apellido,telefono,correo);
                    listaPersonal.add(personal);
                }
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return listaPersonal;
    }
    
    */
}
