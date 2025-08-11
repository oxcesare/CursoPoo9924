package com.mx.curso.disenoclases.ejercicio02;

abstract class Salon {
    protected int m1() {
        return 0;
    }
}

class Other extends Salon {


    @Override
    protected int m1() {
        return super.m1();
    }
}

public class OverridingSaloon extends Salon {

    public int m1() {
        return 1;
    }
}
