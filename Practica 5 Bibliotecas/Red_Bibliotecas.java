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
public class Red_Bibliotecas {
    private String usuario;
    private String contraseña;
    private ArrayList <Bibliotecas> bibliotecas;

    public Red_Bibliotecas(String usuario, String contraseña, ArrayList<Bibliotecas> bibliotecas) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.bibliotecas = bibliotecas;
    }

    public String getUsuario() {
        return usuario;
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

    public ArrayList<Bibliotecas> getBibliotecas() {
        return bibliotecas;
    }

    public void setBibliotecas(ArrayList<Bibliotecas> bibliotecas) {
        this.bibliotecas = bibliotecas;
    }
}
