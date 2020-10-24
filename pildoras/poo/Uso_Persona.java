import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {
    public static void main(String[] args) {

        Persona[] personas = new Persona[2];
        personas[0] = new Empleado2("Jose Lopez", 5000, 2016, 5, 20);
        personas[1] = new Alumno("Mayte Ramirez", "Ingenieria Civil");

        for (Persona p: personas) {
            System.out.println(p.getNombre() + ", " + p.getDescripcion());
        }
    }
}

abstract class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract String getDescripcion();
}

class Empleado2 extends Persona {
    //Recibir parametros en el constructor
    public Empleado2(String nom, double sue, int anio, int mes, int dia) {
    super(nom);
        //El nombre de la variable de clase = nombre de la variable del argumento del constructor
        sueldo = sue;

        //Gregorian Calendar para construir una fecha
        //Al mes se le resta uno xq los meses empiezan Enero = 0, Febrero = 1 etc
        GregorianCalendar fecha_calendario = new GregorianCalendar(anio, mes - 1, dia);

        //getTime metodo de la clase GregorianCaledar para devolver la fecha por los parametros que estamos pasando
        altaContrato = fecha_calendario.getTime();

        //Herencia: Construir una clase que herede de otra
    }

    //GETTER
    public double getSueldo() {
        return sueldo;
    }
    public Date getAltaContrato() {
        return altaContrato;
    }

    @java.lang.Override
    public String getDescripcion() {
        return "Este empleado tiene un sueldo de: " + sueldo;
    }
    //FIN GETTER

    //SETTER

    public void setSueldo(double porcentaje) {
        double aumento = this.sueldo * porcentaje / 100;
        this.sueldo += aumento;
    }
    //FIN SETTER

    //Variables a las cuales se le pasaran los datos del constructor
    private double sueldo;
    private Date altaContrato;
}

class Alumno extends Persona {

    private String carrera;

    public Alumno(String nombre, String carrera) {
        super(nombre);
        this.carrera = carrera;
    }

    @java.lang.Override
    public String getDescripcion() {
        return "Este alumno esta estudiando: " + this.carrera;
    }
}