package com.mx.curso.primitivos;

public class Primitivos {

    public static void main(String[] args) {

        //Tipos de datos primitivos
        int numero = 10; // Entero
        double decimal = 10.5; // Decimal
        char letra = 'A'; // Carácter
        boolean esVerdadero = true; // Booleano
        byte byteValue = 100; // Byte
        short shortValue = 1000; // Short
        long longValue = 100000L; // Long
        float floatValue = 10.5f; // Float

        System.out.println("Entero: " + numero);
        System.out.println("Decimal: " + decimal);
        System.out.println("Carácter: " + letra);
        System.out.println("Booleano: " + esVerdadero);
        System.out.println("Byte: " + byteValue);
        System.out.println("Short: " + shortValue);
        System.out.println("Long: " + longValue);
        System.out.println("Float: " + floatValue);


        // Tipos de datos no primitivos
        String texto = "Hola, mundo"; // Cadena de texto
        Integer numeroEntero = 20; // Objeto Integer
        Double numeroDecimal = 20.5; // Objeto Double
        Character caracter = 'B'; // Objeto Character
        Boolean booleano = false; // Objeto Boolean
        System.out.println("Tipo Short correspondiente: " + Short.TYPE);
        System.out.println("Tipo Short correspondiente: " + Short.SIZE);
        System.out.println("Tipo Short correspondiente: " + Short.MIN_VALUE);
        System.out.println("Tipo Short correspondiente: " + Short.MAX_VALUE);

        short numeroShort = 32767;
        System.out.println("Valor de short: " + numeroShort);


    }
}
