package com.mx.curso.listas;

public class AdministrarProducto {

    public static void main(String[] args) {

        Producto producto1 = new Producto("Laptop", 1500.00, 10);
        Producto producto2 = new Producto("Laptop", 1500.00, 10);
        Producto producto3 = new Producto("Laptop", 1500.00, 10);

        System.out.println(producto1);
        System.out.println(producto2);
        System.out.println(producto3);

        AdministrarProducto ad = new AdministrarProducto();
        ad.modificarProducto(producto1, "Laptop", 800.00, 25);
        System.out.println("Producto modificado: " + " " + producto1);


    }


    public Producto crearProducto(String nombre, double precio, int cantidadStock) {
        return new Producto(nombre, precio, cantidadStock);
    }

    public void modificarProducto(Producto producto, String nombre, double precio, int cantidadStock) {
        producto.setNombre(nombre);
        producto.setPrecio(precio);
        producto.setCantidadStock(cantidadStock);
    }
}
