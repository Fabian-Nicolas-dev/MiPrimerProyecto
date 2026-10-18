import java.util.Scanner;

public class DesafioControl {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double totalFactura = 0.0;
        System.out.println("Ingrese el precio del producto (o marque 0 para terminar): ");

        double precio = teclado.nextDouble();

        while (precio > 0) {
            totalFactura = totalFactura + precio;
            System.out.println("Ingrese el precio del próximo producto (o 0 para terminar): ");
            precio = teclado.nextDouble();

        }
        System.out.println("El total de su compra es: $" + totalFactura);
    }
}
