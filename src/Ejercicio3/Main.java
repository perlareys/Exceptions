/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Perla
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        String numero1S = leer.next();
        System.out.println("Ingrese el segundo número");
        String numero2S = leer.next();

        int numero1, numero2;
        numero1 = Integer.parseInt(numero1S);
        numero2 = Integer.parseInt(numero2S);
        DivisionNumero dividir = new DivisionNumero();

        try {
            int resultado = dividir.dividir(numero1, numero2);
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException a) {
            System.out.println(a.getMessage());
        }
    }
}
