class Person {
    String nombre;
}

public class Objetos {
    public static void main(String[] args) {
        Person p;
        p = new Person();

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