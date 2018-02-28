/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6;

import javax.swing.JOptionPane;
/**
 *
 * @author infor05
 */
public final class Repartidor extends Empleado{
    private String zona;

    public Repartidor(String zona, String nombre, String apellido1, String apellido2, String NIF, int edad, int salario) {
        super(nombre, apellido1, apellido2, NIF, edad, salario);
        this.zona = zona;
    }

    public Repartidor() {
    }

    public Repartidor(Empleado copia) {
        super(copia);
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
    
    @Override
    public void mostrar_atributos(){ //Aqui estamos llamando al metodo con Override de la clase padre Empleado y le decimos que nos muestre los parametros del constructor más los suyos propios
        super.mostrar_atributos();
        System.out.println("La zona del repartidor es de: "+this.zona);
    }
    
    @Override
    public void pedir_alta(){
        super.pedir_alta();
        this.zona = JOptionPane.showInputDialog("Dime la zona del repartidor");
    }
}
