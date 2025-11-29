package com.mx.curso.solid.practica02;


import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Car> cars = Arrays.asList(
                CarFactory.createCar(CarType.TESLA, 7),
                CarFactory.createCar(CarType.AUDI, 2),
                CarFactory.createCar(CarType.TOYOTA, 5),
                CarFactory.createCar(CarType.HONDA, 5)
        );

        CarPrinter printer = new CarPrinter();
        printer.printCarSeats(cars);
    }
}
