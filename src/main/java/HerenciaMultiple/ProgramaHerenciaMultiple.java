/**
 * 
 */
package HerenciaMultiple;

/**
 *
 * @author Manolo
 */
public class ProgramaHerenciaMultiple 
{
        public static void main(String[] args) {
        // Creamos un objeto de la subclase "Perro"
        Perro perro = new Perro();
        // Creamos un objeto de la subclase "Gato"
        Gato gato = new Gato();
        // Creamos un objeto de la subclase "Loro"
    //    Loro loro = new Loro();
        
        // Llamamos a los métodos de las superclases y de la subclase
        perro.comer();
        perro.jugar();
        perro.ladrar();
    }

}
