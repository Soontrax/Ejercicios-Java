/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

/**
 *
 * @author Alvaro
 */
public class ejercicio1 {

    public static void main(String[] args) {
        int[][] num = new int[5][5];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                  num[i][j]=i+j;              
            }            
        }
        System.out.println("La tabal se esta imprimiendo");
        for (int i = 0; i < num.length; i++) {
            System.out.println();
            for (int j = 0; j < num.length; j++) {
                  System.out.print(num[i][j] + " ");              
            }            
        }
    }
}
