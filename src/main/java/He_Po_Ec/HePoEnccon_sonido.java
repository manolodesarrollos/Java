package He_Po_Ec;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

// Clase base Animal
abstract class Animal1 {
    private String nombre;

    public Animal1(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract void hacerSonido();

    protected void reproducirSonido(String archivoSonido) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(archivoSonido).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            System.out.println("Error al reproducir el sonido: " + ex.getMessage());
        }
    }
}

// Clase derivada Perro
class Perro1 extends Animal1 {
    public Perro1(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: ¡Guau guau!");
        reproducirSonido("perro.mp3");
    }
}

// Clase derivada Gato
class Gato1 extends Animal1 {
    public Gato1(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: ¡Miau miau!");
        reproducirSonido("gato.mp3");
    }
}

// Clase principal para probar el código
class TestAnimales1 {
    public static void main(String[] args) {
        Animal1 perrox = new Perro1("Rex");
        Animal1 gatox = new Gato1("Mimi");

        perrox.hacerSonido();
        gatox.hacerSonido();
    }
}
