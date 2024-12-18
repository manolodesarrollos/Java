/*
   A la hora de lanzar esta excepción, también podemos usar
   el constructor sin parámetros
 */
package Excepciones;
import java.util.*;
/**
 *
 * @author Manolo Pájaro
 */
public class Inicio2ExcepcionPersonalizada_2 {
       public static void main(String[] args){
        // Declaro un objeto Scanner para leer los datos
        Scanner lectura=new Scanner(System.in); 
        // Declaramos una variables de tipo String
        //para almacenar un número
        String num1;
         
        try { // Intentamos
            // Pedir el número
            System.out.println("Introduce el primer número");
            // Leer el número 1
            num1=lectura.nextLine();
             
            // Si la variable esta vacía
            if(num1.isEmpty()) {
                 
                // Lanzamos la excepción con el primer constructor
                throw new ExcepPersonalizadas_2();
            }
        }
         
        // En caso de error mostramos el mensaje del primer constructor
        catch(ExcepPersonalizadas_2 e) {
            System.out.println(e.getMessage());
        }
        finally { // Finalmente, tanto si se produce error
            // como si no, cerramos el objeto lectura
            lectura.close();
        }
    }
}
