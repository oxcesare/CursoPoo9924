package com.mx.curso.interno.unidad3.herencia;

public class Perro extends Animal{

    private String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    @Override
    public void emitirSonido() {
        System.out.println("El perro ladra: Guau Guau");
    }


}
