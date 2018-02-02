/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

/**
 *
 * @author infor05
 */
public class Cuenta { // Declaracion de las variables

    private String numero_cuenta;
    private String nombre_cliente;
    private Double tipo_interes;
    private Double saldo;

    public Cuenta() { //Constructor por defecto

    }

    public Cuenta(String numero_cuenta, String nombre_cliente, Double tipo_interes, Double saldo) { //Construcitor con todos los parametros o propiedades
        this.numero_cuenta = numero_cuenta;
        this.nombre_cliente = nombre_cliente;
        this.tipo_interes = tipo_interes;
        this.saldo = saldo;
    }

    public Cuenta(Cuenta copia) { // Constructor copia
        copia.numero_cuenta = numero_cuenta;
        copia.nombre_cliente = nombre_cliente;
        copia.tipo_interes = tipo_interes;
        copia.saldo = saldo;

    }
    
    //Getters y Setters
    
    public String getNumero_cuenta() {
        return this.numero_cuenta;
    }

    public void setNumero_cuenta(String numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public Double getTipo_interes() {
        return tipo_interes;
    }

    public void setTipo_interes(Double tipo_interes) {
        this.tipo_interes = tipo_interes;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
    public void transferir_dinero(Cuenta p,double importe){
        this.saldo+=importe;
        p.saldo-=importe;
    }
}