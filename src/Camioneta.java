public class Camioneta extends Vehiculo{

    private int capacidadCarga;

    public Camioneta(String marca, String modelo, int anio, int capacidadCarga) {
        super(marca, modelo, anio);
        this.capacidadCarga = capacidadCarga;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }
}
