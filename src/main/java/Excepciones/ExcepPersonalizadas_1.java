/**
 * Excepcion personalizadas para una edad negativa
 
 */
package Excepciones;

/**
 *
 * @author Manolo Pajaro
 */
class EdadNegativaException extends Exception {
    public EdadNegativaException() {
        super("Error: La edad no puede ser negativa.");
    }
}

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) throws EdadNegativaException {
        if (edad < 0) {
            throw new EdadNegativaException();
        }
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

public class ExcepPersonalizadas_1 {
    public static void main(String[] args) {
        try {
            Persona persona = new Persona("Juan", 30);
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Edad: " + persona.getEdad());
        } catch (EdadNegativaException e) {
            System.out.println(e.getMessage());
        }
    }
}
