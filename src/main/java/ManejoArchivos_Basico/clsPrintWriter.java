/*
    2da opcion sobre el manejo de archivos planos
*/
package ManejoArchivos_Basico;

/**
 *
 * @author Manolo
 */
import java.io.PrintWriter;
public class clsPrintWriter {
    public static void main(String ars[]){
        try {
            PrintWriter writer = new PrintWriter("H:\\Solo_Java\\Politecnico\\Talleres_basicos_herencia\\archivox.txt", "UTF-8");  // ("/ruta/filename.txt", "UTF-8");
            writer.println("Primera línea");
            writer.println("Segunda línea");
            writer.println("Tercera Linea estamos en clase de java");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
