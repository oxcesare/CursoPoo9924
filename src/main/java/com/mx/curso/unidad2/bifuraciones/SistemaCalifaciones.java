package com.mx.curso.unidad2.bifuraciones;

public class SistemaCalifaciones {

    public static void main(String[] args) {

        int notaExamen = -7;

        if (notaExamen < 0) {
            System.out.println("La nota es invalida");
        } else {
            if (notaExamen >= 60) {
                System.out.println("Felicidades Aprobaste el curso");
                if (notaExamen >= 90) {
                    System.out.println("Excelente Desempeño");
                }
            } else {
                System.out.println("Lo sentimos, no has aprobado");
            }
        }


        switch (notaExamen) {
            case 90:
                System.out.println("Obtuviste una A");
                break;
            case 80:
                System.out.println("Obtuviste una B");
                break;
            case 70:
                System.out.println("Obtuviste una C");
                break;
            case 60:
                System.out.println("Obtuviste una D");
                break;
            case 50:
                System.out.println("Obtuviste una E");
                break;
        }

    }
}
