//package poo;

import javax.swing.JOptionPane;

public class Uso_Coche {
    public static void main(String[] args) {
        //Instanciar la clase para crear Objetos
        //Nombre de la clase - nombre variable = new nombre del Constructor
        Coche marcaCoche = new Coche();

        System.out.println(marcaCoche.datos_generales());

        //SETTER
        marcaCoche.establecer_color(JOptionPane.showInputDialog("Introduce Color"));
        marcaCoche.configura_asientos(JOptionPane.showInputDialog("Tiene Asientos de Cuero?"));
        marcaCoche.configura_climatizador(JOptionPane.showInputDialog("Tiene Climatizador?"));

        //GETTER
        System.out.println(marcaCoche.color_coche());
        System.out.println(marcaCoche.dime_asientos());
        System.out.println(marcaCoche.dime_climatizador());
        System.out.println(marcaCoche.dime_peso_coche());
        System.out.println("El precio del Coche es: " + marcaCoche.precio_coche());
    }
}