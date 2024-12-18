/*
Creando archivos en forma basica
 */
package ManejoArchivos_Basico;

/**
 *
 * @author Manolo
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
public class CrearArchivo {
    public static void main(String ars[]){
        try {
            String ruta = "H:\\Solo_Java\\Politecnico\\Talleres_basicos_herencia\\manolo.txt";
            String contenido = "Contenido de ejemplo para pruebas de manolo";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

