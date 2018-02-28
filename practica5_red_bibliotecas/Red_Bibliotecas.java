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
    final private String usuario;
    final private String contraseña;
    private ArrayList <Bibliotecas> bibliotecas;

    public Red_Bibliotecas(ArrayList<Bibliotecas> bibliotecas) {
        this.usuario = "alvaro";
        this.contraseña = "12345";
        this.bibliotecas = bibliotecas;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public ArrayList<Bibliotecas> getBibliotecas() {
        return bibliotecas;
    }

    public void setBibliotecas(ArrayList<Bibliotecas> bibliotecas) {
        this.bibliotecas = bibliotecas;
    }
    
    public void añadirbiblioteca(Bibliotecas p){
        this.bibliotecas.add(p);
    }
    
    public Bibliotecas damebiblioteca (int id){
        Bibliotecas match = new Bibliotecas(0, "no encontrada", "", new ArrayList<Personas>(), new ArrayList<Libros>());
        for (Bibliotecas item : this.bibliotecas) {
            if (id == item.getId_biblioteca()) {
                match = item;
            }
        }
        return match;
    }
}
