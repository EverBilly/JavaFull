import java.util.ArrayList;
import java.util.List;

public class Supermercado {

    //MOSTRAR CLIENTES
    List<Cliente> clientes = new ArrayList<>();
    public void mostrarClientes() {
        if(clientes.isEmpty()){
            System.out.println("No hay clientes registrados.");
        }
        else {
            for(Cliente cliente: clientes){
                System.out.println(cliente);
            }
        }
    }

    //AGREGAR CLIENTES
    public void agregarClientes(Cliente cliente) {
        //No ingresar un cliente con el mismo dpi
        this.getClientes().add(cliente);
    }

    //GETER DE CLIENTES ^
    public List<Cliente> getClientes() {
        return clientes;
    }

    //BORRAR CLIENTE
    public boolean borrarCliente(String dpi) {
        boolean rpta = false;
        for(Cliente c: this.getClientes()) {
            if(c.dpi.equals(dpi)) {
                this.getClientes().remove(c);
                rpta = true;
                break;
            }
        }
        return rpta;
    }
    public static void main(String[] args) {
        
    }
}