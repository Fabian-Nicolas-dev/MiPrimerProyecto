import java.util.HashMap;

public class Concesionaria {
    private String nombre;

    // El HashMap guarda la Patente (String) como Clave y el Vehiculo como Valor
    private HashMap<String, Vehiculo> stockVehiculos;

    public Concesionaria(String nombre) {
        this.nombre = nombre;
        this.stockVehiculos = new HashMap<>();
    }

    // Método para agregar vehículos usando .put()
    public void agregarVehiculo(Vehiculo vehiculo) {
        stockVehiculos.put(vehiculo.getPatente(), vehiculo);
        System.out.println("Vehículo registrado con patente: " + vehiculo.getPatente());
    }

    // Mostrar inventario adaptado al HashMap usando .values()
    public void mostrarInventario() {
        System.out.println("=== INVENTARIO DE LA CONCESIONARIA: " + nombre + " ===");

        int contador = 0; // Usamos un contador visual para numerar en pantalla
        for (Vehiculo v : stockVehiculos.values()) {
            System.out.print(contador + ". " + v.getMarca() + " " + v.getModelo() + " (" + v.getAnio() + ") - Patente: " + v.getPatente());

            if (v instanceof Auto) {
                Auto autoCasting = (Auto) v;
                System.out.println(" - Puertas: " + autoCasting.getCantidadPuertas());
            } else if (v instanceof Moto) {
                Moto motoCasting = (Moto) v;
                System.out.println(" - Cilindrada: " + motoCasting.getCilindradas() + "cc");
            } else if (v instanceof Camioneta) {
                Camioneta camionetaCasting = (Camioneta) v;
                System.out.println(" - Carga: " + camionetaCasting.getCapacidadCarga() + "kg");
            }
            contador++;
        }
        System.out.println("==================================================");
    }

    // Método de búsqueda por marca adaptado con .values()
    public void buscarVehiculoPorMarca(String marcaBuscada) {
        boolean encontrado = false;

        // Usamos .values() para poder recorrer los vehículos del mapa
        for (Vehiculo v : stockVehiculos.values()) {
            if (v.getMarca().equalsIgnoreCase(marcaBuscada)) {
                System.out.println("¡Encontrado! Tenemos stock de: " + v.getMarca() + " " + v.getModelo() + " (" + v.getAnio() + ")");
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró ningún vehículo de la marca: " + marcaBuscada);
        }
    }

    // Método de eliminación adaptado para buscar la patente y borrar del mapa
    public void eliminarVehiculoPorMarca(String marcaAEliminar) {
        String patenteAEliminar = null;

        for (Vehiculo v : stockVehiculos.values()) {
            if (v.getMarca().equalsIgnoreCase(marcaAEliminar)) {
                patenteAEliminar = v.getPatente();
                break; // Encontramos el primero y salimos del bucle
            }
        }

        if (patenteAEliminar != null) {
            Vehiculo eliminado = stockVehiculos.remove(patenteAEliminar); // .remove() borra usando la clave
            System.out.println("¡Vendido! Eliminando del stock: " + eliminado.getMarca() + " " + eliminado.getModelo());
        } else {
            System.out.println("No se pudo eliminar: No hay vehículos de la marca " + marcaAEliminar);
        }
    }

    // Búsqueda ultrarrápida por Patente (La gran ventaja del HashMap)
    public void buscadorPorPatente(String patenteBuscada) {
        Vehiculo v = stockVehiculos.get(patenteBuscada);

        if (v != null) {
            System.out.println("¡Encontrado al instante! Es un " + v.getMarca() + " " + v.getModelo() + " (Patente: " + v.getPatente() + ")");
        } else {
            System.out.println("No existe ningún vehículo registrado con la patente: " + patenteBuscada);
        }
    }
}