/**
 *  Programa de arranque 
 */
package Multinivel;

/**
 *
 * @author Manolo
 */
public class ProgramaHerenciaMultinivel 
{
        public static void main(String[] args) {
        // Creamos un objeto de la subclase "Perro"
        Perro perro = new Perro();
        Ornitorrinco  oOrnitorrinco = new Ornitorrinco();

        // Llamamos a los métodos de las superclases y de la subclase
        perro.comer();
        perro.ladrar();
        oOrnitorrinco.comer();
        }
}
