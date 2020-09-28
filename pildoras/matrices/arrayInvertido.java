package matrices;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class arrayInvertido {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int cantidadNumeros = Integer.parseInt(JOptionPane.showInputDialog("Ingres Cantidad de Numeros: "));
        int arrayNumeros[] = new int[cantidadNumeros];
        int invertido;
        
        for (int i = 0; i < cantidadNumeros; i++) {
            arrayNumeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Numero: "));
        }

        for (int i = 0; i < cantidadNumeros; i++) {
            // JOptionPane.showMessageDialog(null, "Array de Numeros", "Numeros", arrayNumeros[i]);
            System.out.print(arrayNumeros[i] + " ");
        }

        // for (int i : arrayNumeros) {
        //     System.out.println(" " + i);
        // }
    }
}