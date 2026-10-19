import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class DesafioControl {
    public static void main(String[] args) {

        CuentaBancaria miCuenta = new CuentaBancaria();
        miCuenta.titular = "Fabián Nicolás";
        miCuenta.saldo = 5000.0;
        miCuenta.tipoCuenta = "Caja de ahorros";

        System.out.println("Titular: " + miCuenta.titular + " | Saldo actual: $" + miCuenta.saldo);

        miCuenta.depositar(2500.50);

        }
}
