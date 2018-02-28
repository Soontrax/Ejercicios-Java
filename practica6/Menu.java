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
public class Menu {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido a la herencia");
        System.out.println("1. ¿Quieres realizar el alta de algún tipo de empleado?");
        System.out.println("2. Mostrar atributos de los demas empleados");
        System.out.println("3. Salir");
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("ELige una de las opciones"));
        switch (opcion){
            case 1:
                JOptionPane.showMessageDialog(null, "Has elegido dar de alta un empleado que empleado quieres acceder");
                System.out.println("1. Empleado");
                System.out.println("2. Comercial");
                System.out.println("3. Repartidor");
                
                int opciones_empleados = Integer.parseInt(JOptionPane.showInputDialog("Elige una de las opciones"));
                switch (opciones_empleados){
                    case 1:
                        Empleado trabajador = new Empleado();
                        trabajador.pedir_alta();
                        break;
                    case 2:
                        Comercial comercial = new Comercial();
                        comercial.pedir_alta();
                        break;
                    case 3:
                        Repartidor repartidor = new Repartidor();
                        repartidor.pedir_alta();
                        break;
                }

        }
    }
    
}