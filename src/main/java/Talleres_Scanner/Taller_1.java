/**
 * Mi primer acercamiento en Java utilizando Apache Netbeans
 * y capturando  informacion por teclado

 */

package Talleres_Scanner;

import java.util.*;


/**
  * @author Manolo Pájaro
 */
public class Taller_1 {
    public static void main(String[] args)
    {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num=leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2=leer.nextInt();

        // invocando metodos

        sumar(num,num2);
        Taller_1 objResta = new Taller_1();
        Taller_1 objMult = new Taller_1();
        Taller_1 objDiv = new Taller_1();
        System.out.println("la respuesta de la resta es "+objResta.resta(num,num2) );
        System.out.println("la respuesta de la multiplicacion es "+objMult.multiplicacion(num,num2) );
        System.out.println("la respuesta de la Division es es "+objDiv.division(num, num2) );
        // operaciones matematicas
    }
   public static void sumar(int a,int b) {
        int suma=a+b;
        System.out.println("la suma es "+suma);
   }

   public int resta(int a,int b){
        int resta=a-b;
        return resta;
   }

   private int multiplicacion(int a,int b){
        int multiplicacion=a*b;
        return multiplicacion;
   }

   int division(int a,int b){
        int division=a/b;
        return division;

   }
}
