/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Perla
 */
public class Juego {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int aleatorio = new Random().nextInt(500) + 1;
        int intentos = 0;
        System.out.println("¡QUE COMIENCE EL JUEGO!");

        while (true) {
            try {
                System.out.println("Adivine el número.");
                System.out.println("Ingrese un número: ");
                int adivinar = leer.nextInt();
                intentos++;

                if (adivinar == aleatorio) {
                    System.out.println("Felicidades, adivinaste el número");
                    break;
                } else if (adivinar > aleatorio) {
                    System.out.println("El número a adivinar en menor");
                } else {
                    System.out.println("El número a adivinar en mayor");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: El número ingresado no es válido");
                intentos++;
            }
        }
        System.out.println("Total de intentos: " + intentos);
    }

}
