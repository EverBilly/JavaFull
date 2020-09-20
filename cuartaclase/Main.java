import javax.swing.JOptionPane;

public class Main  {
    static char letra = 'E';
    public static void main(String[] args) {
        char c1 = 65;
        char c2 = '\u03A9';

        JOptionPane.showMessageDialog(null, "Hello World " + 
        "\nLetra: " + letra + "\nC1: " + c1 + "\nC2: " + c2);
    }
}