package com.mx.curso.excepciones;

public class Ejercicio01 {

    public static void main(String[] args) {

        try {
            System.out.println("Try Block");
            int result = 10 / 0; // This will cause an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Catch Block: " + e.getMessage());
        } finally {
            System.out.println("Finally Block: This block always executes regardless of an exception.");
        }
    }
}
