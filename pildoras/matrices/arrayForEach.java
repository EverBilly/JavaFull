public class arrayForEach {
    public static void main(String[] args) {
        int [][] array = {
            {10, 11, 12, 13, 14},
            {20, 21, 22, 23, 24},
            {30, 31, 32, 33, 34},
            {40, 41, 42, 43, 44},
            {50, 51, 52, 53, 54}
        };
        
        for (int[] fila : array) {
            System.out.println();
            for (int columna : fila) {
                System.out.print(columna + " ");
            }
        }


    }
}