/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.util.Scanner;

/**
 *
 * @author Alvaro
 */
public class ejercicio3 {

    public static void main(String[] args) {
        int[][] primero = new int[3][3];
        int[][] segundo = new int[3][3];
        Scanner numero = new Scanner(System.in);
        System.out.println("Dame los valores de la tabla 1.");
        for (int i = 0; i < primero.length; i++) {
            for (int j = 0; j < primero.length; j++) {
                System.out.print("[" + i + "]" + "[" + j + "]" + "=");
                primero[i][j] = numero.nextInt();
            }
        }
        System.out.println("Dame los valores de la tabla 2.");
        for (int i = 0; i < segundo.length; i++) {
            for (int j = 0; j < segundo.length; j++) {
                System.out.print("[" + i + "]" + "[" + j + "]" + "=");
                segundo[i][j] = numero.nextInt();
            }
        }
        System.out.println("\nImprimiendo Tabla Uno.");
        for (int i = 0; i < primero.length; i++) {
            System.out.println();
            for (int j = 0; j < primero.length; j++) {
                System.out.print(primero[i][j] + " ");
            }
        }
        System.out.println("\nImprimiendo Tabla Dos.");
        for (int i = 0; i < segundo.length; i++) {
            System.out.println();
            for (int j = 0; j < segundo.length; j++) {
                System.out.print(segundo[i][j] + " ");
            }
        }
        int[][] suma = new int[3][3];
        System.out.println("\nSumando las dos Tablas.");
        for (int i = 0; i < suma.length; i++) {
            for (int j = 0; j < suma.length; j++) {
                suma[i][j] = primero[i][j] + segundo[i][j];
            }
        }
        System.out.println("Este es el resultado");
        for (int i = 0; i < suma.length; i++) {
            System.out.println();
            for (int j = 0; j < suma.length; j++) {
                System.out.print(suma[i][j] + " ");
            }
        }
    }
}
