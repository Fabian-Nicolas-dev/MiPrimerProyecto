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
            System.out.println("Se agregó con éxito el auto: " + unAuto.getMarca() + " " + unAuto.getModelo());
        }

        // Metodo para mostrar todo su stock
        public void mostrarInventario() {
            System.out.println("=== INVENTARIO DE LA CONCESIONARIA: " + nombre + " ===");
            for (int i = 0; i < listaAutos.size(); i++) {
                Auto autoActual = listaAutos.get(i);
                System.out.println(i + ". " + autoActual.getMarca() + " " + autoActual.getModelo() + " (" + autoActual.getAnio() + ")");
            }
            System.out.println("==================================================");
        }

        // Método para buscar un auto por su marca
        public void buscarAutoPorMarca(String marcaBuscada) {
            boolean encontrado = false;

            for (int i = 0; i < listaAutos.size(); i++) {
                Auto autoActual = listaAutos.get(i);

                // Comparamos la marca del auto actual con la que buscamos
                // (Usamos .equalsIgnoreCase para que no importe si escriben en mayúscula o minúscula)
                if (autoActual.getMarca().equalsIgnoreCase(marcaBuscada)) {
                    System.out.println("¡Encontrado! Tenemos stock de: " + autoActual.getMarca() + " " + autoActual.getModelo() + " (" + autoActual.getAnio() + ")");
                    encontrado = true;
                }
            }

            if (!encontrado) {
                System.out.println("No se encontró ningún auto de la marca: " + marcaBuscada);
            }
        }
    }
