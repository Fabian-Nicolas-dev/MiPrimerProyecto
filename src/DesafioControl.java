import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class DesafioControl {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String[] equipo = {"Fabián", "Carlos", "Ana"};

                for (int i = 0; i <= 2; i++ ) {
                    System.out.println("Programador contratado: " + i + equipo[i]);

                }

        }
}
