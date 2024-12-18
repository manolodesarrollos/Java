/**
 * Clase de inicio que activa el proceso de serialización
 */
package Serializacion;
import java.io.*;
import java.util.*;


/**
 *
 * @author Manolo
 */
public class clsInicioEmpleado {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();

        // Agregar empleados
        empleados.add(new Empleado("Juan", 50000));
        empleados.add(new Empleado("María", 60000));
        empleados.add(new Empleado("Isabella", 70000));


        // Serializar empleados
        try {
            FileOutputStream fileOut = new FileOutputStream("empleados.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(empleados);
            out.close();
            fileOut.close();
            System.out.println("Empleados serializados en empleados.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserializar empleados
        try {
            FileInputStream fileIn = new FileInputStream("empleados.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            List<Empleado> empleadosDeserializados = (List<Empleado>) in.readObject();
            in.close();
            fileIn.close();

            System.out.println("Empleados deserializados:");
            for (Empleado empleado : empleadosDeserializados) {
                System.out.println(empleado);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
