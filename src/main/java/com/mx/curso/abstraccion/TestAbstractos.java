package com.mx.curso.abstraccion;

public class TestAbstractos extends EjemploAbstractos {

    @Override
    public void metodoAbstracto() {
        System.out.println("Implementación del método abstracto.");
    }

    // este metodo se puede sobreescribir o no
    /*
    @Override
    public void metodoConcreto() {
        System.out.println("Llamada al método concreto de la clase abstracta.");
    }*/

    public static void main(String[] args) {
        TestAbstractos test = new TestAbstractos();
        test.metodoAbstracto(); // Llamada al método abstracto implementado
        test.metodoConcreto();  // Llamada al método concreto de la clase abstracta
    }
}
