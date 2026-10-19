import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class DesafioControl {
    public static void main(String[] args) {

        Auto miAuto = new Auto();

        miAuto.marca = "Fiat";
        miAuto.modelo = "Cronos";
        miAuto.anio = 2024;

        System.out.println("Mi auto es un " + miAuto.marca + " " + miAuto.modelo + " del año " + miAuto.anio);

        Auto elAutoDeMiVieja = new Auto();
        elAutoDeMiVieja.marca = "Volkswagen";
        elAutoDeMiVieja.modelo = "Gol";
        elAutoDeMiVieja.anio = 2018;

        System.out.println("El auto de mi vieja es un " + elAutoDeMiVieja.marca + " " + elAutoDeMiVieja.modelo + " del año " + elAutoDeMiVieja.anio);


        }
}
