package com.mx.curso.solid.practica01;

public class Tesla implements Car {

    private final int seats;

    public Tesla(int seats) {
        this.seats = seats;
    }

    @Override
    public int getNumberOfSeats() {
        return seats;
    }

    @Override
    public String getBrand() {
        return "Tesla";
    }
}
