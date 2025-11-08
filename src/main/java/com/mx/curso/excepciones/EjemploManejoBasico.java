package com.mx.curso.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjemploManejoBasico {

    public static void main(String[] args) {

        // --- 1. Manejo de un mal dato de entrada (InputMismatchException) ---

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese un número entero (falla si ingresa texto): ");

            // Intenta leer un entero. Si el usuario ingresa una letra, falla.
            int numero = scanner.nextInt();
            System.out.println("Éxito al leer el número: " + numero);

        } catch (InputMismatchException e) {
            // Se captura cuando el Scanner espera un tipo (ej. int) y recibe otro (ej. String).
            System.err.println("\n[ERROR DE ENTRADA] Capturado InputMismatchException.");
            System.err.println("Debe ingresar un valor numérico entero.");
        }

        System.out.println("\n-------------------------------------");

        // --- 2. Manejo de una mala conversión de cadenas (NumberFormatException) ---

        String texto = "cien"; // Una cadena que no se puede convertir a número
        int valorNumerico = 0;

        try {
            System.out.println("Intentando convertir la cadena: \"" + texto + "\" a entero...");

            // Intenta convertir la cadena "cien" a un valor int. Falla.
            valorNumerico = Integer.parseInt(texto);
            System.out.println("Éxito en la conversión: " + valorNumerico);

        } catch (NumberFormatException e) {
            // Se captura cuando un método de análisis de números (ej. Integer.parseInt)
            // no puede convertir el formato de la cadena al tipo numérico deseado.
            System.err.println("\n[ERROR DE CONVERSIÓN] Capturado NumberFormatException.");
            System.err.println("La cadena de texto no contiene un formato de número válido.");

        } finally {
            // El bloque 'finally' se ejecuta siempre.
            System.out.println("\n[FINALLY] La conversión intentada terminó. El valor final es: " + valorNumerico);
        }
    }
}