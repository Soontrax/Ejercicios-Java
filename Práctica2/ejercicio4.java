/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.util.Arrays;

/**
 *
 * @author Alvaro
 */
public class ejercicio4 {

    public static void main(String[] args) {
        int[][] binarios = new int[7][7];
        int i;

        for (i = 0; i < binarios.length; i++) {
            binarios[i][i] = 1;
        }
        for (i = 0; i < binarios.length; i++) {
            System.out.println(Arrays.toString(binarios[i]));
        }
    }
}
