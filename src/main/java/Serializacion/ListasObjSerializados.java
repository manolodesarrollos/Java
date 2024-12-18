/*
* ----------------Serializacion
 */
package Serializacion;

/**
 *
 * @author Manolo
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Producto implements Serializable {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
   
}

/* utilizando el concepto de clases internas  se crea una clase de arranque 
*/

public class ListasObjSerializados {
    public static void main(String[] args) {
        // Creamos una lista de productos
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Portatil", 1200.50));
        productos.add(new Producto("Teléfono", 800.25));
        productos.add(new Producto("Tablet", 400.75));

        // Serialización de la lista de productos
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("productos.ser"));
            out.writeObject(productos);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialización de la lista de productos
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("productos.ser"));
            List<Producto> productosDeserializados = (List<Producto>) in.readObject();
            in.close();

            // Mostrar los productos deserializados
            for (Producto producto : productosDeserializados) {
                System.out.println("Nombre: " + producto.getNombre());
                System.out.println("Precio: " + producto.getPrecio());
                System.out.println("------------------------");
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

