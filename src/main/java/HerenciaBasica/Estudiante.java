/**
 * Sublcase que hereda de Persona 
 
 */
package HerenciaBasica;

/**
 *
 * @author Manolo Pájaro
 */
// Definimos la subclase "Estudiante" que hereda de "Persona"

public class Estudiante extends Persona
{
    private String carrera;

    public Estudiante(String nombre, int edad, String genero, String carrera) {
        super(nombre, edad, genero);
        this.carrera = carrera;
    }


    public void estudiar() {
        System.out.println(nombre + " está estudiando " + carrera + " y tiene "+".");
    }
}


