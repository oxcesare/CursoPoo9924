package com.mx.curso.interfaces.ejercicio2;

public class CuentaCorriente implements CuentaBancaria {

    private double saldo;
    private double limiteSobregiro;

    public CuentaCorriente(double saldoInicial, double limiteSobregiro) {
        this.saldo = saldoInicial;
        this.limiteSobregiro = limiteSobregiro;
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
        if (saldo - cantidad >= -limiteSobregiro) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }
}
