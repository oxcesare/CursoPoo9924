package com.mx.curso.solid.practica01;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Car> cars = Arrays.asList(
                new Tesla(7),
                new Audi(2),
                new Toyota(5),
                new Honda(5)
        );

        CarPrinter printer = new CarPrinter();
        printer.printCarSeats(cars);
    }
}
