/**
 * En este ejemplo  trabajaremos el concepto de Excepciones no verificadas 
 * (RuntimeExceptions)
*/
package Excepciones;

/**
 *
 * @author Manolo
 */
public class Ejemplo_1 {
    public static void main(String[] args) {
        int numerador = 10;
        int denominador = 0;

        try {
            int resultado = numerador / denominador;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero.");
        }finally{
            if(denominador == 0){
                denominador = 1;
                int resultado = numerador / denominador;
                System.out.println("Resultado: " + resultado);}
            else {
                System.out.println("Operacion correcta");

                } 
            }
    }    
}
