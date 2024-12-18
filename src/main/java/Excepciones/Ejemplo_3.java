/**
 * Excepciones verificadas (Checked Exceptions):
 * Lectura de un archivo inexistente:
java

 */
package Excepciones;

/**
 *
 * @author Manolo Pájaro
 */
import java.io.*;
public class Ejemplo_3 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("archivo.txt"));
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado.");
        } catch (IOException e) {
            System.out.println("Error: Problema de lectura del archivo.");
        }
    }
}


