import java.util.ArrayList;
import java.util.List;

class Car {

}

class Cars {
    List<Car> carlist = new ArrayList<Car>();
}

public class ArrayListExample {
    public static void main(String[] args) {
        Cars carsInstancia = new Cars();

        for(int i = 0; i < 100; i++)
        carsInstancia.carlist.add(new Car());

        System.out.println(carsInstancia.carlist.size());
    }
}