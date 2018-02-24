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
public class Personas {
    private String nombre;
    private String apellidos;
    private String ISBN;
    private String DNI;
    private String cargo;

    public Personas(){
        
    }
    public Personas(String nombre, String apellidos, String ISBN, String DNI, String cargo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.ISBN = ISBN;
        this.DNI = DNI;
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    


}
