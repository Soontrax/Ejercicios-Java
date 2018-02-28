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
public final class Comercial extends Empleado{  
    private int comision;

    public Comercial(int comision, String nombre, String apellido1, String apellido2, String NIF, int edad, int salario) {
        super(nombre, apellido1, apellido2, NIF, edad, salario);
        this.comision = comision;
    }

    public Comercial() {
    }

    public Comercial(Empleado copia) {
        super(copia);
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }
    
    @Override
    public void mostrar_atributos(){ //Aqui estamos llamando al metodo con Override de la clase padre Empleado y le decimos que nos muestre los parametros del constructor más los suyos propios
        super.mostrar_atributos();
        System.out.println("La comisión del comercial es de: "+this.comision);
    }
    
    @Override
    public void pedir_alta(){
        super.pedir_alta();
        this.comision = Integer.parseInt(JOptionPane.showInputDialog("Dime la comisión del Comercial"));
    }
    
}
