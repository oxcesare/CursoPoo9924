package com.mx.curso.cadenas;

public class Ejercicio04 {

    public static void main(String[] args) {


        String cadena = "Hola Mundo desde Java";
        cadena.concat("h");

        String otraCadena = "T";

        System.out.println(cadena);

        String cadena3 = cadena.transform(s -> s + otraCadena);

        System.out.println("2"+cadena3);

    }
}
