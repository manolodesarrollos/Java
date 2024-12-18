/**
 * Clase que permite la consulta de registro en un archivo plano
 */
package ManejoArchivos_Avanzado;

/**
 *
 * @author Manolo Pajaro Borras
 */ 

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ConsultaRegistro {
    public void consultarRegistros(String archivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
 
