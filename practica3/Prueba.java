/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

import javax.swing.JOptionPane;

/**
 *
 * @author infor05
 */
public class Prueba {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre:");
        JOptionPane.showMessageDialog(null, "Bienvenido a la clase del aburrimineto" +" "+nombre);
    }
}
