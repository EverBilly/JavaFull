public class arrayMulti {
    public static void main(String[] args) {
        int [][] multi = new int [4][5];
        
        multi[0][0] = 1;
        multi[0][1] = 2;
        multi[0][2] = 3;
        multi[0][3] = 4;
        multi[0][4] = 5;

        multi[1][0] = 6;
        multi[1][1] = 7;
        multi[1][2] = 8;
        multi[1][3] = 9;
        multi[1][4] = 10;

        multi[2][0] = 11;
        multi[2][1] = 12;
        multi[2][2] = 13;
        multi[2][3] = 14;
        multi[2][4] = 15;

        multi[3][0] = 16;
        multi[3][1] = 17;
        multi[3][2] = 18;
        multi[3][3] = 19;
        multi[3][4] = 20;

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 5; j++ ) {
                System.out.print(multi[i][j] + " ");
            }
        }
    }
}