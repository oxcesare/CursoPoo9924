package com.mx.curso.interno.unidad3.herencia;

public class Animal {

    protected  String nombre;
    protected  int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void emitirSonido(){
        System.out.println("El animal hace un ruido");
    }

    public String getInformacion(){
        return "Nombre: " + nombre + ", Edad: " + edad;
    }
}
