public class Camioneta extends Vehiculo{

    private int capacidadCarga;

    public Camioneta(String marca, String modelo, int anio, int capacidadCarga, String patente) {
        super(marca, modelo, anio, patente);
        this.capacidadCarga = capacidadCarga;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }
}
