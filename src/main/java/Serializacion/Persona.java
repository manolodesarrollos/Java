/**
 * Segundo Taller aplicando el el concepto de serializacion
*/
package Serializacion;

/**
 *
 * @author Manolo Pajaro
 */
import java.io.*;

class Persona implements Serializable {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
