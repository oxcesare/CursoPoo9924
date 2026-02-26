package com.mx.curso.IA.ejercicio01;

import java.time.LocalDate;

/**
 * Representa una transacción financiera inmutable.
 */
public record Transaction(
        String id,
        double amount,
        String category,
        LocalDate date
) {

}