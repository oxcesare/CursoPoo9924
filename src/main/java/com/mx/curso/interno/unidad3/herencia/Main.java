package com.mx.curso.interno.unidad3.herencia;

public class Main {

    public static void main(String[] args) {

        Perro miPerro = new Perro("Max", 5, "Pastor Alemán");

        Animal animal = new Animal("Bicho", 3);
        animal.emitirSonido();

        miPerro.emitirSonido();


    }
}
