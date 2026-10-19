import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class DesafioControl {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String[] productos = {"Fideos", "Arroz", "Yerba", "Aceite"};
        double[] precios = {1500.0, 1100.0, 3200.0, 4500.0};
        String productoBuscado = "Yerba";

        for (int i = 0; i <= 3; i++) {
            if (productos[i].equals(productoBuscado)) {
                System.out.println("¡Producto encontrado! " + productos[i] + " cuesta: " + precios[i]);
            }
        }

        }
}
