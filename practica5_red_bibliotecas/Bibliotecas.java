/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5_red_bibliotecas;

import java.util.ArrayList;

/**
 *
 * @author Alvaro
 */
public class Bibliotecas {
    private int id_biblioteca;
    private String nombre_biblioteca;
    private String direccion;
    private  ArrayList <Personas> personas;
    private  ArrayList <Libros> libros;

    public Bibliotecas(int id_biblioteca, String nombre_biblioteca, String direccion, ArrayList<Personas> personas, ArrayList<Libros> libros) {
        this.id_biblioteca = id_biblioteca;
        this.nombre_biblioteca = nombre_biblioteca;
        this.direccion = direccion;
        this.personas = personas;
        this.libros = libros;
    }

    public int getId_biblioteca() {
        return id_biblioteca;
    }

    public void setId_biblioteca(int id_biblioteca) {
        this.id_biblioteca = id_biblioteca;
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

    public ArrayList<Personas> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Personas> personas) {
        this.personas = personas;
    }

    public ArrayList<Libros> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libros> libros) {
        this.libros = libros;
    }
    
    public void añadir_libros(Libros p){
        this.libros.add(p);
    }
    
}
