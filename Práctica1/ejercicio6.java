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
public class ejercicio6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] primero = new int[12];
        int[] segundo = new int[12];
        int[] resultado = new int[24];
        int i;
        int j;
        int k = 0;
        System.out.println("Dame los numeros de la primera tabla");
        for (i = 0; i < 12; i++) {
            System.out.println("Dime un numnero");
            primero[i] = entrada.nextInt();
        }

        System.out.println("Dame los numeros de la segunda tabla");
        for (i = 0; i < 12; i++) {
            System.out.println("Dime los numeros");
            segundo[i] = entrada.nextInt();
        }

        j = 0;
        i = 0;
        while (i < 12) {
// copiamos 3 de a
            for (k = 0; k < 3; k++) {
                resultado[j] = primero[i + k];
                j++;
            }
// copiamos 3 de b
            for (k = 0; k < 3; k++) {
                resultado[j] = segundo[i + k];
                j++;
            }
// como hemos copiado 3 de a y b, incrementamos la i en 3.
            i += 3;
// la j se incrementa cada vez que se añade un elemento a la tabla c.
        }
        System.out.println("La tabla c queda: ");
        for (j = 0; j < 24; j++) // seguimos utilizando j, para la tabla c. Aunque se podría utilizar i.
        {
            System.out.print(resultado[j] + " ");
        }
        System.out.println("");
    }
}