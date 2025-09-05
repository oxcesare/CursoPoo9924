package com.mx.curso.algoritmos;

public class Condiciones {

    public static void main(String[] args) {


        int[] arreglo = {2, 3,7,9,15,20,21,29};

        for (int i = 0; i < arreglo.length; i++) {

            int n = arreglo[i];
            if (n % 2 == 0 && n >= 6 && n <= 20) {
                System.out.println("El numero es par y esta entre 6 y 20");
            } else if (n % 2 != 0) {
                System.out.println("El numero es impar");
            } else if (n % 2 == 0 && n >= 2 && n <= 5) {
                System.out.println("El numero es par y esta entre 2 y 5");
            } else {
                System.out.println("Numero mayor a 20");
            }
        }
    }
}
