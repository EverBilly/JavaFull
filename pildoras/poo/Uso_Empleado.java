//import java.util.Date;
import  java.util.*;

public class Uso_Empleado {
    public static void main(String[] args) {
        //Pasar los parametros que solicitamos en el constructor
        /*Empleado empleado1 = new Empleado("Juan", 7000, 2019, 8, 01);
        Empleado empleado2 = new Empleado("Ever", 7500, 2020, 11, 01);
        Empleado empleado3 = new Empleado("Fernanda", 5000, 2019, 02, 01);

        empleado1.setSueldo(5);
        empleado2.setSueldo(5);
        empleado3.setSueldo(5);

        System.out.println("Nombre: " + empleado1.getNombre() + " Sueldo: " + empleado1.getSueldo()
                + " Fecha de Contratacion: " + empleado1.getAltaContrato());
        System.out.println("Nombre: " + empleado2.getNombre() + " Sueldo: " + empleado2.getSueldo()
                + " Fecha de Contratacion: " + empleado2.getAltaContrato());
        System.out.println("Nombre: " + empleado3.getNombre() + " Sueldo: " + empleado3.getSueldo()
                + " Fecha de Contratacion: " + empleado3.getAltaContrato());*/

        Empleado[] empleados = new Empleado[3];
        empleados[0] = new Empleado("Juan", 7000, 2019, 8, 01);
        empleados[1] = new Empleado("Ever", 7500, 2020, 11, 01);
        empleados[2] = new Empleado("Fernanda", 5000, 2019, 02, 01);

        //FOR NORMAL
        System.out.println("FOR NORMAL");
        for (int i = 0; i < empleados.length; i++) {
            empleados[i].setSueldo(5);
        }

        for (int i = 0; i <empleados.length; i++) {
            System.out.println("Nombre: " + empleados[i].getNombre() +
                    " Sueldo: " + empleados[i].getSueldo() +
                    " Fecha Contratacion: " + empleados[i].getAltaContrato());
        }

        //FOREACH
        System.out.println("FOREACH");
        for (Empleado e: empleados) {
            e.setSueldo(5);
        }

        for (Empleado e : empleados) {
            System.out.println("Nombre: " + e.getNombre() +
                    " Sueldo: " + e.getSueldo() +
                    " Fecha Contratacion: " + e.getAltaContrato());
        }

    }
}

class Empleado {
    //Recibir parametros en el constructor
    public Empleado(String nom, double sue, int anio, int mes, int dia) {

        //El nombre de la variable de clase = nombre de la variable del argumento del constructor
        nombre = nom;
        sueldo = sue;

        //Gregorian Calendar para construir una fecha
        //Al mes se le resta uno xq los meses empiezan Enero = 0, Febrero = 1 etc
        GregorianCalendar fecha_calendario = new GregorianCalendar(anio, mes - 1, dia);

        //getTime metodo de la clase GregorianCaledar para devolver la fecha por los parametros que estamos pasando
        altaContrato = fecha_calendario.getTime();

        //Herencia: Construir una clase que herede de otra
    }

    //GETTER

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Date getAltaContrato() {
        return altaContrato;
    }
    //FIN GETTER

    //SETTER

    public void setSueldo(double porcentaje) {
        double aumento = this.sueldo * porcentaje / 100;
        this.sueldo += aumento;
    }
    //FIN SETTER

    //Variables a las cuales se le pasaran los datos del constructor
    private String nombre;
    private double sueldo;
    private Date altaContrato;
}