import javax.swing.JOptionPane;

public class Matrices_ForEach {
    public static void main(String[] args) {
        String [] paises = new String[5];
        int aleatorios [] = new int[150];

        //For para solicitar paises desde el Teclado
        for(int i = 0; i < paises.length; i++) {
            paises[i] = JOptionPane.showInputDialog("Introduce un pais");
            System.out.println(paises[i]);
        }

        //FOREACH
        for (String pais : paises) {
            System.out.println("Pais: " + pais);
        }

        //Recorrer aleatorios
        for(int i = 0; i < aleatorios.length; i++) {
            aleatorios[i] = (int)Math.round(Math.random()*50);
        }
        //Imprimir El Arreglo de los Numeros Aleatorios
        System.out.print("Numeros: [ ");
        for (int numeros : aleatorios) {
            System.out.print(numeros + ", ");
        }
        System.out.println("]");
    }
}