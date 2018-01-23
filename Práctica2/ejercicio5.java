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
public class ejercicio5 {

    public static void main(String[] args) {
        int[][] bordes = new int[8][6];

        for (int i = 0; i < bordes.length; i++) {
            for (int j = 0; j < bordes[0].length; j++) {
                bordes[i][j] = 0;
                bordes[i][0] = 1;
                bordes[0][j] = 1;
                bordes[i][5] = 1;
                bordes[7][j] = 1;
            }
        }

        for (int i = 0; i < bordes.length; i++) {
            for (int j = 0; j < bordes[0].length; j++) {
                System.out.print(bordes[i][j]);
            }
            System.out.println();
        }

    }

}
