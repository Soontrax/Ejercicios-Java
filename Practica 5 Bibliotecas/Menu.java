/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5_red_bibliotecas;

import javax.swing.JOptionPane;

/**
 *
 * @author Alvaro
 */
public class Menu {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Bienvenido a la red de Bibliotecas");
        System.out.println("1. Gestion Administrativa");
        System.out.println("2. Utilidades Usuario");
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Elge una de las opciones"));
        switch (opcion) {
            case 1:
                
        }
    }
}
