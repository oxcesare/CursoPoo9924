package com.mx.curso.unidad3.herencia.practica04;

public class GestorPedidos {

    private String nombreCliente;
    private int idPedido;
    private static final double IMPUESTO = 0.16;

    public GestorPedidos(int idPedido) {
        this.idPedido = idPedido;
        this.nombreCliente = "Cliente Generico";
    }

    public GestorPedidos(String nombreCliente, int idPedido) {
        this.nombreCliente = nombreCliente;
        this.idPedido = idPedido;
    }

    public double calcularCostoTotal(double costoProducto) {
        return (costoProducto * (1 + IMPUESTO));
    }

    public double calcularCostoTotal(double costoProducto,
                                     double porcentajeDescuento) {
        return (costoProducto * (1 - porcentajeDescuento / 100)
                * (1 + IMPUESTO));
    }

    public void aplicarDescuento(double[] precios, double descuentoFijo) {
        for (double precio : precios) {
            precio = precio - descuentoFijo;
            System.out.println("Subtotal con descuento: " + precio);
        }
    }

    public static void main(String[] args) {
        GestorPedidos g1 = new GestorPedidos(1);
        System.out.println(g1.calcularCostoTotal(50.00));
        System.out.println(g1.calcularCostoTotal(70.00, 10));

        System.out.println("********************************");
        double[] precios = {900.00, 90.00, 18.00};
        g1.aplicarDescuento(precios, 17);

    }
}
