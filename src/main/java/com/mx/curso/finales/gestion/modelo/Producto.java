package com.mx.curso.finales.gestion.modelo;

public class Producto {
    private final String id;
    private String nombre;
    private double precioVenta;
    private double costoCompra;
    private int cantidadStock;
    private final Proveedor proveedor; // Asociación

    public Producto(String id, String nombre, double precioVenta, double costoCompra, int cantidadStock, Proveedor proveedor) {
        this.id = id;
        this.nombre = nombre;
        this.precioVenta = precioVenta;
        this.costoCompra = costoCompra;
        this.cantidadStock = cantidadStock;
        this.proveedor = proveedor;
    }

    /**
     * Lógica de negocio encapsulada: Actualiza el stock (RF1.2 Actualización).
     */
    public void ajustarStock(int cantidad) {
        this.cantidadStock += cantidad;
        if (this.cantidadStock < 0) {
            this.cantidadStock = 0;
        }
    }

    // Getters
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public double getPrecioVenta() { return precioVenta; }
    public int getCantidadStock() { return cantidadStock; }

    // Setters (Para RF1.2 Actualización)
    public void setPrecioVenta(double precioVenta) { this.precioVenta = precioVenta; }
    public void setCantidadStock(int cantidadStock) { this.cantidadStock = cantidadStock; }

    @Override
    public String toString() {
        return String.format("Producto [ID=%s, Nombre='%s', Precio=$%.2f, Stock=%d, Proveedor=%s]",
                id, nombre, precioVenta, cantidadStock, proveedor.getNombre());
    }
}