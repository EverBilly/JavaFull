package poo;
public class Uso_Coche {
    public static void main(String[] args) {
        //Instanciar la clase para crear Objetos
        //Nombre de la clase - nombre variable = new nombre del Constructor
        Coche marcaCoche = new Coche();

        System.out.println(marcaCoche.datos_generales());

        //SETTER
        marcaCoche.establecer_color("Azul");
        marcaCoche.configura_asientos("si");
        marcaCoche.configura_climatizador("si");

        //GETTER
        System.out.println(marcaCoche.color_coche());
        System.out.println(marcaCoche.dime_asientos());
        System.out.println(marcaCoche.dime_climatizador());
        System.out.println(marcaCoche.dime_peso_coche());
        System.out.println("El precio del Coche es: " + marcaCoche.precio_coche());
    }
}