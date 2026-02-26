package com.mx.curso.IA.ejercicio01;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Transaction> transactions = generateSampleTransactions(10);

        // Imprimir las transacciones
        System.out.println("--- Lista de 10 Transacciones Aleatorias ---");

        //ordenar las transacciones por monto  de forma descendente usando streams
        transactions.stream().collect(Collectors.toList())
                .stream()
                .sorted((t1, t2) -> Double.compare(t2.amount(), t1.amount()))
                .forEach(t -> System.out.println(t));

        //Seleccionar solo las transacciones de la categoria TECH usando streams
        transactions.stream()
                .filter(t -> t.category().equals("TECH"))
                .forEach(t -> System.out.println(t));


        //Encontrar la transacción con el monto más alto usando streams
        Transaction maxTransaction = transactions.stream()
                .max((t1, t2) -> Double.compare(t1.amount(), t2.amount()))
                .orElse(null);

        System.out.println(maxTransaction.amount());


    }


    public static List<Transaction> generateSampleTransactions(int count) {

        List<Transaction> list = new ArrayList<>();

        String[] categories = {"FOOD", "TECH", "RENT", "ENTERTAINMENT", "HEALTH"};

        for (int i = 0; i < count; i++) {
            String id = UUID.randomUUID().toString().substring(0, 8); // ID corto para legibilidad
            double amount = ThreadLocalRandom.current().nextDouble(10.0, 1500.0);
            String category = categories[ThreadLocalRandom.current().nextInt(categories.length)];

            // Fecha aleatoria dentro de los últimos 30 días
            LocalDate date = LocalDate.now().minusDays(ThreadLocalRandom.current().nextInt(0, 31));

            list.add(new Transaction(id, Math.round(amount * 100.0) / 100.0, category, date));
        }
        return list;
    }
}
