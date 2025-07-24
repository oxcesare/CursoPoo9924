package com.mx.curso.interfaces;

public class EmpleadoDocente implements Sueldo {
    @Override
    public double calcularSueldo(double salario, double horasTrabajadas, double horasExtras) {
        return salario*(horasExtras+ horasTrabajadas);
    }
}
