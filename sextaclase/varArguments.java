class Calculator{
    public int sum(int... nums) { //Var Arguments
        int total = 0;
        for(int a: nums){
            total += a;
        }
        
        return total;
    }

    public int sum(int x) {
        return x;
    }
}

public class varArguments{

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1, 13));
        // System.out.println(calc.sum());
        // System.out.println(calc.sum(20, 12, 15));

        // PARA CADENAS STRING
        StringBuffer sb = new StringBuffer();
        sb.append("Hola ");
        sb.append("Como ");
        sb.append("Estas");
        System.out.println(sb);//Internamente llama al metodo toString(); 

        StringBuilder sbu = new StringBuilder();
        StringBuilder sbu1 = new StringBuilder("Learning Java");
        StringBuilder sbu2 = new StringBuilder(sbu1);

        sbu2.insert(4, "Always");
        System.out.println(sbu2);
        sbu2.delete(4,10);
        System.out.println(sbu2);
        
    }
}