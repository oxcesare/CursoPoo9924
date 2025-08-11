package com.mx.curso.cadenas;

public class Test3 {

    public static void main(String[] args) {
        String curso = "Programacion Orientada a Objetos";
        String materia = new String("Programacion Orientada a Objetos");

        boolean esIgual = curso == materia;
        System.out.println("esIgual = " + esIgual);

        System.out.println("ejemplo de comparacion por valor");

        esIgual = curso.equals(materia);
        System.out.println(esIgual);


        System.out.println("************");

        String curso3 = "Programacion Orientada a Objetos";
        esIgual = curso == curso3;
        System.out.println("es Igual = " + esIgual);
    }


}
