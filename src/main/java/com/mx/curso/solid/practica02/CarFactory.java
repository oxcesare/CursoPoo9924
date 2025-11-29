package com.mx.curso.solid.practica02;

public class CarFactory {

    public static Car createCar(CarType type, int seats) {
        return switch (type) {
            case TESLA  -> new Tesla(seats);
            case AUDI   -> new Audi(seats);
            case TOYOTA -> new Toyota(seats);
            case HONDA  -> new Honda(seats);
        };
    }
}
