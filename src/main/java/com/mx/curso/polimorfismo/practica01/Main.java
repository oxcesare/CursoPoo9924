package com.mx.curso.polimorfismo.practica01;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Empleado> empleados = List.of(new Cocinero(), new Mesero());

        for (Empleado empleado : empleados) {
            empleado.saludar();
            empleado.trabajar();
        }
    }
}
