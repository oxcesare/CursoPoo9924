package com.mx.curso.console;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraEdad {

    public static void main(String[] args) {

        int anioActual = 2025;

        Scanner cs = new Scanner(System.in);
        System.out.print("Ingrese su año de nacimiento: ");


        try {
            int anioNacimiento = cs.nextInt();
            int edad = anioActual - anioNacimiento;
            System.out.println("Su edad es: " + edad + " años.");
        } catch (Exception e) {
            System.out.println("Error: Ingrese un año válido.");
            throw new InputMismatchException();
        } finally {
            cs.close();
        }
    }
}
