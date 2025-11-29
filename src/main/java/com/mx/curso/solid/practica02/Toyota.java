package com.mx.curso.solid.practica02;

public class Toyota implements Car {

    private final int seats;

    public Toyota(int seats) {
        this.seats = seats;
    }

    @Override
    public int getNumberOfSeats() {
        return seats;
    }

    @Override
    public String getBrand() {
        return "Toyota";
    }
}
