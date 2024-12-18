/**
 * Programa de arranque
 */
package HerenciaBasica;

/**
 *
 * @author Manolo
 */
// Programa principal
public class ProgramaHerencia {
    // se crea un metodo de arranque
    public static void main(String[] args) {
        // Creamos un objeto de la subclase "Estudiante"
        Estudiante estudiante = new Estudiante("Juan", 20, "Ingeniería","Masculino");

        // Llamamos a los métodos de la superclase y de la subclase
        estudiante.saludar();
        estudiante.estudiar();
    }
}

