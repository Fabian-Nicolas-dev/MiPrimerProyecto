import java.util.ArrayList;

    public class Concesionaria {

        // Atributos de la concesionaria
        String nombre;
        ArrayList<Auto> listaAutos; // ¡Mirá esto! Una lista de objetos Auto adentro de otra clase

        // Constructor: cuando nace la concesionaria, le ponemos nombre y le creamos la estantería vacía
        public Concesionaria(String nombreConcesionaria) {
            this.nombre = nombreConcesionaria;
            this.listaAutos = new ArrayList<>();
        }

        // Metodo para agregar un auto a su propia lista
        public void agregarAuto(Auto unAuto) {
            listaAutos.add(unAuto);
            System.out.println("Se agregó con éxito el auto: " + unAuto.marca + " " + unAuto.modelo);
        }

        // Metodo para mostrar todo su stock
        public void mostrarInventario() {
            System.out.println("=== INVENTARIO DE LA CONCESIONARIA: " + nombre + " ===");
            for (int i = 0; i < listaAutos.size(); i++) {
                Auto autoActual = listaAutos.get(i);
                System.out.println(i + ". " + autoActual.marca + " " + autoActual.modelo + " (" + autoActual.anio + ")");
            }
            System.out.println("==================================================");
        }
    }

