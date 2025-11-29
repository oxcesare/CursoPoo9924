package com.mx.curso.solid.practica01;

public class Honda implements Car {

    private final int seats;

    public Honda(int seats) {
        this.seats = seats;
    }

    @Override
    public int getNumberOfSeats() {
        return seats;
    }

    @Override
    public String getBrand() {
        return "Honda";
    }
}
