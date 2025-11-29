package com.mx.curso.unidad2.excepciones;

import java.util.Scanner;

public class ValidadorEdad {

    public static void main(String[] args) {
        int edad = 0;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Ingresa tu edad: ");
            edad = Integer.parseInt(scanner.nextLine());
            validarEdad(edad);
            System.out.println("Tu edad es:" + edad);
        } catch (IllegalArgumentException e) {
            System.out.println("La edad no es valida: " + e.getMessage());
        }
    }
    public static void validarEdad(int edad) throws IllegalArgumentException {
        if (edad < 0 || edad > 120) {
            throw new IllegalArgumentException("Edad no valida: " + edad);
        }
    }
}
