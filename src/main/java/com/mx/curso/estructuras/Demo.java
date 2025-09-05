package com.mx.curso.estructuras;

public class Demo {

    static int x = 5;

    static {
        x += 5;
    }

    {
        x += 10;
    }

    public static void main(String[] args) {

        Demo d1 = new Demo();
        Demo d2 = new Demo();
        Demo d3 = new Demo();
        System.out.println(x);

    }


}
