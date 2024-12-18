/**
 * Clase para Agregar Registros (AgregarRegistros.java):
 */
package ManejoArchivos_Avanzado;
import java.io.*;

/**
 *
 * @author Manolo Pájaro
 */
public class AgregarRegistros {
    public void agregarRegistro(String archivo, String registro) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true))) {
            writer.write(registro);
            writer.newLine(); // salta una linea
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
 
