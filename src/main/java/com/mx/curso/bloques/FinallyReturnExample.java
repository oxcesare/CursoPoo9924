package com.mx.curso.bloques;

public class FinallyReturnExample {

    public static int getValue() {
        try {
            System.out.println("Dentro del bloque try.");
            int result = 10 / 0;
            return 10;
        } catch (Exception e) {
            System.out.println("Dentro del bloque catch.");
            return 20;
        } finally {
            System.out.println("Dentro del bloque finally.");
        }
    }

    public static void main(String[] args) {
        int result = getValue();
        System.out.println("El valor retornado es: " + result);
    }
}