package com.mx.curso.unidad3.polimorfismo;

import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<Empleado> empleado = List.of(new Cocinero(), new Mesero(), new Gerente());

        /**
         * Creamos un ciclo que itera  la lista de empleados
         * e imprima el metodo correspondiente calcularSalario
         */
        for(Empleado e : empleado){
            System.out.println("Salario Empleados: " + e.calcularSalario());
            System.out.println("Horas Trabajas por empleado: " + e.numeroHorasTrabajas());
            System.out.println("**********************");
        }


    }
}
