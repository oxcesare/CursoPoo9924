package com.mx.curso.excepciones;

/**
 * Ejemplo de un nullPointerException
 */
public class Ejemplo02 {

    public static void main(String[] args) {

        String cadena=null;

        try {
            System.out.println(cadena.length());
        } catch (NullPointerException e) {
            System.out.println("Se produjo un nullPointerException");
        }

    }
}
