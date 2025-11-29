package com.mx.curso.unidad3.polimorfismo;

public class Mesero extends Empleado {

    @Override
    public double calcularSalario() {
        return 3500 * 4;
    }

    @Override
    public int numeroHorasTrabajas() {
        return 8*30;
    }


}
