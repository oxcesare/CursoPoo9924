package com.mx.curso.arreglos;

public class EjercicioContinue {
    public static void main(String[] args) {
        int suma = 0;

        for (int i = 1; i <= 10; i++) {
            // Regla 1: Si el número es par, ¡NO lo sumes!
            if (i % 2 == 0) {
                continue; // <--- Salta directamente al i++
            }

            // Regla 2: Si llegamos al 7, dejamos de sumar (pero el 7 sí se suma)
            suma += i;
            System.out.println("Sumando: " + i + " | Suma actual: " + suma);

            if (i == 7) {
                break; // Rompe el bucle por completo
            }
        }
        System.out.println("Resultado final: " + suma);
    }
}