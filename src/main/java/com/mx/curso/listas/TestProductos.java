package com.mx.curso.listas;

import java.util.List;

public class TestProductos {

    public static void main(String[] args) {

        //Crear una lista de productos

        List<Producto> productos = List.of(
                new Producto("Laptop", 1500.00, 10),
                new Producto("Smartphone", 8000.00, 25),
                new Producto("Tablet", 4000.00, 15)
        );

        //agregarlos a un stream y filtras los de precio mayor a 1000
        productos.stream()
                .filter(producto -> producto.getPrecio() > 1000)
                .filter(producto -> producto.getCantidadStock() >= 15)
                .forEach(System.out::println);

    }
}
