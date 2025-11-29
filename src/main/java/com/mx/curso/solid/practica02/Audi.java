package com.mx.curso.solid.practica02;

public class Audi implements Car {

    private final int seats;

    public Audi(int seats) {
        this.seats = seats;
    }

    @Override
    public int getNumberOfSeats() {
        return seats;
    }

    @Override
    public String getBrand() {
        return "Audi";
    }
}
