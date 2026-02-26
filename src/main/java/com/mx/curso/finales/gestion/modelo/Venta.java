package com.mx.curso.finales.gestion.modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * 5. Venta (Transacción): Modela el evento de la venta.
 * Aplica Composición/Agregación (List<LineaVenta>).
 */
public class Venta {
    private final String idVenta;
    private final LocalDateTime fechaHora;
    private final Cliente cliente; // Opcional (puede ser null)
    private final List<LineaVenta> lineas; // Composición
    private double total;

    public Venta(String idVenta, Cliente cliente) {
        this.idVenta = idVenta;
        this.fechaHora = LocalDateTime.now();
        this.cliente = cliente;
        this.lineas = new ArrayList<>();
        this.total = 0.0;
    }

    public void agregarLinea(LineaVenta linea) {
        this.lineas.add(linea);
        // Recalcular el total cada vez que se añade una línea
        calcularTotal();
    }

    public void calcularTotal() {
        this.total = this.lineas.stream()
                .mapToDouble(LineaVenta::calcularSubtotal)
                .sum();
    }

    // Getters
    public String getIdVenta() { return idVenta; }
    public List<LineaVenta> getLineas() { return lineas; }
    public double getTotal() { return total; }
    public Cliente getCliente() { return cliente; }

    @Override
    public String toString() {
        String clienteNombre = (cliente != null) ? cliente.getNombre() : "Consumidor Final";
        return String.format("Venta [ID:%s, Cliente:%s, Fecha:%s, Ítems:%d, Total=$%.2f]",
                idVenta, clienteNombre, fechaHora.toLocalDate(), lineas.size(), total);
    }
}