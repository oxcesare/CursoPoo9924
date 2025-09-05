package com.mx.curso.herencia.ejemplo01;

public class TestEmpleadoHerencia {


    public static void main(String[] args) {
        EmpleadoA empleadoA = new EmpleadoA();
        double salarioA = empleadoA.calculaSalario(40, 15.0);
        System.out.println("Salario Empleado A: " + salarioA);

        EmpleadoB empleadoB = new EmpleadoB();
        double salarioB = empleadoB.calculaSalario(40, 15.0);
        System.out.println("Salario Empleado B: " + salarioB);

    }

}
