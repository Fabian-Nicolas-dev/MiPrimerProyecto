public class CuentaBancaria {
    String titular;
    double saldo;
    String tipoCuenta;
    public CuentaBancaria(String titularFabrica, double saldoFabrica, String tipoFabrica) {
        titular = titularFabrica;
        saldo = saldoFabrica;
        tipoCuenta = tipoFabrica;
    }

    public void depositar(double monto) {
        saldo = saldo + monto;
        System.out.println("Se depositaron: $" + monto + ". Nuevo saldo: $" + saldo);

    }
    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo = saldo - monto;
            System.out.println("Se retiraron: $" + monto + ". Nuevo saldo: $" + saldo);
        }else {
            System.out.println("¡Operación rechazada! Fondos insuficientes para retirar: $" + monto);
        }

    }
}
