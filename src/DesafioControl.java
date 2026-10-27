import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;
import java.util.ArrayList; // ¡1. IMPORTANTE: Acá traemos la librería de la estantería elástica!

public class DesafioControl {
    public static void main(String[] args) {
        Concesionaria miAgencia = new Concesionaria("Autos y Motos del Sur S.A.");

        Auto auto1 = new Auto("Ford", "Mustang", 2026, 2, "ABC123");
        Auto auto2 = new Auto("Chevrolet", "Camaro", 2024, 4, "BCD234");
        Moto moto1 = new Moto("Yamaha", "MT-03", 2023, 321, "CDE345");
        Camioneta cami1 = new Camioneta("Toyota", "Hilux", 2022, 1000,"DEF456");

        miAgencia.agregarVehiculo(auto1);
        miAgencia.agregarVehiculo(auto2);
        miAgencia.agregarVehiculo(moto1);
        miAgencia.agregarVehiculo(cami1);

        System.out.println("");

        miAgencia.mostrarInventario();

        System.out.println("");

        miAgencia.buscarVehiculoPorMarca("Yamaha");
        miAgencia.buscadorPorPatente("ABC123");

    }
}