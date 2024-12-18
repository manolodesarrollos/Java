/**
 * Manejo de try  personalizado*/
package Excepciones;

/**
 *
 * @author Manolo
 */
class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException() {
        super("Error: Saldo insuficiente para realizar la operación.");
    }
}

class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void retirar(double cantidad) throws SaldoInsuficienteException {
        if (cantidad > saldo) {
            throw new SaldoInsuficienteException();
        }
        saldo -= cantidad;
        System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
    }
}

public class Ejemplo_6 {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(1000);

        try {
            cuenta.retirar(1500);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}

