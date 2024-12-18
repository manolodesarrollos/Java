/*
 * En este ejemplo vamos a ver como el código anterior, podría acortarse 
 * utilizando la palabra reservada throws. En este caso, introduciremos 
 * la cláusula throws en el método main para que se lance una excepcion
 * de tipo ArithmeticException si se divide entre cero.
 */
package Excepciones;
import java.util.*;
/**
 *
 * @author Manolo Pajaro
 */
public class ExcepcionesThrow {
    public static void main(String[] args) throws ArithmeticException{
        // Declaro un objeto Scanner para leer los datos
        Scanner lectura=new Scanner(System.in);
        /* Declaramos dos variables para almacenar dos números
         * y una tercera para almacenar el resultadode una división*/
        double primerNumero, segundoNumero, resultado;
         
        try { // Intentamos pedir y leer los dos números
             
            System.out.println("Introduce el primer número");
            primerNumero=lectura.nextDouble();
                 
            System.out.println("Introduce el segundo número");
            segundoNumero=lectura.nextDouble();
             
            // Si no hay errores dividimos los dos números
            resultado=primerNumero/segundoNumero;
             
            // Mostramos el resultado por pantalla.
            System.out.println("El resultado es " + resultado);
            // Si se divide entre cero
            // saltará la excepción ArithmeticException
             
        }
         
        // Si ocurre algun error. Por ejemplo que se escriban
        // letras en lugar de números saltará el mensaje del catch
        catch(Exception e) {
            // Mostramos el mensaje de la excepcion
            System.out.println(e.getMessage());
            lectura.close(); // Se cierra el objeto lectura
        }
         
        // Si no hay errores cerramos el objeto de lectura
        lectura.close();
    } 
}
