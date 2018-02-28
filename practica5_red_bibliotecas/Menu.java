/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5_red_bibliotecas;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Alvaro
 */
public class Menu {
    
    public static void main(String[] args) {
        ArrayList<Bibliotecas> lista_bibliotecas = new ArrayList<Bibliotecas>(); //Creamos la lista vacia
        Red_Bibliotecas menu = new Red_Bibliotecas(lista_bibliotecas);
        Menu.menu(menu);
    }
    public static void menu(Red_Bibliotecas menu) {
        JOptionPane.showMessageDialog(null, "Bienvenido a la red de Bibliotecas");
        System.out.println("1. Gestion Administrativa");
        System.out.println("2. Utilidades Usuario");
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Elge una de las opciones"));
        switch (opcion) {
            case 1:
                String user = JOptionPane.showInputDialog("Dime tu usuario");
                String password = JOptionPane.showInputDialog("Dime la contraseña");
                if (user.equals(menu.getUsuario()) && password.equals(menu.getContraseña())){
                    System.out.println("1. Dar de alta biblioteca");
                    System.out.println("2. Dar de alta libros biblioteca");
                    System.out.println("3. Dar de baja libros biblioteca");
                    System.out.println("4. Estadisticas bibliotecas");
                    System.out.println("5. Estadisticas red bibliotecas");
                    int opcion_Gestion = Integer.parseInt(JOptionPane.showInputDialog("Elige una de las opciones"));
                    switch (opcion_Gestion) {
                        case 1:
                            Menu.alta_biblioteca(menu);
                        case 2:
                            Menu.dar_alta_libros(menu);
                        case 3:
                            
                        case 4:
                            Menu.mostrar_estadisticas(menu);
                        case 5:
                }
                }else{
                    JOptionPane.showConfirmDialog(null, "Contraeña Incorrecta");
                }
                break;
            case 2:
                System.out.println("1. Consultar libro");
                System.out.println("2. Consultar libro en biblioteca");
                System.out.println("3. Reservar libro");
                System.out.println("4. Devolver libro");
                int opcion_usuario = Integer.parseInt(JOptionPane.showInputDialog("Elige una de las opciones"));
                switch (opcion_usuario){
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                }
        }
    }
    
    // Metodos Gestion Administrativa
    //----------------------------------------------------------------------------------------------------------
    public static void alta_biblioteca (Red_Bibliotecas menu){
        int id = Integer.parseInt(JOptionPane.showInputDialog("Dime el ID de la biblioteca"));
        String nombre = JOptionPane.showInputDialog("Dime el nombre");
        String direccion = JOptionPane.showInputDialog("Dime la direccion");
        ArrayList<Libros> lista_libros = new ArrayList<Libros>(); // creacion de la lista de los libros
        ArrayList<Personas> lista_personas = new ArrayList<Personas>(); // creacion de la lista de las personas
        Bibliotecas nueva = new Bibliotecas(id, nombre, direccion, lista_personas, lista_libros); // le pasamos los paramentros con las variables que son los datos correspondientes
        menu.añadirbiblioteca(nueva); //todos los datos los datos se guardan en una variable que es menu y todos estos datos los pamos con el objeto correspondiente a Red_Bibliotecas que es menu.y el metodo
        JOptionPane.showMessageDialog(null, "Biblioteca añadida correctamente");
        ArrayList<Bibliotecas> lista_bibliotecas = menu.getBibliotecas();
        Bibliotecas mostrar = lista_bibliotecas.get(0);
        JOptionPane.showMessageDialog(null, mostrar.getId_biblioteca() + " " + mostrar.getDireccion() +" "+ mostrar.getNombre_biblioteca());
        Menu.menu(menu);
    }
    
    public static void dar_alta_libros(Red_Bibliotecas menu) {
        int pedir_id = Integer.parseInt(JOptionPane.showInputDialog("Dame el id de la biblioteca"));
        Bibliotecas biblioteca = menu.damebiblioteca(pedir_id);
        String titulo_libro = JOptionPane.showInputDialog("Dame el titulo del libro");
        String autor = JOptionPane.showInputDialog("Dime el autor del libro");
        String ISBN = JOptionPane.showInputDialog("Dime el ISBN");
        int ejemplares_totales = Integer.parseInt(JOptionPane.showInputDialog("Cuantos ejemplares te han llegado"));
        int ejemplares_prestados = 0;
        Libros libro = new Libros(titulo_libro, autor, ISBN, ejemplares_totales, ejemplares_prestados);
        biblioteca.añadir_libros(libro);
        JOptionPane.showMessageDialog(null, "El libro se ha añadido correctamente");
        Menu.menu(menu);
    }
    
    public static void mostrar_estadisticas(Red_Bibliotecas menu){
        int pedir_id = Integer.parseInt(JOptionPane.showInputDialog("Dame el id de la biblioteca"));
        Bibliotecas biblioteca = menu.damebiblioteca(pedir_id);
        
        int total = 0;
        int prestados = 0;
        for (Libros i : biblioteca.getLibros()){ 
            total += i.getEjemplares_totales(); //aqui obtenemos el numero de ejemplares totales que ha puesto el usuario
            prestados += i.getEjemplares_prestados();// aqui obtenemos el numero de ejemplares prestados por el usaurio
        }
        for (Personas i : biblioteca.getPersonas()){
            System.out.println("Nombre" +i.getNombre());
            System.out.println("Apellidos" +i.getApellidos());
            System.out.println("Cargo" +i.getCargo());
            System.out.println("DNI" +i.getDNI());
        }
        System.out.println("Los ejemplares totales que tinenes son: " +total+ " prestados " +prestados);
        
    }
    //---------------------------------------------------------------------------------------------------------------------------------
}
