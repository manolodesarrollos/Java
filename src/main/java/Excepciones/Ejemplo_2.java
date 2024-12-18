/*
Indice fuera de rango dentro de un arreglo
*/
package Excepciones;

/**
 *
 * @author Manolo
 */
public class Ejemplo_2 {

    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3};

        try {
            System.out.println(arreglo[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de rango.");
        }
    }

}
