class Person {
    String nombre;
}

public class Objetos {
    public static void main(String[] args) {
        Person p;
        // System.out.println(p);
        p = new Person();
        // System.out.println(p);

        Person p2 = new Person();   //p2                (person2)
        p2.nombre = "Jose";

        p2 = null;                  //p2........

        new Person();               //                  (person3)

        int value = 100;
        if(value > 50){
            Person p3 = new Person(); //p3 ======> (person4)
            p3.nombre = "Elder";
        }
        System.out.println(p3.nombre);
    }
}