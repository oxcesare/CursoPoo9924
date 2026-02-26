package com.mx.curso.cadenas;

public class Ejercicio02 {

    public static void main(String[] args) {

        String str1 = "Hola Mundo";
        String str2 = new String("Hola Mundo");

        System.out.println("Son el mismo objeto?" + (str1 == str2));
        System.out.println("Tienen el mismo valor ? " + str1.equals(str2));
    }
}
