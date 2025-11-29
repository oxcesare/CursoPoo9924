package com.mx.curso.algoritmos;

public class Numeros {

    public static void main(String[] args) {

        int numero = 7823;

        while(numero > 0) {
            int digito = numero % 2;
            System.out.println(digito);
            numero = numero / 10;
        }
    }
}
