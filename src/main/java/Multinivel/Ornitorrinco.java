/*
es mamifero y se reproduce por medio de huevos
*/
package Multinivel;

/**
 *
 * @author Manolo
 */
public class Ornitorrinco extends Mamifero implements Oviparo
    {

    @Override
    public void reproduceHuevos() {
        System.out.println("Se reproduce por medio de huevos");
    }
    
    }
