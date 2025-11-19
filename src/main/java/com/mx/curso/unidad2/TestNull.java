package com.mx.curso.unidad2;

import com.mx.curso.unidad2.herencia.Persona;

public class TestNull {

    public static void main(String[] args) {

        Persona persona =null;

        try {
            System.out.println("Valor de persona:" + persona.getName());
        } catch (NullPointerException e) {
            System.out.println("Se produjo un error: " + e.getMessage());
        }

        System.out.println("Continuarndo con la ejecucion del programa...");

    }
}
