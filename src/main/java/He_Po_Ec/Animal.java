/**
 * En este jercicio estamos practicando  la herencia el polimorfismo y la encapsulacion
 * Herencia: Las clases Perro y Gato heredan de la clase abstracta Animal.
 * Polimorfismo: Utilizamos el método hacerSonido() de manera polimórfica, ya que tanto
 * Perro como Gato tienen su propia implementación de este método.
 * Encapsulación: Los atributos de la clase Animal están encapsulados y se acceden a
 * través de métodos get y set.
 */
package He_Po_Ec;

// Clase base Animal
abstract class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract void hacerSonido(String sonido);
}

// Clase derivada Perro
class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido(String sonido) {
        System.out.println(getNombre() + " dice: " + sonido);
    }
}

// Clase derivada Gato
class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido(String sonido) {
        System.out.println(getNombre() + " dice: " + sonido);
    }
}

// Clase principal para probar el código
class TestAnimales {
    public static void main(String[] args) {
        Animal perro = new Perro("Rex");
        Animal gato = new Gato("Mimi");

        perro.hacerSonido("¡Guau guau!");
        gato.hacerSonido("¡Miau miau!");
    }
}

