/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.estructurasuno;

import javax.swing.JOptionPane;

/**
 *
 * @author evercifuentes
 */
public class ClassMath {
    
    public static void main(String args[]) {
        
        //Calcular la Raiz Cuadrada de un Numero
        double calcular =  Double.parseDouble(JOptionPane.showInputDialog("INGRESE RAIZ"));
        double numero = Math.sqrt(calcular);
        System.out.println("La Raiz es: "+ numero);
        
        //Redondear un numero
        double redondear = Double.parseDouble(JOptionPane.showInputDialog("INGRESE REDONDEAR"));
        int redondo = (int)Math.round(redondear);
        System.out.println("El Numero Redondo es: " + redondo);
        
        //Elevar un numero
        double base = Double.parseDouble(JOptionPane.showInputDialog("INGRESE BASE"));        
        double exponente = Double.parseDouble(JOptionPane.showInputDialog("INGRESE EXPONENETE"));
        int elevado = (int)Math.pow(base, exponente);
        System.out.println("El numero Elevado es: " + elevado);
    }
}
