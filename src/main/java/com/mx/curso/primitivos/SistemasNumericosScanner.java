package com.mx.curso.primitivos;

import java.util.Scanner;

public class SistemasNumericosScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero:");
        String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;

        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e) {
            System.out.println(e.getStackTrace());
        }

        System.out.println(Integer.toBinaryString(numeroDecimal));
        System.out.println(Integer.toHexString(numeroDecimal));

    }
}
