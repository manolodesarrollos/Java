/*
Ejemplo basico de serialización
La serialización binaria en Java se basa en las clases ObjectOutputStream 
y ObjectInputStream, que proporcionan métodos para escribir y leer objetos 
en formato binario. 
 */
package Serializacion;

/**
 *
 * @author Manolo Pajaro
 */
import java.io.*;
import java.util.*;


public class Empleado implements Serializable {
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }
    public String toString() {
        return "Nombre: " + nombre + ", Salario: " + salario;
    }
    
}