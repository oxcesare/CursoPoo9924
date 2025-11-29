package com.mx.curso.unidad3.polimorfismo;

public class Gerente extends Empleado{
    @Override
    public double calcularSalario() {
        return 5000*4;
    }

    @Override
    public int numeroHorasTrabajas() {
        return 10*30;
    }
}
