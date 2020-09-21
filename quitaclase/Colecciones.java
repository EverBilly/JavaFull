class Person {
    int id;
    String name;

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override //SobreEscritura
    public String toString(){
        return name;
    }
}

public class Colecciones {

    public static void main(String[] args) {
        Person[] arrayPersons = new Person[10];

        for(int i = 0; i < arrayPersons.length; i++){
            arrayPersons[i] = new Person(i, "Person");
            // System.out.println(arrayPersons[i]);
        }

        for(Person person : arrayPersons){
            System.out.println(person);
        }
    }
}