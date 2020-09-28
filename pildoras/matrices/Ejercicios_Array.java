import javax.swing.JOptionPane;

public class Ejercicios_Array {

    public static void rellenarValores(int numeros[]) {

        for(int i=0;i<numeros.length;i++){
            String texto=JOptionPane.showInputDialog("Introduce un numero");
            numeros[i]=Integer.parseInt(texto);
//            System.out.print(texto + " ");
        }
        System.out.println("Array Ordenado");
    }

    public static void mostrarValores(int numeros[]) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Indice: " + i + " Numero Array: " + numeros[i]);
        }
    }

    public static void arrayInvertido(int numeros[]) {
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("Array Invertido");
    }

    public static void main(String[] args) {
        int cantidad[] = new int[5];

        rellenarValores(cantidad);
        mostrarValores(cantidad);
        arrayInvertido(cantidad);
    }
}