import java.util.Scanner;

public class Cliente {

    String nombre;
    String dpi;
    String celular;

    public void registrarDatos() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingresa el Nombre del Cliente: ");
        this.setNombre(scan.nextLine());
        System.out.println("Ingrese el Numero de DPI: ");
        this.setDpi(scan.nextLine());
        System.out.println("Ingrese el Numero de Celular: ");
        this.setCelular(scan.nextLine());
    }

    //DECLARACION SET DE LOS PARAMETROS QUE SE INGRESARAN EN LA TABLA
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " " + "DPI: " + dpi;
    }
    public static void main(String[] args) {
        
    }
}