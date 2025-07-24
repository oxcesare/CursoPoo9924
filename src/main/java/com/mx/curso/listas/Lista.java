package com.mx.curso.listas;

import java.util.List;

public class Lista {

    public static void main(String[] args) {


        List<Integer> lista = List.of(1, 0, 33, 4, 51);

        int max = lista.stream().max(Integer::compareTo).orElseThrow(() -> new RuntimeException("Lista vacía"));

        int min = lista.stream().min(Integer::compareTo).orElseThrow(() -> new RuntimeException("Lista vacía"));

        System.out.println("El máximo de la lista es: " + max);

        System.out.println("El mínimo de la lista es: " + min);


    }
}
