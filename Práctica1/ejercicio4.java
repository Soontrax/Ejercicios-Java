/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author infor05
 */
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int[] numeros = new int[10];
          for (i = 0; i < numeros.length; i++) {
              System.out.println("Introduce un numero hasta 10 veces:");
              numeros[i]=sc.nextInt();
          }
          System.out.println("Aqui esta el resultado:");
          for (i =0;i<=4; i++) {
              System.out.println(numeros[i] + "numero:");
              System.out.println(numeros[i]);
              System.out.println(numeros[9-i] + "numero:");
              System.out.println(numeros[9-i]);
        
          
    }
}
}