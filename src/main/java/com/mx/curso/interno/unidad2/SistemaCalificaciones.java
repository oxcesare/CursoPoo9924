package com.mx.curso.interno.unidad2;

public class SistemaCalificaciones {

    public static void main(String[] args) {

        int notaExamen = 100;

        if (notaExamen >= 60) {
            System.out.println("Felicidades, has aprobado el examen");
            if (notaExamen >= 90) {
                System.out.println("Excelente desempeno");
            }
        } else {
            System.out.println("Lo siento, has reprobado el examen");
        }
    }
}
