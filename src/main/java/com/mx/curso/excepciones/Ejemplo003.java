package com.mx.curso.excepciones;

/**
 * FileNotFoundException
 */
public class Ejemplo003 {

    public static void main(String[] args) {

        //Declara un path no existente
        String path = "C:/archivo_que_no_existe.txt";

        //Intento acceder a el
        try {
            java.io.FileInputStream file = new java.io.FileInputStream(path);
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Se produjo una FileNotFoundException: " + e.getMessage());
        }


    }
}
