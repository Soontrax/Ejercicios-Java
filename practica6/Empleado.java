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
public class Empleado {

    protected String nombre;
    protected String apellido1;
    protected String apellido2;
    protected String NIF;
    protected int edad;
    protected int salario;

    public Empleado(String nombre, String apellido1, String apellido2, String NIF, int edad, int salario) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.NIF = NIF;
        this.edad = edad;
        this.salario = salario;
    }

    public Empleado() {
    }

    public Empleado(Empleado copia) {
        copia.nombre = nombre;
        copia.apellido1 = apellido1;
        copia.apellido2 = apellido2;
        copia.NIF = NIF;
        copia.edad = edad;
        copia.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre.substring(0) = this.nombre.substring(0, 1).toUpperCase();

        System.out.println("nombre" + this.nombre);
    }

    public static String ucFirst(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            return Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (this.edad < 16) {
            JOptionPane.showMessageDialog(null, "No puedes acceder tienes menos de 16 años");
        } else {
            JOptionPane.showMessageDialog(null, "Correcto eres mayor de edad");
        }
        this.edad = edad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void mostrar_atributos() { //Como esta es la clase principal osea el padre pues metemos en un metodo que guarda las propiedades del constructor en un metodo.
        // Y todas las subclases de esta que las llamemos con Override pues todos estos parametros se heredarán más los suyos propios
        System.out.println("El nombre del empleado es: " + this.nombre);
        System.out.println("El primer apellido del empleado es: " + this.apellido1);
        System.out.println("El segundo apellido del empleado es: " + this.apellido2);
        System.out.println("El NIF del empleado es: " + this.NIF);
        System.out.println("La edad del empleado es: " + this.edad);
        System.out.println("El salario del empleado es de: " + this.salario);

    }

    public void pedir_alta() {
        this.nombre = JOptionPane.showInputDialog("Dime el nombre del cliente");
        this.setNombre(nombre);
        this.apellido1 = JOptionPane.showInputDialog("Dime el primer apellido del empleado");
        this.apellido2 = JOptionPane.showInputDialog("Dime el segundo apellido del empleado");
        this.NIF = JOptionPane.showInputDialog("Dime el NIF del empleado");
        this.edad = Integer.parseInt(JOptionPane.showInputDialog("Dime la edad del empleado"));
        this.salario = Integer.parseInt(JOptionPane.showInputDialog("Dime el salario del empleado"));
    }
}
