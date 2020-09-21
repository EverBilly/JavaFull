import java.util.ArrayList;
import java.util.List;

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

public class Listas {

    public static void main(String[] args) {
         List<Student> studentList = new ArrayList();
         studentList.add(new Student(1, "Jose"));
         studentList.add(new Student(2, "Maria"));
         studentList.add(new Student(3, "Fernanda"));

         for(int i = 0; i < studentList.size(); i++){
             System.out.println(studentList.get(i));
         }

         //Otra forma de imprimir la lista
         for(Student student : studentList){
             System.out.println(student);
         }

         //Imprimir con Lambda
         studentList.forEach(System.out::println);
         studentList.forEach(stu -> System.out.println(stu));
    }
}