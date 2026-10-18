import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class DesafioControl {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String[] listaNegra = {"Juan", "Hacker99", "Pedro", "Agustina"};
        String usuarioIngresando = "Hacker99";

        for (int i = 0; i <= 3; i++) {
            if (listaNegra[i].equals(usuarioIngresando)) {
                System.out.println("¡ALERTA DE SEGURIDAD! Usuario bloqueado detectado en el cajón " + i);
            }
        }

        }
}
