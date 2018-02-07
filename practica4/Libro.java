/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

/**
 *
 * @author infor05
 */
public class Libro {
    private String titulo_libro;
    private String autor;
    private String ISBN;
    private int ejemplares_libros;
    private int ejemplares_prestados;
    private int libros_total;
    private int ejemplares_totales;
    
    public Libro(){
        
    }

    public Libro(String titulo_libro, String autor, String ISBN, int ejemplares_libros, int ejemplares_prestados, int libros_total, int ejemplares_totales) {
        this.titulo_libro = titulo_libro;
        this.autor = autor;
        this.ISBN = ISBN;
        this.ejemplares_libros = ejemplares_libros;
        this.ejemplares_prestados = ejemplares_prestados;
        this.libros_total = libros_total;
        this.ejemplares_totales = ejemplares_totales;
    }
    
    public Libro(Libro copia) {
        copia.titulo_libro = titulo_libro;
        copia.autor = autor;
        copia.ISBN = ISBN;
        copia.ejemplares_libros = ejemplares_libros;
        copia.ejemplares_prestados = ejemplares_prestados;
        copia.libros_total = libros_total;
        copia.ejemplares_totales = ejemplares_totales;
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

    public int getEjemplares_libros() {
        return ejemplares_libros;
    }

    public void setEjemplares_libros(int ejemplares_libros) {
        this.ejemplares_libros = ejemplares_libros;
    }

    public int getEjemplares_prestados() {
        return ejemplares_prestados;
    }

    public void setEjemplares_prestados(int ejemplares_prestados) {
        this.ejemplares_prestados = ejemplares_prestados;
    }

    public int getLibros_total() {
        return libros_total;
    }

    public void setLibros_total(int libros_total) {
        this.libros_total = libros_total;
    }

    public int getEjemplares_totales() {
        return ejemplares_totales;
    }

    public void setEjemplares_totales(int ejemplares_totales) {
        this.ejemplares_totales = ejemplares_totales;
    }
    
    public void prestamo(){
        
    }
    
    public void devolver_libro(){
        
    }
    
    public void mostrar_libro(){
        
    }
    
    public void localizar_libro(){
        
    }
    
}