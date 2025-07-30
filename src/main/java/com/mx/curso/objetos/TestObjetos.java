package com.mx.curso.objetos;

public class TestObjetos {

    public static void main(String[] args) {


        Objetos objeto1 = new Objetos("valor1", "valor2", "valor3");
        System.out.println(objeto1);

        objeto1.setPropiedad1("nuevoValor1");
        objeto1.setPropiedad2("nuevoValor2");
        objeto1.setPropiedad3("nuevoValor3");

        System.out.println("Después de modificar:");
        System.out.println(objeto1);
        objeto1.setPropiedad1("Valor2");
        System.out.println("Después de modificar propiedad1:"+ objeto1.getPropiedad1());


    }
}
