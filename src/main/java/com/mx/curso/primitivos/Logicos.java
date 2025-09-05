package com.mx.curso.primitivos;

public class Logicos {

    public static void main(String[] args) {

        Boolean objeto = false; // Autoboxing: el primitivo 'false' se convierte en objeto Boolean
        boolean datoLogico = objeto; // Unboxing: el objeto Boolean se convierte en primitivo 'false'

        Boolean otroObjeto = null;
        // Si intentas hacer esto, lanzará un NullPointerException
        // boolean otroDatoLogico = otroObjeto; // ERROR: No puedes desempaquetar un valor null en un primitivo


        double d = 98765.43e-3;
        System.out.println("d = " + d);

        float f = 1.2345e2f;
        System.out.println("f = " + f);

        datoLogico = d < f;
        System.out.println("datoLogico =  " + datoLogico);

    }
}
