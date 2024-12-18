/**
 * Ejemplo Basico de herencia simple

*/
package HerenciaBasica;

/**
 *
 * @author Manolo Pajaro
 */
//public class Persona // Definimos la superclase "Persona"
public class Persona {
    public String nombre;
    private int edad ;
    public String genero;

    
    public Persona(String _nombre, int _edad, String _genero) {
        this.nombre = _nombre;
        this.edad = _edad;
        this.genero = _genero;
    }

    public void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }
    public void caminar(){
        System.out.println("Hola soy " + nombre+ " y estoy camminando");
    }
    public void hablar(){
        System.out.println("hola soy: "+ nombre+ "estoy hablando en ingles "+"soy de genero: " + genero);
    }
}   


