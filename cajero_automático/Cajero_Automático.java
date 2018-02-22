/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero_automático;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author infor05
 */
public class Cajero_Automático {
    protected int nºid_cajero_ult;
    protected int nºid_cajero;
    private int billetes;
    private ArrayList<String>tarjeta;
    
    public Cajero_Automático(){
        
    }

    public Cajero_Automático(int nºid_cajero_ult, int nºid_cajero, int billetes, ArrayList<String> tarjeta) {
        this.nºid_cajero_ult = nºid_cajero_ult;
        this.nºid_cajero = nºid_cajero;
        this.billetes = billetes;
        this.tarjeta = tarjeta;
    }
    
    public Cajero_Automático(Cajero_Automático copia) {
        copia.nºid_cajero_ult = nºid_cajero_ult;
        copia.nºid_cajero = nºid_cajero;
        copia.billetes = billetes;
        copia.tarjeta = tarjeta;
    }
 
    
    public int getNºid_cajero_ult() {
        return nºid_cajero_ult;
    }

    public void setNºid_cajero_ult(int nºid_cajero_ult) {
        this.nºid_cajero_ult = nºid_cajero_ult;
    }

    public int getNºid_cajero() {
        return nºid_cajero;
    }

    public void setNºid_cajero(int nºid_cajero) {
        this.nºid_cajero = nºid_cajero;
    }

    public int getBilletes() {
        return billetes;
    }

    public void setBilletes(int billetes) {
        this.billetes = billetes;
    }

    public ArrayList<String> getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(ArrayList<String> tarjeta) {
        this.tarjeta = tarjeta;
    }
    
      public Cajero_Automático billetes_total(){
        Cajero_Automático micajero = new Cajero_Automático();
        int [][] carga_billetes = {{500, 10}, {200, 0}, {100, 0}, {50, 27}, {20, 0}, {10, 18}, {5, 25}};
        return micajero;
    }
    
    static public void menu(){
        JOptionPane.showMessageDialog(null, "Ahora estas en el cajero que opciones quieres");
        System.out.println("1. Mostrar cajero");
        System.out.println("2. Mostrar tarjeta");
        System.out.println("3. Sacar dinero");
        System.out.println("4. Salir");
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Que opcion quieres"));
        switch (opcion) {
            case 1:
                Cajero_Automático.mostrar_cajero();
                break;
            case 2:
                Cajero_Automático.mostrar_tarjeta();
                break;
            case 3:
                Cajero_Automático.sacar_dinero();
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Que pases un buen dia");
                break;
        }
    }
    
    static public Cajero_Automático mostrar_cajero(){
        Cajero_Automático opciones = new Cajero_Automático();
        JOptionPane.showMessageDialog(null, "Ahora te mostraremos lo billetes totales que tienes en tu cajero");
        System.out.println("Tienes");
        return opciones;
    }
    
    static public Tarjeta mostrar_tarjeta(){
        Tarjeta tarjetas = new Tarjeta("456FN", 777, "pepito", "grillo");
        System.out.println("El NIF de tu tarjeta es: " +tarjetas.getNIF_cliente());
        System.out.println("El nombre del cliente en cuestion es: " +tarjetas.getNombre_cliente());
        System.out.println("El apellido del cleinte en cuestion es: " +tarjetas.getApellidos_cliente());
        return tarjetas;
    }
    
    static public Tarjeta sacar_dinero(){
        Tarjeta dinerico = new Tarjeta("456FN", 7777, "alvaro", "garrido");
        JOptionPane.showMessageDialog(null, "Has seleccionado la opcion sacar dinero");
        String NIF = JOptionPane.showInputDialog("Dame tu NIF correspondiente");
        int PIN = Integer.parseInt(JOptionPane.showInputDialog("Dame tu PIN correspondiente"));
        if (dinerico.getNIF_cliente() == NIF  || dinerico.getPIN_cliente() == PIN ){
            System.out.println("1. Tarjeta debito");
            System.out.println("2. Tarjeta credito");
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Elige una opcion"));
            switch (opcion){
                case 1:
                    Cajero_Automático.sacar_dinero_debito();
                    break;
                case 2:
                    Cajero_Automático.sacar_dinero_credito();
                    break;
            }
        } else{
            JOptionPane.showMessageDialog(null, "El PIN o el NIF no están correctamente");
            return dinerico;
        };
        
        return dinerico;
    }
    
    static public Tarjeta sacar_dinero_debito(){
        Tarjeta_debito hola = new Tarjeta_debito(4500);
        JOptionPane.showMessageDialog(null, "Hola vas a sacar dinero con la tarjeta de debito");
        System.out.println("Este es el dinero que tienes el tu tarjeta de debito " +hola.getSaldo_disponible());
        int sacar = Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto dinero quieres sacar?"));
        if (sacar < hola.getSaldo_disponible()){
            int resultado;
            resultado = hola.getSaldo_disponible() - sacar;
            JOptionPane.showMessageDialog(null, "El dinero que has sacado es " +sacar+ " Ahora el saldo que tienes en tu tarjeta es de " +resultado);
        }else{
            JOptionPane.showMessageDialog(null, "No tienes suficiente dinero para sacar");
        }
        return hola;
    }
    
    static public Tarjeta sacar_dinero_credito(){
        Tarjeta_credito adios = new Tarjeta_credito(5000, 300);
        JOptionPane.showMessageDialog(null, "Hola vas a sacar dinero con la tarjeta de credito");
        System.out.println("Este es el saldo que tienes en tu tarjeta de credito " +adios.getSaldo_disponible());
        System.out.println("Este es el credito que tienes disponible en la tajeta " +adios.getCredito_disponible());
        int total = adios.getSaldo_disponible() + adios.getCredito_disponible();
        JOptionPane.showMessageDialog(null, "Este es el saldo que tienes" +total);
        int sacar = Integer.parseInt(JOptionPane.showInputDialog("Cuanto dinero quieres sacar"));
        
        return adios;
    }
    
}   
