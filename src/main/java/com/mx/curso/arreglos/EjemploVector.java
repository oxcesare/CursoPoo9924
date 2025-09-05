package com.mx.curso.arreglos;

import java.util.Vector;

public class EjemploVector {

    public static void main(String[] args) {

        Vector<Double> caracteristicas = new Vector<>();
        caracteristicas.add(1.75);
        caracteristicas.add(70.0);
        caracteristicas.add(30.0);

        System.out.println("Elemento 1: " + caracteristicas.get(0));

        System.out.println("modificar un elemento : " + caracteristicas.set(1, 90.0));

        System.out.println("Elemento 1 modificado: " + caracteristicas.get(1));

        double suma = 0.00;

        for (int i = 0; i < caracteristicas.size(); i++) {
            suma += caracteristicas.get(i);
        }

        double media = suma / caracteristicas.size();
        System.out.println("La media de las características es:  " + media);

    }
}
