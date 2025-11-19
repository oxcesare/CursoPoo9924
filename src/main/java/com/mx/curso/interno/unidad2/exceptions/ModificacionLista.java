package com.mx.curso.interno.unidad2.exceptions;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public class ModificacionLista {

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);

        try {
            for (Integer numero : lista) {
                lista.remove(numero);
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("No se puede modificar una lista mientras se itera: " + e.getMessage());
        }

    }
}
