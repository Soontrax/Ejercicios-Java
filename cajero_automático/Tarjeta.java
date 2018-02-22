/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero_automático;

/**
 *
 * @author infor05
 */
public class Tarjeta {
    protected String NIF_cliente;
    protected int PIN_cliente;
    protected String nombre_cliente;
    protected String apellidos_cliente;
    
    public Tarjeta(){
        
    }

    public Tarjeta(String NIF_cliente, int PIN_cliente, String nombre_cliente, String apellidos_cliente) {
        this.NIF_cliente = NIF_cliente;
        this.PIN_cliente = PIN_cliente;
        this.nombre_cliente = nombre_cliente;
        this.apellidos_cliente = apellidos_cliente;
    }
    
    
    public Tarjeta(Tarjeta copia) {
        copia.NIF_cliente = NIF_cliente;
        copia.PIN_cliente = PIN_cliente;
        copia.nombre_cliente = nombre_cliente;
        copia.apellidos_cliente = apellidos_cliente;
    }

    public String getNIF_cliente() {
        return NIF_cliente;
    }

    public void setNIF_cliente(String NIF_cliente) {
        this.NIF_cliente = NIF_cliente;
    }

    public int getPIN_cliente() {
        return PIN_cliente;
    }

    public void setPIN_cliente(int PIN_cliente) {
        this.PIN_cliente = PIN_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getApellidos_cliente() {
        return apellidos_cliente;
    }

    public void setApellidos_cliente(String apellidos_cliente) {
        this.apellidos_cliente = apellidos_cliente;
    }
}
