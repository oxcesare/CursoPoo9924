package com.mx.curso.ciclos;

public class AnalizadorDeNumeros {

    public static void main(String[] args) {

        int numero = 1;

        while (numero <= 100) {
            if (numero > 50) {
                System.out.println("El número " + numero + " es mayor a 50");
                break;
            }
            numero++;
        }
    }
}
