package com.mx.curso.interfaces;

public class EmpleadoAdmin implements  Sueldo{

    @Override
    public double calcularSueldo(double salario, double horasTrabajadas, double horasExtras) {
        double bono = 0.1 * salario; // 10% de bono
        return salario*(horasExtras+ horasTrabajadas+ bono);
    }
}
