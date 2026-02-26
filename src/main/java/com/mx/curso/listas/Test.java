package com.mx.curso.listas;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<String> cadenas = new ArrayList<>();
        cadenas.add("Hola");
        cadenas.add("Mundo");
        cadenas.add("Desde");

        // gestionar la lista mediante un stream y contar los elementos
        long count = cadenas.stream().count();
        System.out.println("Numero de elementos en la lista: " + count);

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(4);

        //Contar el valor de cada elemento
        long suma = numeros.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Suma de los elementos en la lista: " + suma);


    }
}
