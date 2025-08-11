package com.mx.curso.interview.questions.ejemplos;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapComparisonExample {

    public static void main(String[] args) {

        System.out.println("--- HashMap (Orden aleatorio) ---");
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "tres");
        hashMap.put(1, "uno");
        hashMap.put(2, "dos");
        System.out.println(hashMap); // Salida: {1=uno, 2=dos, 3=tres} (el orden puede variar)

        System.out.println("\n--- LinkedHashMap (Orden de inserción) ---");
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3, "tres");
        linkedHashMap.put(1, "uno");
        linkedHashMap.put(2, "dos");
        System.out.println(linkedHashMap); // Salida: {3=tres, 1=uno, 2=dos} (orden fijo)

        System.out.println("\n--- TreeMap (Orden natural de la clave) ---");
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "tres");
        treeMap.put(1, "uno");
        treeMap.put(2, "dos");
        System.out.println(treeMap); // Salida: {1=uno, 2=dos, 3=tres} (ordenado por clave)
    }
}

