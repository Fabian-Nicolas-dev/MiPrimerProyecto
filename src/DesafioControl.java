import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class DesafioControl {
    public static void main(String[] args) {

        Auto autoNuevo = new Auto("Ford", "Mustang", 2026);
        System.out.println("Auto de fábrica: " + autoNuevo.marca + " " + autoNuevo.modelo + " " + autoNuevo.anio);


        }
}
