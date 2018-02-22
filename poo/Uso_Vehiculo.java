/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import javax.swing.JOptionPane;

/**
 *
 * @author Alvaro
 */
public class Uso_Vehiculo {
    public static void main(String[] args) {
        
        coche micoche1 = new coche();
        
        micoche1.setColor("rojo");
        
        Furgoneta mifragoneta = new Furgoneta(7, 670);
        
        mifragoneta.setColor("azul");
        
        mifragoneta.setAsientos_cuero(true);
        
        mifragoneta.setClimatizador(true);
        
        System.out.println("El coche1 tiene un color" +micoche1.getColor());
        System.out.println("La furgoneta tiene un color" +mifragoneta.getColor()+ " y " +mifragoneta.dime_asientos());
        
        System.out.println("Elm precio de esta furgoneta es de" +mifragoneta.precio_coche());
        
        System.out.println("Los datos expecificos de la furgoneta son " +mifragoneta.dimeDatosFurgoneta());
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //coche Renault = new coche(); //Primero hay que poner el nombre de la clase a la que pertenecen (coche)
        // Renault va a ser el nombre que le vamos a poner al objeto en si puede ser el nombre que queramos.
        //System.out.println("El ancho de tu coche es de:" +Renault.getAncho());
       // Renault.setRuedas(9);
      //  System.out.println("Ahora el coche Renault tiene:" +Renault.getRuedas()+ "ruedas");
        
        
       // coche micoche = new coche();
      //  micoche.setColor(JOptionPane.showInputDialog("Dime el color del coche:"));
      //  System.out.println("Ahora tu otro coche tiene: " +micoche.getRuedas()+ " ruedas y tiene un color " +micoche.getColor());
       // micoche.configurar_climatizador(JOptionPane.showInputDialog("Dime si quieres un climatiozador (si o no)"));
       // JOptionPane.showMessageDialog(null, "Tu coche vale esto:" +micoche.precio_coche()+ "€");
  
    }
}
