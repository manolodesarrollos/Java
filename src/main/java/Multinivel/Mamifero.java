/**
 *  Clase que hereda directamente de animal 
 */
package Multinivel;

/**
 *
 * @author Manolo
 */
public class Mamifero implements Animal
{
    public void amamantar(){          
        System.out.println("Todo mamífero está amamantando.");
    }
    public void caracteristicas(){
        System.out.println("Regula la temperatura corporal, \\ Mandibula compuesta");
    }

    @Override
    public void comer() {
        System.out.println("El mamifero esta comiendo");    }

    @Override
    public void reproducirse() {
        System.out.println("El mamifero se esta reproduciendo");       
    }

    @Override
    public void dormir() {
        System.out.println("El mamifero esta durmiendo");
    }
    
}
