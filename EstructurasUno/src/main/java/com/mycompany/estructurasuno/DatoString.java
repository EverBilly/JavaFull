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
public class DatoString {
    
    public static void main(String args[]) {
        
        
        //Saber la longitud de una Cadena de Caracteres
        String name = JOptionPane.showInputDialog("Ingrese el Nombre");
        
        //Saber la ultima letra de una Cadena de Caracteres
        int letterFinal = name.length();
        
        JOptionPane.showMessageDialog(null, "Nombre: " + name + "\nLongitud: " +name.length()
        + "\nLa ultima letra es: " + name.charAt(letterFinal-1));
        
        //Extraer Letras de la cadena de caracteres
        String cad = "Bienvenido";
        System.out.println(cad.substring(0, 4));
        
        //Comparar Cadenas de Caracteres
        String cadena1, cadena2;
        cadena1 = "hola mundo";
        cadena2 = "HOLA MUNDO";
        
        System.out.println("Las Cadenas son: " + cadena1.equals(cadena2));
        System.out.println("Las Cadenas son: " + cadena1.equalsIgnoreCase(cadena2));
        
    }
}
