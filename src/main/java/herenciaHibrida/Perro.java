/*
 Clase que hereda de Mamifero e implementa la interfaz Mascota
 */
package herenciaHibrida;

/**
 *
 * @author Manolo
 */
public class Perro extends Mamifero implements Mascota {

@Override
    public void jugar() {
        System.out.println("El perro está jugando...");    }
}
