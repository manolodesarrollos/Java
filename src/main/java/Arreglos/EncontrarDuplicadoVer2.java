/**
 * Version mejorada  de busqued de arreglo
 */
package Arreglos;

/**
 *
 * @author Manolo
 */
import java.util.HashSet;
import java.util.Set;

public class EncontrarDuplicadoVer2 {
    public static void main(String[] args) {
        int[] arreglo = {1, 3, 5, 2, 6, 7};

        int duplicado = encontrarDuplicadoVer2(arreglo);
        
        if (duplicado != -1) {
            System.out.println("El primer elemento duplicado es: " + duplicado);
        } else {
            System.out.println("No se encontraron elementos duplicados.");
        }
    }

    private static int encontrarDuplicadoVer2(int[] arreglo) {
        Set<Integer> elementosVistos = new HashSet<>();

        for (int elemento : arreglo) {
            if (!elementosVistos.add(elemento)) {
                return elemento;
            }
        }

        return -1; // Si no se encontraron duplicados
    }
}


