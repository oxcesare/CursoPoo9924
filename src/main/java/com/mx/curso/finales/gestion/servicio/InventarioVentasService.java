package com.mx.curso.finales.gestion.servicio;
import com.mx.curso.finales.gestion.modelo.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * Servicio central para la gestión de productos, clientes, proveedores y ventas.
 * Simula la base de datos en memoria (colecciones).
 */
public class InventarioVentasService {

    private final List<Producto> productos;
    private final List<Cliente> clientes;
    private final List<Proveedor> proveedores;
    private final List<Venta> ventas;
    private final AtomicInteger contadorVentas = new AtomicInteger(100);

    public InventarioVentasService() {
        this.productos = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.proveedores = new ArrayList<>();
        this.ventas = new ArrayList<>();
    }

    // --- Métodos de Cliente (RF1.1) ---

    public void registrarCliente(Cliente cliente) {
        this.clientes.add(cliente);
        System.out.println("✅ Cliente registrado: " + cliente.getNombre());
    }

    // --- Métodos de Proveedor (RF2.1) ---

    public void registrarProveedor(Proveedor proveedor) {
        this.proveedores.add(proveedor);
        System.out.println("✅ Proveedor registrado: " + proveedor.getNombre());
    }

    // --- Métodos de Producto (RF1.2 Registro y Actualización) ---

    public void registrarProducto(Producto producto) {
        this.productos.add(producto);
        System.out.println("Producto registrado: " + producto.getNombre());
    }

    public Optional<Producto> buscarProductoPorId(String id) {
        return productos.stream().filter(p -> p.getId().equals(id)).findFirst();
    }

    // RF1.3 Búsqueda
    public List<Producto> buscarProductosPorNombre(String nombreParcial) {
        String query = nombreParcial.toLowerCase();
        return productos.stream()
                .filter(p -> p.getNombre().toLowerCase().contains(query))
                .collect(Collectors.toList());
    }

    /**
     * Lógica de Transacción: Registra una venta completa.
     * Implica la creación de la Venta, LineasVenta y la actualización de stock.
     */
    public Venta registrarNuevaVenta(Cliente cliente, List<LineaVenta> lineas) {
        String idVenta = "VTA-" + contadorVentas.incrementAndGet();
        Venta nuevaVenta = new Venta(idVenta, cliente);

        // 1. Procesar cada línea de la venta
        for (LineaVenta linea : lineas) {
            Producto productoVendido = linea.getProducto();
            int cantidad = linea.getCantidadVendida();

            // 2. Aplicar lógica de negocio: Disminuir stock
            // Se asume que la validación de stock se hizo previamente.
            productoVendido.ajustarStock(-cantidad);

            // 3. Agregar la línea a la Venta
            nuevaVenta.agregarLinea(linea);
        }

        // 4. Guardar la venta y devolverla
        this.ventas.add(nuevaVenta);
        return nuevaVenta;
    }

    public Optional<Cliente> buscarClientePorId(String id) {
        return clientes.stream().filter(c -> c.getId().equals(id)).findFirst();
    }

    public List<Producto> obtenerTodosLosProductos() {
        return productos;
    }
}