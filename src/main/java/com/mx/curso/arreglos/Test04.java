package com.mx.curso.arreglos;

public class Test04 {

    public static void main(String[] args) {
        char cA[][] = new char[3][];
        for (int i = 0; i < cA.length; i++) {
            cA[i] = new char[4];
        }

        System.out.println(cA[2][3]);
    }
}
