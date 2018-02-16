/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;

import javax.swing.JOptionPane;
import java.util.*;


/**
 *
 * @author infor05
 */
public class Gestion_Administrativa {
    
    private String usuario;
    private String contraseña;
    private int id_bilioteca; 
    private String nombre_biblioteca;
    private String direccion;
    private ArrayList <Red_Bibliotecas> lista_libros;
    private ArrayList <Utilidades_usuario> lista_personas;
    
    public Gestion_Administrativa(){ 
        
    }

    public Gestion_Administrativa(String usuario, String contraseña, int id_bilioteca, String nombre_biblioteca, String direccion, ArrayList<Red_Bibliotecas> lista_libros, ArrayList<Utilidades_usuario> lista_personas) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.id_bilioteca = id_bilioteca;
        this.nombre_biblioteca = nombre_biblioteca;
        this.direccion = direccion;
        this.lista_libros = lista_libros;
        this.lista_personas = lista_personas;
    }
    
    public Gestion_Administrativa(Gestion_Administrativa copia){
      copia.contraseña = contraseña;
      copia.usuario = usuario;
      copia.id_bilioteca = id_bilioteca;
      copia.nombre_biblioteca = nombre_biblioteca;
      copia.direccion = direccion;
      copia.lista_libros = lista_libros;
      copia.lista_personas = lista_personas;
    }
    

    public String getUsuario() {
        return usuario;
    }

    public int getId_bilioteca() {
        return id_bilioteca;
    }

    public void setId_bilioteca(int id_bilioteca) {
        this.id_bilioteca = id_bilioteca;
    }

    public String getNombre_biblioteca() {
        return nombre_biblioteca;
    }

    public void setNombre_biblioteca(String nombre_biblioteca) {
        this.nombre_biblioteca = nombre_biblioteca;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Red_Bibliotecas> getLista_libros() {
        return lista_libros;
    }

    public void setLista_libros(ArrayList<Red_Bibliotecas> lista_libros) {
        this.lista_libros = lista_libros;
    }

    public ArrayList<Utilidades_usuario> getLista_personas() {
        return lista_personas;
    }

    public void setLista_personas(ArrayList<Utilidades_usuario> lista_personas) {
        this.lista_personas = lista_personas;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    static public void menu(){// Menu
        final String usuario = JOptionPane.showInputDialog("Pon tu usuario");
        final String contraseña = JOptionPane.showInputDialog("Pon tu contraseña");
        JOptionPane.showMessageDialog(null, "Tu usuario por defecto será: " +usuario+ "y tu contraseña será" +contraseña);
        System.out.println("1.Dar de alta una biblioteca");
        System.out.println("2.Dar de alta libros");
        System.out.println("3.Dar de alta personas");
        System.out.println("4.Estadisticas biblioteca");
        System.out.println("5.Estadisticas todas las bibliotecas");
        System.out.println("6. Salir");
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Elige una de las opciones"));
        switch (opcion){
            case 1:
                Gestion_Administrativa.dar_de_alta_biblioteca();
            case 2:
                Gestion_Administrativa.dar_de_alta_libros(libros);
            case 3:
                Gestion_Administrativa.dar_de_alta_personas();
            case 6:
                JOptionPane.showMessageDialog(null, "Gracias por visitar la biblioteca");
                break;
        }
    }
    
    
    public void añadir_libro(){
        Gestion_Administrativa libro = new Gestion_Administrativa();
        
    }

    
    public void añadir_personas(){
        
    }
    
    public void informacion_personas(){
        
    }
    static public Gestion_Administrativa dar_de_alta_biblioteca(){ //Dar de alta una biblioteca
        Gestion_Administrativa biblioteca = new Gestion_Administrativa();
        Gestion_Administrativa lista_libros = new Gestion_Administrativa();
        Gestion_Administrativa lista_personas = new Gestion_Administrativa();
        biblioteca.setId_bilioteca(Integer.parseInt(JOptionPane.showInputDialog("Dime la ID de la biblioteca")));
        biblioteca.setNombre_biblioteca(JOptionPane.showInputDialog("Dime el nombre de la biblioteca"));
        biblioteca.setDireccion(JOptionPane.showInputDialog("Introduce la dirección de la Biblioteca"));
        return biblioteca;
    }
    
    static public Gestion_Administrativa dar_de_alta_libros(ArrayList<Red_Bibliotecas> libros){
        Gestion_Administrativa libro = new Gestion_Administrativa();
        int id = Integer.parseInt(JOptionPane.showInputDialog("Dime el ID correspondiente a la biblioteca"));
        if (libro.id_bilioteca == id){
            String titulo = JOptionPane.showInputDialog("Dime el libro que quieras dar de alta");
            libros.add(Gestion_Administrativa.dar_de_alta_libros(titulo));
            JOptionPane.showMessageDialog(null, "El libro se ha añadido correctamente");
        }else{
            JOptionPane.showMessageDialog(null, "La id que has puesto no corresponde a ninguna biblioteca");
        }
        return libro;
    }
    
    static public Gestion_Administrativa dar_de_alta_personas(){
        Gestion_Administrativa persona = new Gestion_Administrativa();
        int id2 = Integer.parseInt(JOptionPane.showInputDialog("Dime el ID correspondiente a la biblioteca"));
        return persona;
    }
    
}