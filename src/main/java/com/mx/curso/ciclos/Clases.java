package com.mx.curso.ciclos;

import java.time.LocalDate;
import java.time.Period;

public class Clases {

    public static void main(String[] args) {

        // cuantas semanas hay en estas fechas 25 de agosto 2025 al 05 de Enero 2026
        int dias = 134;
        int semanas = dias / 7;
        int diasRestantes = dias % 7;
        System.out.println("Semanas: " + semanas);
        System.out.println("Dias restantes: " + diasRestantes);

        //Calculo con Periodo de java.time
         LocalDate fechaInicio = LocalDate.of(2025, 8, 25);
        LocalDate fechaFin = LocalDate.of(2027, 1, 5);
        Period periodo = Period.between(fechaInicio, fechaFin);
        System.out.println("dias: " + periodo.getDays());
        System.out.println("meses: " + periodo.getMonths());
        System.out.println("años: " + periodo.getYears());


    }
}
