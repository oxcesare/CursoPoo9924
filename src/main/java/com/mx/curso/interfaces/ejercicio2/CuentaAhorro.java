package com.mx.curso.interfaces.ejercicio2;

public class CuentaAhorro implements CuentaBancaria {

    private double saldo;
    private double tasaInteres;

    public CuentaAhorro(double saldoInicial, double tasaInteres) {
        this.saldo = saldoInicial;
        this.tasaInteres = tasaInteres;
    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }

    @Override
    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    @Override
    public boolean retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }

    public void aplicarInteres() {
        saldo += saldo * tasaInteres;
    }
}
