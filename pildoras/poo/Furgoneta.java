public class Furgoneta extends Coche {

    private int capacidad_carga, plazas_extra;

    public Furgoneta(int plazas_extra, int capacidad_carga) {
        //Super llama al constructor de la clase padre
        //EJ: public Coche() { mas lo que tiene el constructor }
        super();
        this.capacidad_carga = capacidad_carga;
        this.plazas_extra = plazas_extra;
    }
}