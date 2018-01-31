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
    int ruedas;
    int largo;
    int ancho;
    int motor;
    int peso;
    
    public coche(){ // Esto es un constructor y sirve para inicializar las propiedades del objeto
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso = 2500;
    }
}

// Porque es mejor inicializar todas las proipiedades del objeto en el constructor
// si por ejemplo cuando creamos la clase cuando las declaramos también las podemos inicializar?