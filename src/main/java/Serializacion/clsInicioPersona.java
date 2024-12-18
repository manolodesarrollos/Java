/*Clase de inicio que activa la clase persona
*/
package Serializacion;

import java.io.*;


/**
 *
 * @author Manolo
 */
public class clsInicioPersona {
    public static void main(String[] args) {
        // Creamos un objeto Persona
        Persona persona = new Persona("Juan", 30);

        // Serialización del objeto
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("persona.ser"));
            out.writeObject(persona);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialización del objeto
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("persona.ser"));
            Persona personaDeserializada = (Persona) in.readObject();
            in.close();

            System.out.println("Nombre: " + personaDeserializada.getNombre());
            System.out.println("Edad: " + personaDeserializada.getEdad());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}