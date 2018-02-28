/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5_red_bibliotecas;

/**
 *
 * @author Alvaro
 */
public class Libros {
    private String titulo_libro;
    private String autor;
    private String ISBN;
    private int ejemplares_totales;
    private int ejemplares_prestados;

    public Libros(String titulo_libro, String autor, String ISBN, int ejemplares_totales, int ejemplares_prestados) {
        this.titulo_libro = titulo_libro;
        this.autor = autor;
        this.ISBN = ISBN;
        this.ejemplares_totales = ejemplares_totales;
        this.ejemplares_prestados = ejemplares_prestados;
    }

    public String getTitulo_libro() {
        return titulo_libro;
    }

    public void setTitulo_libro(String titulo_libro) {
        this.titulo_libro = titulo_libro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getEjemplares_totales() {
        return ejemplares_totales;
    }

    public void setEjemplares_totales(int ejemplares_totales) {
        this.ejemplares_totales = ejemplares_totales;
    }

    public int getEjemplares_prestados() {
        return ejemplares_prestados;
    }

    public void setEjemplares_prestados(int ejemplares_prestados) {
        this.ejemplares_prestados = ejemplares_prestados;
    }
}
