/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * //
 * http://puntocomnoesunlenguaje.blogspot.com.es/2012/12/arraylist-en-java.html
 *
 * @author infor05
 */
public class Cliente {

    public static void main(String[] args) {
        ArrayList<Libro> lista_libros = new ArrayList();
        lista_libros.add(new Libro("Harry Potter", "Cervantes", "Mallorca", 20, 40, 60, 90));
        JOptionPane.showMessageDialog(null, "Hola Bienvenido a la Biblioteca virtual");
        System.out.println("1. Prestar libro");
        System.out.println("2. Devolver libro");
        System.out.println("3. Mostrar datos libro");
        System.out.println("4. Localizar ISBN Libro");
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Elige la opcion"));
        switch (opcion) {
            case 1:
                Libro.prestamo(lista_libros);
                break;
            case 2:
                Libro.devolver_libro(lista_libros);
                break;
            case 3:
                Libro.mostrar_libro(lista_libros);
                break;
            case 4:
                Libro.localizar_libro(lista_libros);
                break;
        }
    }
}