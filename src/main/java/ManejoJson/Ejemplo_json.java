/**
 * Ejemplo Basico  sobre manejo de json para la creacion de un crud
 
*/
package ManejoJson;
//  se insertan las librerias necesarias
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.google.gson.Gson;

public class Ejemplo_json 
{
    private static List<String> librosJson = new ArrayList<>();
    private static int siguienteId = 1;
    private static Scanner leer = new Scanner(System.in);
    private static Gson gson = new Gson();
    
    public static void main(String[] args) {
        boolean salir = false;
        while (!salir) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Listar libros");
            System.out.println("2. Agregar libro");
            System.out.println("3. Actualizar libro");
            System.out.println("4. Eliminar libro");
            System.out.println("5. Salir");
            int opcion = leer.nextInt();
            leer.nextLine(); // Consumir la nueva línea después de leer el número  
            
            switch (opcion) {
                case 1:
                    listarLibros();
                    break;
                case 2:
                    agregarLibro();
                    break;
                case 3:
                    actualizarLibro();
                    break;
                case 4:
                    eliminarLibro();
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida");
            }            
        }
    }
    private static  void listarLibros() 
    {
        System.out.println("Listado de libros:");
        for (String libroJson : librosJson) {
            Libro libro = gson.fromJson(libroJson, Libro.class);
            System.out.println(libro.getId() + ": " + libro.getTitulo() + " - " + libro.getAutor() + " (" + libro.getAnioPublicacion() + ")");
        }
    }

    private static void agregarLibro() {
        System.out.println("Ingrese el título del libro:");
        String titulo = leer.nextLine();
        System.out.println("Ingrese el autor del libro:");
        String autor = leer.nextLine();
        System.out.println("Ingrese el año de publicación del libro:");
        int anioPublicacion = leer.nextInt();
        leer.nextLine(); // Consumir la nueva línea después de leer el año de publicación

        Libro libro = new Libro(siguienteId++, titulo, autor, anioPublicacion);
        String libroJson = gson.toJson(libro);
        librosJson.add(libroJson);
        System.out.println("Libro agregado correctamente");
    }

    private static void actualizarLibro() {
        System.out.println("Ingrese el ID del libro a actualizar:");
        int id = leer.nextInt();
        leer.nextLine(); // Consumir la nueva línea después de leer el ID

        int index = buscarIndiceLibroPorId(id);
        if (index != -1) {
            System.out.println("Ingrese el nuevo título del libro:");
            String titulo = leer.nextLine();
            System.out.println("Ingrese el nuevo autor del libro:");
            String autor = leer.nextLine();
            System.out.println("Ingrese el nuevo año de publicación del libro:");
            int anioPublicacion = leer.nextInt();
            leer.nextLine(); // Consumir la nueva línea después de leer el año de publicación

            Libro libro = new Libro(id, titulo, autor, anioPublicacion);
            String libroJson = gson.toJson(libro);
            librosJson.set(index, libroJson);
            System.out.println("Libro actualizado correctamente");
        } else {
            System.out.println("Libro no encontrado");
        }
    }

    private static void eliminarLibro() {
        System.out.println("Ingrese el ID del libro a eliminar:");
        int id = leer.nextInt();
        leer.nextLine(); // Consumir la nueva línea después de leer el ID

        int index = buscarIndiceLibroPorId(id);
        if (index != -1) {
            librosJson.remove(index);
            System.out.println("Libro eliminado correctamente");
        } else {
            System.out.println("Libro no encontrado");
        }
    }

    private static int buscarIndiceLibroPorId(int id) {
        for (int i = 0; i < librosJson.size(); i++) {
            Libro libro = gson.fromJson(librosJson.get(i), Libro.class);
            if (libro.getId() == id) {
                return i;
            }
        }
        return -1;
    }  

}

