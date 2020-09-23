import java.util.*;

public class Main {

    public static void main(String[] args) {
        Supermercado supermercado = new Supermercado();
        
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Seleccione una Opcion: \n" 
            + "1. Gestion de Clientes\n" 
            + "2. Gestion de Vendedores\n" 
            + "3. Gestion de Productos\n"
            + "4. Ventas\n"
            + "5. Salir");
            int opcion = scan.nextInt();
            scan.nextLine();

            switch (opcion) {
                case 1:
                    while(true){
                        boolean retornarAMenu = false;
                        System.out.println("Seleccione una Opcion: \n"
                        + "1. Mostrar Clientes\n" 
                        + "2. Agregar Cliente\n"
                        + "3. Borrar Cliente\n"
                        + "4. Borrar todos los clientes\n"
                        + "5. Regresar\n");
                        opcion = scan.nextInt();
                        scan.nextLine();
                        switch(opcion){
                            case 1:
                                supermercado.mostrarClientes();
                                break;
                            case 2:
                                Cliente cliente = new Cliente();
                                cliente.registrarDatos();
                                supermercado.agregarClientes(cliente);
                                break;
                            case 3: 
                                System.out.println("Ingrese el DPI del Cliente: ");
                                String dpi = scan.nextLine();
                                if(supermercado.borrarCliente(dpi)){
                                    System.out.println("Cliente Eliminado Correctamente");
                                }
                                else {
                                    System.out.println("Cliente no Encontrado");
                                }
                                break;
                            case 4:
                                supermercado.getClientes().clear();
                                break;
                            case 5:
                                retornarAMenu = true;
                                break;
                        }
                        if(retornarAMenu){

                        }
                        break;
                    }
                    break;
                case 2:

                    break;
                case 3:

                    break;
                
                case 4: 

                    break;

                case 5: 
                    System.exit(0);
                    break;
            }
        }
    }
}