package com.mx.curso.unidad2.excepciones;

import java.util.Scanner;

public class LongitudCadena {

    public static void main(String[] args) {

        String palabra = "";
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Ingresa una  palabra");
            palabra = scanner.nextLine();

            if (palabra.equals("null")) {
                palabra = null;
            }
            System.out.println("Longitud de la palabra: " +
                    palabra.length());

        } catch (NullPointerException e) {
            System.out.println("Error: La palabra es nula.");
        }finally {
            scanner.close();
        }
    }
}
