package com.mx.curso.finales.banco.modelo;



/**
 * 2. CuentaBancaria (Clase Abstracta): Define la Abstracción y es la base para Herencia.
 * (RNF3.2 - POO)
 */
public abstract class CuentaBancaria {

    protected final String numeroCuenta;
    protected double saldo;
    protected final Cliente propietario; // Referencia al objeto Cliente

    public CuentaBancaria(String numeroCuenta, Cliente propietario, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.propietario = propietario;
        this.saldo = saldoInicial;
    }

    // Comportamiento común (Heredado)
    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
            System.out.println("Depósito de $" + monto + " realizado en cuenta " + numeroCuenta);
        }
    }

    // Método Polimórfico (Abstracto): La lógica de retiro varía por tipo de cuenta
    public abstract boolean retirar(double monto);

    // Método Abstracto para Intereses/Deducciones
    public abstract void aplicarInteresODeduccion();

    // Getters comunes
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    // Simplificación de una clase concreta para la demostración
    // Normalmente iría en su propio archivo: CuentaAhorro.java
    public static class CuentaAhorro extends CuentaBancaria {
        private final double tasaInteres = 0.05;

        public CuentaAhorro(String numeroCuenta, Cliente propietario, double saldoInicial) {
            super(numeroCuenta, propietario, saldoInicial);
        }

        @Override
        public boolean retirar(double monto) {
            if (saldo >= monto) {
                saldo -= monto;
                System.out.println("Retiro de $" + monto + " exitoso.");
                return true;
            } else {
                System.out.println("Error: Saldo insuficiente para retiro.");
                return false;
            }
        }

        @Override
        public void aplicarInteresODeduccion() {
            double interes = saldo * tasaInteres;
            saldo += interes;
            System.out.println("Interés de $" + interes + " aplicado.");
        }

        @Override
        public String toString() {
            return "CuentaAhorro{" +
                    "Num=" + numeroCuenta +
                    ", Saldo=" + saldo +
                    '}';
        }
    }
}