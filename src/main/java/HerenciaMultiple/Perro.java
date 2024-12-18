package HerenciaMultiple;

/**
 *
 * @author Manolo
 */
public class Perro extends  Mascota implements Animal
{
    public void ladrar() 
    {
        System.out.println("El perro está ladrando.");
    }

    @Override
    public  void comer() {
       System.out.println("El perro come Sancocho");
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

    
