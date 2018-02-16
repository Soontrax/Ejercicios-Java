/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;

import javax.swing.JOptionPane;

/**
 *
 * @author infor05
 */
public class Utilidades_usuario {
    
    private String nombre;
    private String apellidos;
    private String DNI;
    private String cargo_ocupacion;
    
    public Utilidades_usuario(){
    
}

    public Utilidades_usuario(String nombre, String apellidos, String DNI, String cargo_ocupacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.cargo_ocupacion = cargo_ocupacion;
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

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getCargo_ocupacion() {
        return cargo_ocupacion;
    }

    public void setCargo_ocupacion(String cargo_ocupacion) {
        this.cargo_ocupacion = cargo_ocupacion;
    }
    
}
