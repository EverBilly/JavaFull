import java.util.HashMap;
import java.util.Map;

class Employee {
    int id;
    String name;

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

public class OtrasColecciones {
    public static void main(String[] args) {
        Map<String, Employee> mapObj = new HashMap<>();
        mapObj.put("12", new Employee(1, "David"));
        mapObj.put("13", new Employee(2, "Ever"));

        System.out.print(mapObj.get("12"));
    }
}