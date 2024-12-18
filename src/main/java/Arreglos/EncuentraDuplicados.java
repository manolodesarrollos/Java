/**
 * Escribe un programa que tome como entrada un arreglo de enteros y
 * encuentre el primer elemento duplicado en el arreglo.
 * Si no hay ningún elemento duplicado, el programa deberá imprimir 
 * un mensaje indicando que no se encontraron duplicados.
 * si el arreglo de entrada es [1, 3, 5, 2, 3, 7] debe imprimir el primer
 * elemento duplicado  3 pero si qse quita el elelemto duplicado  debe 
 * imprimir  "no se ncontrron elementos duplicados"
* 
 */
package Arreglos;

/**
 *
 * @author Manolo
 */
public class EncuentraDuplicados {
    public static void main(String[] args) {
        int[] arreglo = {1, 3, 5, 2, 6, 7};
        int duplicado = encontrarDuplicado(arreglo);
        
        // preguntamos  si hay duplicado
        if (duplicado != -1) {
            System.out.println("El primer elemento duplicado es: " + duplicado);
        } else {
            System.out.println("No se encontraron elementos duplicados.");
        }
        
    }

private static int encontrarDuplicado(int[] arreglo) {
    boolean[] elementosVistos = new boolean[arreglo.length + 1];
    for (int elemento : arreglo) {
        System.out.println("Elemento actual: " + elemento);
        if (elemento > arreglo.length || elemento < 1) {
            System.err.println("Valor fuera de rango: " + elemento);
            return -1;
        }
        if (elementosVistos[elemento]) {
            return elemento;
        }
        elementosVistos[elemento] = true;
    }

    return -1; // Si no se encontraron duplicados
    }
}


