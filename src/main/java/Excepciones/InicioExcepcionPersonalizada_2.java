/*
  Clases de inicio  principal 
  Primeramente, con este codigo, mostraremos un mensaje personalizado, 
  utilizando el 2do el segundo constructor.
 */
package Excepciones;
import java.util.*;
/**
 *
 * @author Manolo
 */
public class InicioExcepcionPersonalizada_2 {
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
                 
                // Lanzamos la excepción con un mensaje personalizado
                throw new ExcepPersonalizadas_2("Debes introducir un número");
            }
        }
         
        // En caso de error mostramos ese mensaje personalizado
        catch(ExcepPersonalizadas_2 e) {
            System.out.println(e.getMessage());
        }
        finally { // Finalmente, tanto si se produce error
            // como si no, cerramos el objeto lectura
            lectura.close();
        }
    }
}
