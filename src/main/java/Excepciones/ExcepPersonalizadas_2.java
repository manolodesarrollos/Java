/*
Ejemplo avanzado en el uso de excepciones personalizadas
 */
package Excepciones;

/**
 *
 * @author Manolo
 */
/**
 * 
 * ESTA CLASE HEREDA DE LA CLASE EXCEPTION
 */
public class ExcepPersonalizadas_2 extends Exception{
    // Creamos una variable a nivel de clase
    private String mensajeDeError;
     
    /* Creamos un constructor sin parametros pero En el constructor 
       le asignamos un mensaje a la variable mensajeDeError. En este caso,
       En este primer constructor vamos a asignarle a la variable 
       mensajeDeError el mensaje: Error1 */

    public ExcepPersonalizadas_2() {
       this.mensajeDeError="Error 1";
    }
       
    /* Creamos un constructor que recibirá un parámetro
      de tipo String y le asignaremos a la variable
      mensajeDeError el valor del parametro. Este parametro
      es un mensaje que el usuario introducirá por teclado
      desde el método main */
     
    public ExcepPersonalizadas_2(String introduceMensaje) {
        // Asignamos el valor del paramentro a la variable mensajeError
        this.mensajeDeError=introduceMensaje;   
    }
     
    // Sobreescribimos el metodo getMessage de la clase Exception
    public String getMessage() {
        return mensajeDeError;
    }
}
