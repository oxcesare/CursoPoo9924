package com.mx.curso.unidad1.herencia;

public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Cesar");
        System.out.println("Nombre:" + persona.getNombre());

        //Objeto de la clase Car
        Car car = new Car();
        car.setNumberOfTire(4);
        car.setTypeLigths("LED");

        System.out.println(car.getNumberOfTire());
        System.out.println(car.getTypeLigths());

    }
}
