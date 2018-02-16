/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author infor05
 */

// http://chuwiki.chuidiang.org/index.php?title=JOptionPane_y_di%C3%A1logos_modales
public class Red_Bibliotecas {

    public static void main(String[] args) {
        ArrayList<Gestion_Administrativa> libros = new ArrayList();
        
        libros.add(Gestion_Administrativa.dar_de_alta_biblioteca());
        JOptionPane.showMessageDialog(null, "Bienvenido a la red de Bibliotecas de Mallorca");
        System.out.println("1.Gestión Administrativa");
        System.out.println("2.Utilidades usuario");
        int a = Integer.parseInt(JOptionPane.showInputDialog("Que opcion quieres"));
        switch (a){
            case 1:
                Gestion_Administrativa.menu();
        }
    }
}
