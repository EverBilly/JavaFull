import java.util.HashSet;
import java.util.Set;

public class demoColecciones {
    public static void main(String[] args) {
        Set<String> set1  = new HashSet<>();
        set1.add("Miami");
        set1.add("Sydney");
        set1.add("New York");
        set1.add("Dubai");
        System.out.println(set1);

        for(String s : set1 ){
            System.out.println(s.toUpperCase());
        }

        set1.forEach(e -> System.out.println(e.toLowerCase()));

        Set<String> set2 = new HashSet<>();
        set2.add("Yakarta");
        set2.add("Toronto");
        System.out.println(set2); 

        set1.addAll(set2);
        System.out.println("Elementos Juntos: " + set1.size());

        set1.removeAll(set2);
        System.out.println("Elementos sin SET2: " + set1.size());
    }
}