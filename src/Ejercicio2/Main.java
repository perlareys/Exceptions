/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.util.ArrayList;
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
        try {
            elegirNumero();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de rango");
        }
    }

    public static void elegirNumero() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar número index a buscar: ");
        int index = leer.nextInt();

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);

        if (index >= 0 && index < lista.size()) {
            int buscar = lista.get(index);
            System.out.println("El elemento en la posición " + index + " es: " + buscar);
        } else {
            System.out.println("Error: Índice fuera de rango");
        }
    }
}
