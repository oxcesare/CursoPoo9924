package com.mx.curso.interno.unidad2.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraPromedio {

    public static void main(String[] args) {
        double nota1 = 0;
        double nota2 = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la segunda nota:");
        nota1 = scanner.nextDouble();
        System.out.println(nota1);

        try {
            System.out.println("Ingresa la segunda nota:");
            nota2 = scanner.nextDouble();
            System.out.println(nota2);

            double promedio = (nota1 + nota2) / 2;
            System.out.println("El promedio es: " + promedio);
        } catch (InputMismatchException e) {
            System.out.println("Error al calcular el promedio, tipo de dato mal ingresado: " + e.getMessage());
        } finally {
            scanner.close();
        }

    }
}
