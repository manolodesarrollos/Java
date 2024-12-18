/**
 *  Conversión de cadena a entero
*/
package Excepciones;

/**
 *
 * @author Manolo
 */
public class Ejemplo_4 {
    public static void main(String[] args) {
        String numeroStr = "123aaaa";

        try {
            int numero = Integer.parseInt(numeroStr);
            System.out.println("Número: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: No se puede convertir la cadena a entero.");
        }
    }
}

