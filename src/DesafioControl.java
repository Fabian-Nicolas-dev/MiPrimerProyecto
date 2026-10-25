import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;
import java.util.ArrayList; // ¡1. IMPORTANTE: Acá traemos la librería de la estantería elástica!

public class DesafioControl {
    public static void main(String[] args) {

        ArrayList<Auto> listaAutos = new ArrayList<>();

        listaAutos.add(new Auto("Ford","Mustang",2026));
        listaAutos.add(new Auto("Chevrolet","Camaro",2024));
        listaAutos.add(new Auto("Autoneitor","Terreneitor",2145));
        listaAutos.add(new Auto("Toyota", "Hilux", 2025));


        System.out.println("--- REPORTE DE AUTOS (CON ARRAYLIST) ---");


        for (int i = 0; i < listaAutos.size(); i++) {
            Auto autoActual = listaAutos.get(i);

            if (autoActual.anio >= 2024) {
                System.out.println("Modelo reciente: " + autoActual.marca + " " + autoActual.modelo + " " + autoActual.anio);
            } else {
                System.out.println("Modelo clásico: " + autoActual.marca + " " + autoActual.modelo + " " + autoActual.anio);
            }


        }
        listaAutos.remove(0);
        System.out.println("--- STOCK ACTUALIZADO ---");

        for (int i = 0; i < listaAutos.size(); i++) {
            Auto autoActual1 = listaAutos.get(i);

            System.out.println("Auto en casillero " + i + ": " + autoActual1.marca + " " + autoActual1.modelo);

        }
    }
}