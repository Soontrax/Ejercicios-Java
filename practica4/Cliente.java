/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * // http://puntocomnoesunlenguaje.blogspot.com.es/2012/12/arraylist-en-java.html
 * @author infor05
 */
public class Cliente {
    public static void main(String[] args) {
        ArrayList<Libro> lista_libros = new ArrayList<Libro>();
        lista_libros.add(new Libro("Harry Potter"));
        JOptionPane.showMessageDialog(null, "Hola Bienvenido a la Biblioteca virtual");
        System.out.println("1. Prestar libro");
        System.out.println("2. Devolver libro");
        System.out.println("3. Mostrar datos libro");
        System.out.println("4. Localizar ISBN Libro");
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Elige la opcion"));
        switch (opcion) {
            case 1:
                String prestar = JOptionPane.showInputDialog("Aqui tienes una lista con todos los libros:"+(lista_libros.get(0).getLibros_total()+"Elige el que quieras"));
                
        }
    }
}
