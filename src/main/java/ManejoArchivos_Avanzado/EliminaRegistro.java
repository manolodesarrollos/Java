/**
 * Clase que te permite eliminar un registro
 */
package ManejoArchivos_Avanzado;

/**
 *
 * @author Manolo Pajaro
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EliminaRegistro {

    public void eliminarRegistro(String archivo, String registroAEliminar) {
        try {
            List<String> lineas = new ArrayList<>();
            String linea;

            // Leer el archivo y omitir las líneas que coincidan con el registro
            // a eliminar
            BufferedReader reader = new BufferedReader(new FileReader(archivo));
            while ((linea = reader.readLine()) != null) {
                if (!linea.equals(registroAEliminar)) {
                    lineas.add(linea);
                }
            }
            reader.close();

            // Reescribir el archivo sin el registro eliminado
            BufferedWriter writer = new BufferedWriter(new FileWriter(archivo));
            for (String l : lineas) {
                writer.write(l);
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
