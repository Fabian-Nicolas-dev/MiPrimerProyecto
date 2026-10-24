import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;
import java.util.ArrayList; // ¡1. IMPORTANTE: Acá traemos la librería de la estantería elástica!

public class DesafioControl {
    public static void main(String[] args) {

        ArrayList<Auto> listaAutos = new ArrayList<>();

        listaAutos.add(new Auto("Ford","Mustang",2026));
        listaAutos.add(new Auto("Chevrolet","Camaro",2024));
        listaAutos.add(new Auto("Autoneitor","Terreneitor",2145));


        System.out.println("--- REPORTE OFICIAL DEL BANCO (CON ARRAYLIST) ---");


        for (int i = 0; i < listaAutos.size(); i++) {
            Auto autoActual = listaAutos.get(i);

            System.out.println("Auto en casillero " + i + ": " + autoActual.marca + " " + autoActual.modelo);

        }
        listaAutos.remove(1);
        System.out.println("--- AUTOS DESPUÉS DE LA VENTA ---");

        for (int i = 0; i < listaAutos.size(); i++) {
            Auto autoActual1 = listaAutos.get(i);

            System.out.println("Auto en casillero " + i + ": " + autoActual1.marca + " " + autoActual1.modelo);

        }
    }
}