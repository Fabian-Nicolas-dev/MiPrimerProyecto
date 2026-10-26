import java.util.ArrayList;

public class Concesionaria {
    private String nombre;
    // 1. La lista ahora es de VEHICULOS (acepta autos, motos y lo que venga)
    private ArrayList<Vehiculo> listaVehiculos;

    public Concesionaria(String nombre) {
        this.nombre = nombre;
        this.listaVehiculos = new ArrayList<>();
    }

    // Método para agregar cualquier vehículo (Auto o Moto)
    public void agregarVehiculo(Vehiculo vehiculo) {
        listaVehiculos.add(vehiculo);
    }

    // Mostrar inventario con superpoderes de polimorfismo
    public void mostrarInventario() {
        System.out.println("=== INVENTARIO DE LA CONCESIONARIA: " + nombre + " ===");

        for (int i = 0; i < listaVehiculos.size(); i++) {
            Vehiculo v = listaVehiculos.get(i);

            // Mostramos los datos generales del Padre
            System.out.print(i + ". " + v.getMarca() + " " + v.getModelo() + " (" + v.getAnio() + ")");

            // ¡Magia técnica! Preguntamos qué tipo de vehículo es para mostrar su detalle exclusivo
            if (v instanceof Auto) {
                Auto autoCasting = (Auto) v; // Convertimos temporalmente el vehículo en Auto
                System.out.println(" - Puertas: " + autoCasting.getCantidadPuertas());
            } else if (v instanceof Moto) {
                Moto motoCasting = (Moto) v; // Convertimos temporalmente el vehículo en Moto
                System.out.println(" - Cilindrada: " + motoCasting.getCilindradas() + "cc");
            } else if (v instanceof Camioneta) {
                Camioneta camionetaCasting = (Camioneta) v;
                System.out.println(" - Carga: " + camionetaCasting.getCapacidadCarga() + "kg");
            }
        }
        System.out.println("==================================================");
    }

    // Método de búsqueda por marca adaptado para Vehiculos
    public void buscarVehiculoPorMarca(String marcaBuscada) {
        boolean encontrado = false;
        for (Vehiculo v : listaVehiculos) {
            if (v.getMarca().equalsIgnoreCase(marcaBuscada)) {
                System.out.println("¡Encontrado! Tenemos stock de: " + v.getMarca() + " " + v.getModelo() + " (" + v.getAnio() + ")");
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró ningún vehículo de la marca: " + marcaBuscada);
        }
    }

    // Método de eliminación por marca adaptado al revés para Vehiculos
    public void eliminarVehiculoPorMarca(String marcaAEliminar) {
        boolean eliminado = false;
        for (int i = listaVehiculos.size() - 1; i >= 0; i--) {
            Vehiculo v = listaVehiculos.get(i);
            if (v.getMarca().equalsIgnoreCase(marcaAEliminar)) {
                System.out.println("¡Vendido! Eliminando del stock: " + v.getMarca() + " " + v.getModelo());
                listaVehiculos.remove(i);
                eliminado = true;
                break;
            }
        }
        if (!eliminado) {
            System.out.println("No se pudo eliminar: No hay vehículos de la marca " + marcaAEliminar);
        }
    }
}