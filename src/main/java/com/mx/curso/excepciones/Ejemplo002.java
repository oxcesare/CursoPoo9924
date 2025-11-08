package com.mx.curso.excepciones;

/**
 * Ejemplo de tipo de exception IOException
 */
public class Ejemplo002 {

    public static void main(String[] args) {

        try {
            throw new java.io.IOException("Ejemplo de IOException");
        } catch (java.io.IOException e) {
            System.out.println("Se produjo una IOException: " + e.getMessage());
        }
    }
}
