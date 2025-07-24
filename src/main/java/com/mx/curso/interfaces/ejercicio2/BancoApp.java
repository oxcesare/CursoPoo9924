package com.mx.curso.interfaces.ejercicio2;

public class BancoApp {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaAhorro(1000.0, 0.05);
        CuentaBancaria cuenta2 = new CuentaCorriente(500.0, 200.0);

        cuenta1.depositar(200);
        cuenta2.retirar(600); // dentro del límite de sobregiro

        System.out.println("Saldo Cuenta Ahorro: " + cuenta1.consultarSaldo());
        System.out.println("Saldo Cuenta Corriente: " + cuenta2.consultarSaldo());

        // Aplicar interés si es cuenta de ahorro
        if (cuenta1 instanceof CuentaAhorro ahorro) {
            ahorro.aplicarInteres();
            System.out.println("Saldo tras aplicar interés: " + ahorro.consultarSaldo());
        }
    }
}
