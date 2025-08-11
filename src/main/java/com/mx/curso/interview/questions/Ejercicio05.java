package com.mx.curso.interview.questions;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Explain the differences between, TreeMap, HashMap and LinkedHashMap
 * <p>
 * Provide an example of when each one would the best
 */
public class Ejercicio05 {

    public static void main(String[] args) {

        SortedMap<Integer, Integer> mapa2 = new TreeMap<>();
        mapa2.put(1, 2);
        mapa2.put(2, 3);
        mapa2.put(3, 4);

        for (int i : mapa2.values()) {
            System.out.println(i);
        }

        System.out.println(mapa2.headMap(3));
    }
}
