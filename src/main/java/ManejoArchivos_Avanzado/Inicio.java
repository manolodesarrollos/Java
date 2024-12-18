/**
 * Esta clase se conoco como Clase de Inicio es la encargada
 * de ejecutar la accion para la manipulacion del registro en 
 * el archivo de texto
 */
package ManejoArchivos_Avanzado;

/**
 *
 * @author Manolo Pájaro Borrás
 */
public class Inicio {
    public static void main(String[] args) {
        // Nombre del archivo de texto
        String archivo = "registros.txt";

        // Crear instancias de las clases para agregar, consultar y eliminar registros
        AgregarRegistros adicReg = new AgregarRegistros();
        ConsultaRegistro leerReg = new ConsultaRegistro();
        EliminaRegistro elimReg = new EliminaRegistro();

        // Agregar registros al archivo
        adicReg.agregarRegistro(archivo, "Registro 1");
        adicReg.agregarRegistro(archivo, "Registro 2");
        adicReg.agregarRegistro(archivo, "Registro 3");

        // Consultar registros en el archivo
        System.out.println("Registros en el archivo:");
        leerReg.consultarRegistros(archivo);

        // Eliminar un registro del archivo
        String registroAEliminar = "Registro 2";
        elimReg.eliminarRegistro(archivo, registroAEliminar);

        // Consultar registros actualizados en el archivo
        System.out.println("\nRegistros en el archivo después de eliminar \"" + registroAEliminar + "\":");
        leerReg.consultarRegistros(archivo);
    }
}

