/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero_automático;

import javax.swing.JOptionPane;

/**
 *
 * @author infor05
 */
public class Usuario {
public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido al Cajero de la Caixa");
        JOptionPane.showMessageDialog(null, "Ahora se te habrirá un menu...");
        System.out.println("1.Extraer dinero");
        System.out.println("2.Salir");
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Elige una de las siguientes opciones"));
        switch (opcion){
            case 1:
                Cajero_Automático.menu();
            case 2:
                JOptionPane.showMessageDialog(null, "Gracias por visitar nuestro cajero que pase un buen dia");
                break;
        }
    }
}
