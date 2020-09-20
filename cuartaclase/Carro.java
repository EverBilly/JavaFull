public class Carro {
    String model;
    int year;

    public Carro() { //Constructor
        year = 2020;
    }

    public String getDatos() {
        return model + " -- " + year;
    }

    public void setModelo(String model) {
        this.model = model;
    }

    public static void main(String[] args){
        Carro primero = new Carro();
        primero.model = "Ferrari";
        
        System.out.println(primero.model + " " + primero.year);
        System.out.println(primero.getDatos());
    }

}