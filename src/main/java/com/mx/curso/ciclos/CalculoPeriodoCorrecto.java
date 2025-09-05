package com.mx.curso.ciclos;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class CalculoPeriodoCorrecto {

    public static void main(String[] args) {
        LocalDate fechaInicio = LocalDate.of(2025, 8, 25);
        LocalDate fechaFin = LocalDate.of(2026, 1, 5);

        // Uso de ChronoUnit para obtener el total de días
        long diasTotales = ChronoUnit.DAYS.between(fechaInicio, fechaFin);

        System.out.println("dias totales: " + diasTotales);
        System.out.println("semanas: " + (diasTotales / 7));
    }
}