package com.mx.curso.primitivos;

public class Caracteres {

    public static void main(String[] args) {


        char caracter = '\u0040';
        char decimal = 64;

        System.out.println("Caracter = " + caracter);
        System.out.println("Decimal = " + decimal);

        char simbolo = '@';
        System.out.println("Simbolo = " + simbolo);
        System.out.println("Decimal = caracter: " + (decimal == caracter));

        //Obtener los bytes correspondientes
        System.out.println("char corresponde en byte = " + Character.BYTES);
        System.out.println("char corresponde en bites = " + Character.SIZE);
        System.out.println("Character.MIN_VALUE = " + Character.MIN_VALUE);
        System.out.println("Character.MAX_VALUE = " + Character.MAX_VALUE);

    }
}
