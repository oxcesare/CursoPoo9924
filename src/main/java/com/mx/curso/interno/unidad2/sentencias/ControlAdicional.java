package com.mx.curso.interno.unidad2.sentencias;

import javax.naming.ldap.Control;

public class ControlAdicional {

    public static void main(String[] args) {

        for (int i = 0; i < 11; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("El valor de i es: " + i);
        }

        //ciclo que itere de 1 a 10
        for (int j = 1; j <= 10; j++) {
            if (j == 5) {
                continue;
            }
            System.out.println("El valor de j es: " + j);
        }

        ControlAdicional control = new ControlAdicional();
        String encontrar = control.encontrarNumero(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 7);
        System.out.println(encontrar);

    }


    public String encontrarNumero(int[] numeros, int numeroBuscado) {
        for (int numero : numeros) {
            if (numero == numeroBuscado) {
                return "Número " + numeroBuscado + " encontrado.";
            }
        }
        return "Número " + numeroBuscado + " no encontrado.";
    }


}
