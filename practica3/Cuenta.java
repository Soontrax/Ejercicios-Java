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
public class Cuenta {

    String [] numero_cuenta;
    String[] nombre_cliente;
    Double [] tipo_interes;
    String [] saldo;
    
    public Cuenta() {
    
}

    public Cuenta(String[] numero_cuenta, String[] nombre_cliente, Double[] tipo_interes, String[] saldo) {
        this.numero_cuenta = numero_cuenta;
        this.nombre_cliente = nombre_cliente;
        this.tipo_interes = tipo_interes;
        this.saldo = saldo;
    }

    public String[] getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(String[] numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public String[] getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String[] nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public Double[] getTipo_interes() {
        return tipo_interes;
    }

    public void setTipo_interes(Double[] tipo_interes) {
        this.tipo_interes = tipo_interes;
    }

    public String[] getSaldo() {
        return saldo;
    }

    public void setSaldo(String[] saldo) {
        this.saldo = saldo;
    }
    
}
