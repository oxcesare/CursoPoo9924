package com.mx.curso.abstractos.practica01;

import java.util.ArrayList;

abstract class Vehicle {

}
interface Drivale {
}

class Car extends Vehicle implements Drivale {

}

public class Suv extends Car {

    public static void main(String[] args) {
        ArrayList<Vehicle> all = new ArrayList<>();
        //Anteriormente regresaba un error porque Vehiculo si puede ser un Suv
        // pero get(0) regresa un Vehicle y no un Suv o puede ser un Car pero eso no lo sabemos
        Suv s = (Suv)all.get(0);
        //Algo que también puede funcionar
        all.add(new Suv());
        Suv s2  = (Suv)all.get(0);
    }
}
