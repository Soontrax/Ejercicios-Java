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


public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int pos = 0, neg = 0, ceros = 0;  //contadores para positivos y negativos
        int i;
        double sumaPos = 0, sumaNeg = 0;  //suma de positivos y negativos
        //Leemos los valores por teclado y los guardamos en el array
        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < numeros.length; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i]=sc.nextInt();
        }
        //se recorre el array para sumar positivos y negativos
        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0){ //sumar positivos
                sumaPos += numeros[i];
                pos++;
            } else if (numeros[i] < 0){ //sumar negativos
                sumaNeg += numeros[i];
                neg++;
            } else{
                ceros++;
            }
        }
        //mostrar resultados
        if (pos != 0) {
            System.out.println("Media de los valores positivos: " + sumaPos / pos);
        } else {
            System.out.println("No ha introducido números positivos");
        }
        if (neg != 0) {
            System.out.println("Media de los valores negativos: " + sumaNeg / neg);
        } else {
            System.out.println("No ha introducido números negativos");
        }
        if (ceros !=0 ) {
            System.out.println("Tienes estos ceros:" +ceros);
        }
    }
}