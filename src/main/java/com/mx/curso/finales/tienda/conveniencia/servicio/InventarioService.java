package com.mx.curso.finales.tienda.conveniencia.servicio;
import com.mx.curso.finales.tienda.conveniencia.modelo.Producto;
import com.mx.curso.finales.tienda.conveniencia.modelo.Proveedor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Servicio encargado de la gestión de la lógica de inventario (Stock Management).
 * Simula el almacenamiento de datos en memoria (colecciones).
 */
public class InventarioService {

    // Colección para simular la persistencia de productos
    private final List<Producto> productos;
    private final List<Proveedor> proveedores;

    public InventarioService() {
        this.productos = new ArrayList<>();
        this.proveedores = new ArrayList<>();
    }

    /**
     * RF1.1: Registra un nuevo producto y su proveedor asociado.
     */
    public void registrarProducto(Producto producto) {
        if (obtenerProductoPorId(producto.getId()).isPresent()) {
            System.out.println("❌ ERROR: El ID de producto ya existe: " + producto.getId());
            return;
        }
        // Asegurar que el proveedor también esté registrado (o solo la referencia)
        if (!proveedores.contains(producto.getProveedor())) {
            proveedores.add(producto.getProveedor());
        }
        this.productos.add(producto);
        System.out.println("✅ Producto registrado exitosamente: " + producto.getNombre());
    }

    /**
     * RF1.2: Modifica la cantidad en stock de un producto.
     */
    public boolean modificarStock(String idProducto, int cantidadAjuste) {
        Optional<Producto> productoOpt = obtenerProductoPorId(idProducto);

        if (productoOpt.isPresent()) {
            Producto producto = productoOpt.get();
            // Lógica delegada al modelo
            producto.actualizarStock(cantidadAjuste);

            // RF1.4: Verificar alerta después de la modificación
            if (producto.verificarAlerta()) {
                System.out.println("🚨 ¡ALERTA! Bajo Stock: " + producto.getNombre() + " (" + producto.getCantidadStock() + " unidades)");
            }
            return true;
        }
        System.out.println("❌ ERROR: Producto con ID " + idProducto + " no encontrado.");
        return false;
    }

    /**
     * RF1.3: Búsqueda de productos (usando Streams/Lambdas).
     */
    public Optional<Producto> obtenerProductoPorId(String idProducto) {
        // Uso de Streams para búsquedas eficientes (RNF3.2)
        return productos.stream()
                .filter(p -> p.getId().equals(idProducto))
                .findFirst();
    }

    public List<Producto> obtenerTodosLosProductos() {
        return productos;
    }
}