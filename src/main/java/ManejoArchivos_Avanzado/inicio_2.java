/**
 * En esta clase se procede a utilizar el objeto sccaner para capturturar un registro
 * por teclado
 */
package ManejoArchivos_Avanzado;

/**
 *
 * @author Manolo Pajaro
 */

import java.util.Scanner;

public class inicio_2 {

    public static void main(String[] args) {
        // Nombre del archivo de texto
        String archivo = "registros.txt";

        // Crear instancias de las clases para agregar, consultar y eliminar registros
        AgregarRegistros adicReg = new AgregarRegistros();
        ConsultaRegistro leerReg = new ConsultaRegistro();
     // ModificaRegistro modReg =  new ModificaRegistro();
        EliminaRegistro  elimReg = new EliminaRegistro();

        // Crear un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Menú de opciones
        int opcion;
        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Agregar registro");
            System.out.println("2. Consultar registros");
            System.out.println("3. Modificar registro");
            System.out.println("4. Eliminar registro");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después de la entrada del número

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese el registro a agregar: ");
                    String registroAAgregar = scanner.nextLine();
                    adicReg.agregarRegistro(archivo, registroAAgregar);
                    System.out.println("Registro agregado con éxito.");
                }
                //hasta aqui llegue explicando la grabacion




                
                case 2 -> {
                    System.out.println("Registros en el archivo:");
                    leerReg.consultarRegistros(archivo);
                }
                case 3 -> {
                    System.out.print("Ingrese el registro a Modificar: ");
                    String registroAEliminar = scanner.nextLine();
                    elimReg.eliminarRegistro(archivo, registroAEliminar);
                    System.out.println("Registro eliminado con éxito.");
                    break;
                }
                case 4 -> {
                    System.out.print("Ingrese el registro a eliminar: ");
                    String registroAEliminar = scanner.nextLine();
                    elimReg.eliminarRegistro(archivo, registroAEliminar);
                    System.out.println("Registro eliminado con éxito.");
                }
                
                case 5 -> System.out.println("Saliendo del programa.");
                
                default -> System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 5);

        // Cerrar el objeto Scanner al finalizar
        scanner.close();
    }
}
