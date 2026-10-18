import java.util.Scanner;

public class DesafioControl {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("¿De qué número querés ver la tabla de multiplicar?: ");

        int numeroTabla = teclado.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numeroTabla + " x " + i + " = " + (numeroTabla * i));
        }
    }
}
