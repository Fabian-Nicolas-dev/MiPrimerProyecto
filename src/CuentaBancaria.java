public class CuentaBancaria {
    String titular;
    double saldo;
    String tipoCuenta;

    public void depositar(double monto) {
        saldo = saldo + monto;
        System.out.println("Se depositaron: $" + monto + ". Nuevo saldo: $" + saldo);

    }
}
