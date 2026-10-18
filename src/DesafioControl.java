import java.util.Scanner;

public class DesafioControl {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Desde qué número empieza la cuenta regresiva?: ");

        int contador = teclado.nextInt();
        while (contador > 0) {
            System.out.println("Tiempo restante: " + contador);
            contador = contador - 1;
        }
        System.out.println("¡¡¡BOOM!!! Tiempo cumplido.");

    }
}
