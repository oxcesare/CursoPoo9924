package com.mx.curso.unidad2.excepciones;

import java.util.Scanner;

public class AccesoLista {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4};
        Scanner scanner = new Scanner(System.in);
        int dato = 0;
        try {
            System.out.println("Ingresa una posicion");
            dato = scanner.nextInt();
            System.out.println(arr[dato]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Posicion fuera de los " +
                    "limites de la arreglo.");
        }finally {
            scanner.close();
        }
    }
}
