/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author infor05
 */
public class ejercicio2 {
    public static void main(String[] args) {
        // TODO code application logic here
        int[]numeros;
        numeros = new int[5];
        Scanner sc = new Scanner (System.in); //Le pedimos al usuario los valores
        for (int i = 5 - 1; i >=0; i--) {
            System.out.println("Escribe unos numeros");
            numeros[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(numeros));
    }
    
}