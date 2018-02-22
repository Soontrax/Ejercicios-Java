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
public class coche {
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    private String color;
    private int peso_total;
    private boolean asientos_cuero,climatizador;
    
    public coche(){ // Esto es un constructor y sirve para inicializar las propiedades del objeto
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso_plataforma = 2500;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getLargo() {
        return largo;
    }

    public int getPeso_plataforma() {
        return peso_plataforma;
    }

    public void setPeso_plataforma(int peso_plataforma) {
        this.peso_plataforma = peso_plataforma;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPeso_total() {
        return peso_total;
    }

    public void setPeso_total(int peso_total) {
        this.peso_total = peso_total;
    }

    public boolean isAsientos_cuero() {
        return asientos_cuero;
    }

    public void setAsientos_cuero(boolean asientos_cuero) {
        this.asientos_cuero = asientos_cuero;
    }

    public boolean isClimatizador() {
        return climatizador;
    }

    public void setClimatizador(boolean climatizador) {
        this.climatizador = climatizador;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getpeso_plataforma() {
        return peso_plataforma;
    }

    public void setpeso_plataforma(int peso_plataforma) {
        this.peso_plataforma = peso_plataforma;
    }
    
    public void configurar_asientos(String asientos_cuero){//SETTER
        if(asientos_cuero.equalsIgnoreCase("si")){
            this.asientos_cuero = true;
        }else{
            this.asientos_cuero = false;
        }
    }
    
    public String dime_asientos(){// Getter
        if (asientos_cuero == true){
            return "El coche es de cuero";
        }else{
            return "EL coche no es de cuero asi que es normal el coche";
        }
    }
    
    public void configurar_climatizador(String climatizador){ //Setter
        if (climatizador.equalsIgnoreCase("si")){
            this.climatizador = true;
        }else{
            this.climatizador = false;
        }
    }
    
    public String dime_climatizador(){
        if (climatizador == true){
            return "El coche incorpora climatiozador";
        }else{
            return "el coche lleva aire acondicoinado";
        }
    }
    
    public int precio_coche(){ //Getter
        int precio_final= 10000;
        if (asientos_cuero==true){
            precio_final = precio_final+1000;
        }
        if (climatizador ==true){
            precio_final = precio_final+2000;
        }
        return precio_final;
    }
}
