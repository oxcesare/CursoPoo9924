package com.mx.curso.arreglos;

public class Ax {
    static int[] x = new int[0];

    static {
        x[0] = 10;
    }

    public static void main(String[] args) {
        Ax ax = new Ax();
        ax.m1();
    }
    public void m1() {
        System.out.println(x[0]);
    }
}
