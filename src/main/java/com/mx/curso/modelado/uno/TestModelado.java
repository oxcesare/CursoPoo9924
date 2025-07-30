package com.mx.curso.modelado.uno;

public class TestModelado {

    public static void main(String[] args) {
        /**
         * Podemos constuir objetos de las clases que integran nuestro modelo
         */

        Fish fish = new Fish(5);
        System.out.println("Tamaño del pez: " + fish.getSizeInFeet() + " pies");
    }
}
