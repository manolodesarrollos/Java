/**
 * 
 */
package HerenciaMultiple;


public class Gato extends  Mascota implements Animal
{
    public void Maullar() 
    {
        System.out.println("El Gato hace miau.");
    }

    @Override
    public  void comer() {
       System.out.println("El gato come cuido");
    }

    @Override
    public void duerme() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void emiteSonido() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}