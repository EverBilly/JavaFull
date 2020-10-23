//package poo;

//Solo debe haber una public class en el archivo de java 
//Las demas pueden ser Class nombre_clase
public class Coche {

    //Variables para utilizar en el Constructor
    private int ruedas, largo, ancho, motor, peso_plataforma;
    private int peso_total;
    private String color;
    private boolean asientos_cuero, climatizador;
    

    //Constructor debe tener el mismo nombre de la clase
    public Coche() {
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso_plataforma = 500;
    }

    //Metodo GETTER sirve para obtener datos siempre lleva un return
    //Indicar el tipo de dato que devuelve
    public String datos_generales() {
        return "La plataforma del Vehiculo tiene: " + ruedas +
        " ruedas " + ". Mide " + largo/1000 + " metros con ancho de: "
        + ancho + " cm y un peso de plataforma de: " + peso_plataforma
        + " kg";
    }

    //Metodo GETTER del SETTER establecer_color
    public String color_coche() {
        return "El color del Coche es: " + color;
    }

    //GETTER
    public String dime_asientos() {
        if(asientos_cuero == true) {
            return "El coche tiene asientos de cuero";
        }
        else {
            return "No tiene asientos de serie";
        }
    }

    //GETTER
    public String dime_climatizador() {
        if(climatizador == true) {
            return "El auto tiene climatizador";
        }
        else {
            return "El auto no tiene climatizador";
        }
    }

    //GETTER
    public int precio_coche() {
        int precio_final = 10000;

        if(asientos_cuero == true) {
            precio_final += 2000;
        }
        if(climatizador == true) {
            precio_final += 1500;
        }

        return precio_final;
    }

    //Metodo SETTER sirve para establecer el valor de la propiedad de los objetos
    //Void no devuelve nada
    public void establecer_color(String colocar_color) {
        // color = "Blue";
        color = colocar_color;
    }

    //SETTER
    public void configura_asientos(String asientos_cuero) {
     //This sirve para acceder a la variable de la clase
     //para diferenciar cuando mandamos un argumento por un metodo
     //si tienen el mismo nombre
        if(asientos_cuero.equalsIgnoreCase("si")){
            this.asientos_cuero = true;
        }
        else {
            this.asientos_cuero = false;
        }
    }

    //SETTER 
    public void configura_climatizador(String climatizador) {
        if (climatizador.equalsIgnoreCase("si")) {
            this.climatizador = true;
        } else {
            this.climatizador = false;
        }
    }

    //GETTER Y SETTER establecemos el valor de una variable y obtenemos una variable
    public String dime_peso_coche() {
        int peso_carroceria = 500;
        peso_total = peso_plataforma + peso_carroceria;

        if (asientos_cuero == true) {
            peso_total = peso_total + 50;
        }
        if (climatizador == true) {
            peso_total = peso_total + 50;
        }

        return "El peso del coche es: " + peso_total;
    }
}