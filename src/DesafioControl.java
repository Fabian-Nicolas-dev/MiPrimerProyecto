import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class DesafioControl {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double sumaNotas = 0.0;

        for (int i = 1; i <= 4; i++) {
            System.out.println("Ingrese la nota del mes " + i + ": ");
            double nota = teclado.nextDouble();
            sumaNotas = sumaNotas + nota;
        }
        double promedio = sumaNotas / 4;
        System.out.println("El promedio final del empleado es: " + promedio);

        }
}
