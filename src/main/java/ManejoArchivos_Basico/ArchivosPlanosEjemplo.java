/**
 *  ejemplo sobre el manejo de archivos planos
 */
package ManejoArchivos_Basico;

/**
 *
 * @author Manolo Pajaro Borras
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivosPlanosEjemplo {

    public static void main(String[] args) {
        // Lectura del archivo y conteo de líneas y palabras
        int lineCount = 0;
        int wordCount = 0;
        
        try (BufferedReader reader = new BufferedReader(new FileReader("tabla.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++; // lineCount = lineCount+1
                String[] words = line.split(" ");
                wordCount += words.length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Escritura de resultados en el archivo de salida
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("salida.txt"))) {
            writer.write("Número de líneas: " + lineCount);
            writer.newLine();
            writer.write("Número de palabras: " + wordCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        System.out.println("Proceso completado. Verifica el archivo 'salida.txt'.");
    }
}
