/**
 * Clase que permite la Modificacion de un registro en el archivo de texto
 */
package ManejoArchivos_Avanzado;

/**
 *
 * @author Manolo Pajaro
 */

import java.io.*;
import java.util.*;

public class ModificarRegistro {
   
    public void modificarRegistro(String archivo, String registroAModificar, 
            String nuevoContenido) {
        try {
            List<String> lineas = new ArrayList<>();
            String linea;

            // Leer el archivo y realizar la modificación
            BufferedReader reader = new BufferedReader(new FileReader(archivo));
            while ((linea = reader.readLine()) != null) {
                if (linea.equals(registroAModificar)) {
                    lineas.add(nuevoContenido); // Agregar el nuevo contenido en lugar del registro antiguo
                } else {
                    lineas.add(linea); // Mantener las demás líneas sin cambios
                }
            }
            reader.close();

            // Reescribir el archivo con las modificaciones
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

