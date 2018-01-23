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
public class ejercicio2 {
    public static void main(String[] args) {
        int[][] num = new int[4][4];
        boolean confirmación;
        Scanner numero = new Scanner(System.in);
        System.out.println("Ingrese los números.");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                  System.out.print("["+i+"]"+"["+j+"]"+"=");
                  num[i][j]=numero.nextInt();              
            }            
        }
        System.out.println("Imprimiendo Tabla.");
        for (int i = 0; i < num.length; i++) {
            System.out.println();
            for (int j = 0; j < num.length; j++) {
                  System.out.print(num[i][j] + " ");              
            }            
        }
        System.out.println("\nComprobando Simetria.");
        confirmación = true;
        int control = num.length -1;
        int i=0;
        while (i < control && confirmación == true) {            
            int j=0;
            while (j < control && confirmación == true) {                
                if(num[i][j] != num[j][i]){
                    confirmación = false;
                }
                j++;
            }
          i++;
        }
        if(confirmación){
            System.out.println("La tabla resulta Simétrica.");
        }
        else{
            System.out.println("La tabla no es Simétrica.");
        }
    }
}
    
