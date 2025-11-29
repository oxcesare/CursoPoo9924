package com.mx.curso.solid.practica02;

import java.util.List;

public class CarPrinter {

    public void printCarSeats(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getBrand() + ": " + car.getNumberOfSeats());
        }
    }
}
