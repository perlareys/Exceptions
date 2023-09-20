/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Excepcion {
        crearPersona();
    }

    public static void crearPersona() {
        try {
            ingresarDatos();
        } catch (Excepcion | InputMismatchException ex) {
            System.out.println(ex.getMessage());
            crearPersona();
        }
    }

    public static void ingresarDatos() throws Excepcion, InputMismatchException {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresar nombre: ");
        String nombre = leer.nextLine();
        if (nombre.length() < 2) {
            throw new Excepcion("Nombre no válido. Ingresar nuevamente");
        }

        System.out.println("Ingrese edad: ");
        byte edad = leer.nextByte();
        if (edad < 0) {
            throw new Excepcion("Ingresar nuevamente");
        }
        System.out.println("DATOS INGRESADOS: "
                + "\n Nombre: " + nombre.toUpperCase()
                + "\n Edad: " + edad);
    }
}
