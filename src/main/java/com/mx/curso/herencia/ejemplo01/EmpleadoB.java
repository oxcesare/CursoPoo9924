package com.mx.curso.herencia.ejemplo01;

public class EmpleadoB extends EmpleadoA{

    @Override
    public double calculaSalario(double horasTrabajadas, double tarifaPorHora) {
        // Llamada al método de la clase padre
        double salarioBase = super.calculaSalario(horasTrabajadas, tarifaPorHora);

        // Aplicar un bono del 10% al salario base
        double bono = salarioBase * 0.10;

        return salarioBase + bono; // Retorna el salario con el bono incluido
    }
}
