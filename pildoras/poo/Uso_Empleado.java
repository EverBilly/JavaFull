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

        Jefatura jefe_RRHH = new Jefatura("Marcos", 7000,2016,1,1);
        jefe_RRHH.setIncentivo(2500);

        Empleado[] empleados = new Empleado[6];
        empleados[0] = new Empleado("Juan", 7000, 2019, 8, 01);
        empleados[1] = new Empleado("Ever", 7500, 2020, 11, 01);
        empleados[2] = new Empleado("Fernanda", 5000, 2019, 02, 01);
        empleados[3] = new Empleado("Jose Luis");
        empleados[4] = jefe_RRHH; //Polimorfismo en Accion. Principio de Sustitucion
        empleados[5] = new Jefatura("Diana", 5000, 2018, 5, 1);

        Jefatura jefa_Finanzas = (Jefatura) empleados[5];
        jefa_Finanzas.setIncentivo(10000);

        Empleado director_comercial = new Jefatura("Sandra", 6000, 2014, 05, 25);
        Comparable comparable = new Empleado("Eliza", 4000, 2017, 01, 01);

        System.out.println(jefa_Finanzas.tomar_decisiones("Dar mas Vacaciones a Empleados"));

        if (director_comercial instanceof Empleado) {
            System.out.println("Es de tipo Jefatura");
        }
        if (comparable instanceof Comparable) {
            System.out.println("Implementa la interfaz Comparable");
        }

        //Jefatura jefe_compras = (Jefatura) empleados[1];

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

        Arrays.sort(empleados);

        for (Empleado e : empleados) {
            System.out.println("Nombre: " + e.getNombre() +
                    " Sueldo: " + e.getSueldo() +
                    " Fecha Contratacion: " + e.getAltaContrato());
        }

    }
}

class Empleado implements Comparable {
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

    //Otro Constructor, Sobrecarga de Constructores
    //Varios constructores no pueden llamar la misma cantidad de argumentos
    public Empleado(String nom) {
//        this.nombre = nom;
        this(nom, 6500, 2015, 2, 1);
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
    public int compareTo(Object object) {
        Empleado empleado = (Empleado) object;
        if(this.sueldo < empleado.sueldo) {
            return -1;
        }
        if(this.sueldo > empleado.sueldo) {
             return 1;
        }
        return 0;
    }
}

class Jefatura extends Empleado implements Jefes {
    private double incentivo;

        public Jefatura(String nombre, double sueldo, int anio, int mes, int dia) {
            super(nombre, sueldo, anio, mes, dia);
        }

        //Desarrollando metodo de la Interfaz Jefes
        public String tomar_decisiones(String decision) {
            return "Un miembro de la directiva ha tomado decision de: " + decision;
        }

        public void setIncentivo(double incentivo) {
            this.incentivo = incentivo;
        }

        public double getSueldo() {
            double sueldoJefe = super.getSueldo();
            return sueldoJefe + incentivo;
        }
}

class  Director extends Jefatura {
    public Director(String nombre, double sueldo, int anio, int mes, int dia) {
        super(nombre, sueldo, anio, mes, dia);
    }
}