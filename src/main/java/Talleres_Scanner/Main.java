/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Talleres_Scanner;

/**
 *
 * @author Manolo
 */
public class Main {

    public static void main(String[] args) {
        if(args.length > 0) {
            System.out.println("Argumentos recibidos:");
            for(int i = 0; i < args.length; i++) {
                System.out.println((i + 1) + ": " + args[i]);
            }
        } else {
            System.out.println("No se recibieron argumentos.");
        }
    }
}
 

