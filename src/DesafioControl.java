import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;
import java.util.ArrayList; // ¡1. IMPORTANTE: Acá traemos la librería de la estantería elástica!

public class DesafioControl {
    public static void main(String[] args) {

        // 1. Creamos la Concesionaria
        Concesionaria miAgencia = new Concesionaria("Autos del Sur S.A.");

        // 2. Creamos los autos por separado
        Auto auto1 = new Auto("Ford", "Mustang", 2026);
        Auto auto2 = new Auto("Chevrolet", "Camaro", 2024);
        Auto auto3 = new Auto("Autoneitor", "Terreneitor", 2145);

        // 3. Le decimos a la concesionaria que guarde los autos usando sus propios métodos
        miAgencia.agregarAuto(auto1);
        miAgencia.agregarAuto(auto2);
        miAgencia.agregarAuto(auto3);

        System.out.println(""); // Un renglón en blanco para separar

        // 4. Le pedimos a la concesionaria que muestre su inventario
        miAgencia.mostrarInventario();

        // Probamos si la agencia tiene un Ford
        miAgencia.buscarAutoPorMarca("Ford");

        // Probamos con una marca que no tengamos
        miAgencia.buscarAutoPorMarca("Ferrari");
    }
}