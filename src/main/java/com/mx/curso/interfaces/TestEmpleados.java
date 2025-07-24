package com.mx.curso.interfaces;

public class TestEmpleados {

    public static void main(String[] args) {
        Sueldo empleadoAdmin = new EmpleadoAdmin();
        double sueldoAdmin = empleadoAdmin.calcularSueldo(1000, 40, 5);
        System.out.println("Sueldo del Empleado Admin: " + sueldoAdmin);

        Sueldo empleadoDocente = new EmpleadoDocente();
        double sueldoDocente = empleadoDocente.calcularSueldo(1000, 40, 5);
        System.out.println("Sueldo del Empleado Docente: " + sueldoDocente);
    }
}
