package com.mx.curso.sentencias;

public class Sentencia {

    public static void main(String[] args) {

        int valor =10;
        int resultado = valor+10;

        System.out.println(resultado);

        Sentencia s = new Sentencia();
        int obtener = s.mostrar();
        System.out.println(obtener);


    }

    public int mostrar(){
        return 10;
    }
}
