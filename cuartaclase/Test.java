class Car {
    int age;
}

class Test {
    public static void main(String[] args) {
        Car a = new Car();
        Car b = a;

        a.age = 10;
        System.out.println(b.age);

        int num1 = 10;
        int num2 = num1;
        num1 = 15;
        num2 = ++num2;
        System.out.println(num1);
        System.out.println(num2);

        Car auto1 = new Car(); //Este Es un objeto nuevo
        auto1.age = 5;

        Car auto2 = new Car(); //Este es otro objeto nuevo
        auto2.age = 5;

        Object c = auto1; //C =======> auto1

        System.out.println(auto1 == auto2); //False
        System.out.println(c == auto1); //True

    }
}