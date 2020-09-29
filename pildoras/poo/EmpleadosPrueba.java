public class EmpleadosPrueba {
    public static void main(String[] args) {
        Empleados trabajador1 = new Empleados("Juan");
        Empleados trabajador2 = new Empleados("Diana");
        Empleados trabajador3 = new Empleados("Aura");
        Empleados trabajador4 = new Empleados("Jose");

        trabajador1.setSeccion("Recursos humanos");
//        trabajador1.setNombre("Liza");

        System.out.println(trabajador1.getDatos());
        System.out.println(trabajador2.getDatos());
        System.out.println(trabajador3.getDatos());
        System.out.println(trabajador4.getDatos());
    }
}

class Empleados {

    private final String nombre;
    private String seccion;
    private int id;
    private static int idSiguiente = 1;

    public Empleados(String nom) {
        this.nombre = nom;
        this.seccion = "Administracion";
        this.id = idSiguiente;
        idSiguiente++;
    }

    //METODOS SETTER

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    //Ya no se puede utilizar esto por que nombre ahora es una constante, no se puede modificar su valor
    /*public void setNombre(String nombre) {
        this.nombre = nombre;
    }*/

    //METODOS GETTER

    public String getDatos() {
        return "El Nombre es: " + nombre + " La seccion es: " + seccion + " Id es: " + id;
    }
}