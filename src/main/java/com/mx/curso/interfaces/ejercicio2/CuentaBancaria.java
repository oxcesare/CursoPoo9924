package com.mx.curso.interfaces.ejercicio2;

public interface CuentaBancaria {
    double consultarSaldo();
    void depositar(double cantidad);
    boolean retirar(double cantidad);
}
