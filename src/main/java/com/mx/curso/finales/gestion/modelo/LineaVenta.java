package com.mx.curso.finales.gestion.modelo;

public class LineaVenta {
    private final Producto producto; // Referencia al producto vendido
    private final int cantidadVendida;
    private final double precioUnitario; // Precio al momento de la venta

    public LineaVenta(Producto producto, int cantidadVendida, double precioUnitario) {
        this.producto = producto;
        this.cantidadVendida = cantidadVendida;
        this.precioUnitario = precioUnitario;
    }

    /**
     * Lógica interna: calcula el subtotal de la línea.
     */
    public double calcularSubtotal() {
        return cantidadVendida * precioUnitario;
    }

    // Getters
    public Producto getProducto() { return producto; }
    public int getCantidadVendida() { return cantidadVendida; }
}