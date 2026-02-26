package com.mx.curso.finales.gestion.controlador;

import com.mx.curso.finales.gestion.modelo.*;
import com.mx.curso.finales.gestion.servicio.InventarioVentasService;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

/**
 * Controlador: Punto de entrada de la aplicación.
 * Orquesta la simulación del flujo de Inventario y Ventas.
 */
public class SistemaJimenezController {

    private final InventarioVentasService service;

    public SistemaJimenezController() {
        this.service = new InventarioVentasService();
    }

    public void iniciarSimulacion() {
        System.out.println("=================================================");
        System.out.println("    SISTEMA DE GESTIÓN DE INVENTARIO POO");
        System.out.println("          (Plátanos Jiménez)");
        System.out.println("=================================================");

        // --- 1. CONFIGURACIÓN INICIAL (Proveedores y Clientes) ---
        Proveedor p1 = new Proveedor("PRV1", "Fincas del Sur", "Calle A", "111-222");
        service.registrarProveedor(p1);

        Cliente c1 = new Cliente("CLI1", "Miguel Solis", "Av. Central 5", "555-1212", "SOMI800101XYZ");
        service.registrarCliente(c1);

        // --- 2. REGISTRO DE PRODUCTOS (RF1.2 Producto) ---

        System.out.println("\n--- 1. Registro de Productos ---");

        // El stock inicial se maneja en el constructor
        Producto prod1 = new Producto("PJ001", "Plátano Macho", 18.00, 10.50, 150, p1);
        Producto prod2 = new Producto("PJ002", "Plátano Dominico", 25.00, 15.00, 50, p1);

        service.registrarProducto(prod1);
        service.registrarProducto(prod2);

        // --- 3. BÚSQUEDA DE PRODUCTOS (RF1.3) ---

        System.out.println("\n--- 2. Búsqueda por Nombre ('Macho') ---");
        List<Producto> encontrados = service.buscarProductosPorNombre("Macho");
        encontrados.forEach(System.out::println);

        // --- 4. ACTUALIZACIÓN DE PRECIO (RF1.2 Actualización) ---

        System.out.println("\n--- 3. Actualización de Precio ---");
        prod2.setPrecioVenta(28.50); // Directamente en el objeto (Encapsulamiento)
        System.out.println("Precio actualizado de " + prod2.getNombre() + " a $" + prod2.getPrecioVenta());

        // --- 5. REGISTRO DE VENTA (Transacción) ---

        System.out.println("\n--- 4. Transacción de Venta ---");

        // Crear las líneas de la venta
        List<LineaVenta> lineas = new ArrayList<>();
        // Venta de 10 unidades de Plátano Macho
        lineas.add(new LineaVenta(prod1, 10, prod1.getPrecioVenta()));
        // Venta de 5 unidades de Plátano Dominico (al nuevo precio)
        lineas.add(new LineaVenta(prod2, 5, prod2.getPrecioVenta()));

        // Registrar la venta y obtener el objeto Venta final
        Venta ventaFinal = service.registrarNuevaVenta(c1, lineas);

        System.out.println("✅ Venta registrada exitosamente:");
        System.out.println(ventaFinal);

        // --- 6. VERIFICACIÓN DE STOCK ---

        System.out.println("\n--- 5. Verificación de Stock (Post-Venta) ---");
        System.out.println(prod1.getNombre() + " Stock restante: " + prod1.getCantidadStock()); // Debe ser 150 - 10 = 140
        System.out.println(prod2.getNombre() + " Stock restante: " + prod2.getCantidadStock()); // Debe ser 50 - 5 = 45
    }

    public static void main(String[] args) {
        SistemaJimenezController app = new SistemaJimenezController();
        app.iniciarSimulacion();
    }
}