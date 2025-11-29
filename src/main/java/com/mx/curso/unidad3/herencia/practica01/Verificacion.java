package com.mx.curso.unidad3.herencia.practica01;

import java.util.function.DoubleToIntFunction;

public class Verificacion {

    public static void main(String[] args) {
        ProductoDigital producto1 =
                new ProductoDigital
                        ("Ebook Java",250.20,true);

        ProductoDigital producto2 =
                new ProductoDigital
                        ("Audio Libro",210.20,false);

        System.out.println("Total de producto creados  " +
                ProductoDigital.getContadorProductos());
    }
}
