package com.mx.curso.unidad2.excepciones;

import java.util.Scanner;

public class UsoScanner {

    static void main(String[] args) {

        int dato = 0;
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        try {
            System.out.println("ingrese dato");
            dato = scanner.nextInt();
        } catch (IllegalStateException e) {
            System.out.println("Error: no es posible leer" +
                    " porque el scanner ya esta cerrado: "
                    + e.getMessage());
        }
    }
}
