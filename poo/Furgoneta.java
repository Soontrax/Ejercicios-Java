/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Alvaro
 */
public class Furgoneta extends coche {
    private int capaciad_carga;
    private int plazas_extra;
    
    public Furgoneta(int plazas_extra, int capacidad_carga){
        super(); //lamar al Constructor de la clase padre que es coche
        this.capaciad_carga = capacidad_carga;
        this.plazas_extra = plazas_extra;
    }
    
    public String dimeDatosFurgoneta(){
        
        return "La capacidad extra es " +capaciad_carga+ " kg mas " +plazas_extra+ " asientos";
    }
}
