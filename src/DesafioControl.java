import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class DesafioControl {
    public static void main(String[] args) {

        CuentaBancaria[] misCuentas = new CuentaBancaria[3];

        misCuentas[0] = new CuentaBancaria("Carlos", 5500.00, "Caja de ahorros");
        misCuentas[1] = new CuentaBancaria("Jose", 3200.00,"Caja de ahorros");
        misCuentas[2] = new CuentaBancaria("Rodrigo", 10200.00,"Caja de ahorros");

        double dineroTotalBanco = 0.0;

        System.out.println("--- REPORTE OFICIAL DEL BANCO ---");

        for (int i = 0; i < misCuentas.length; i++) {

            dineroTotalBanco = dineroTotalBanco + misCuentas[i].saldo;
            if (misCuentas[i].saldo < 5000.0) {
                System.out.println("Alerta: " + misCuentas[i].titular + ". Está corto de saldo: $" + misCuentas[i].saldo);
            } else {
                System.out.println( misCuentas[i].titular + ". " + "Saldo actual: $" + misCuentas[i].saldo + ". Tiene las cuentas al día");
            }

        }
        System.out.println("-----------------------------------");
        System.out.println("Dinero total guardado en el banco: $" + dineroTotalBanco);

        }
}