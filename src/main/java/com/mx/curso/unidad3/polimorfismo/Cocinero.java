package com.mx.curso.unidad3.polimorfismo;

public class Cocinero extends Empleado {

    @Override
    public double calcularSalario() {
        return 2500 * 4;
    }

    @Override
    public int numeroHorasTrabajas() {
        return 12*30;
    }
}
