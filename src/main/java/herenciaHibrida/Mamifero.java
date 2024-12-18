/**
 * Clase Base que implimenta  la interfaz Animal
 */
package herenciaHibrida;

/**
 * @author Manolo
 */
public class Mamifero implements Animal{

    @Override
    public void comer() {
        System.out.println("El mamífero está comiendo...");  
    }   

    @Override
    public void dormir() {
        System.out.println("El mamífero está durmiendo...");
    }
    
}
