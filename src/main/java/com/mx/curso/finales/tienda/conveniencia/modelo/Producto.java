package com.mx.curso.finales.tienda.conveniencia.modelo;

/**
 * 2. Producto: Entidad central del inventario.
 * Contiene lógica interna para la gestión de stock y alertas.
 */
public class Producto {
    private final String id;
    private String nombre;
    private double precioVenta;
    private int cantidadStock;
    private final Proveedor proveedor; // Asociación con la clase Proveedor
    private static final int UMBRAL_MINIMO = 5; // Umbral para alerta (RF1.4)

    public Producto(String id, String nombre, double precioVenta, int cantidadStock, Proveedor proveedor) {
        this.id = id;
        this.nombre = nombre;
        // Validación de datos positivos (RNF2.2)
        if (precioVenta <= 0 || cantidadStock < 0) {
            throw new IllegalArgumentException("El precio y stock deben ser valores positivos.");
        }
        this.precioVenta = precioVenta;
        this.cantidadStock = cantidadStock;
        this.proveedor = proveedor;
    }

    /**
     * Lógica de negocio encapsulada: Actualiza el stock (RF1.2).
     */
    public void actualizarStock(int cantidad) {
        this.cantidadStock += cantidad;
        if (this.cantidadStock < 0) {
            this.cantidadStock = 0; // Evitar stock negativo por errores
        }
    }

    /**
     * Lógica de negocio encapsulada: Verifica si se requiere alerta (RF1.4).
     */
    public boolean verificarAlerta() {
        return this.cantidadStock <= UMBRAL_MINIMO;
    }

    // Getters y Setters necesarios (RF1.2 para precio y stock)
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public double getPrecioVenta() { return precioVenta; }
    public int getCantidadStock() { return cantidadStock; }
    public Proveedor getProveedor() { return proveedor; }

    // Setters (RF1.2)
    public void setPrecioVenta(double precioVenta) { this.precioVenta = precioVenta; }
    public void setCantidadStock(int cantidadStock) { this.cantidadStock = cantidadStock; }

    @Override
    public String toString() {
        return String.format("Producto [ID=%s, Nombre='%s', Precio=$%.2f, Stock=%d, Proveedor=%s]",
                id, nombre, precioVenta, cantidadStock, proveedor.getNombre());
    }
}
