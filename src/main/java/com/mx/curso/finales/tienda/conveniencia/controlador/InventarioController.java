package com.mx.curso.finales.tienda.conveniencia.controlador;


import com.mx.curso.finales.tienda.conveniencia.modelo.Producto;
import com.mx.curso.finales.tienda.conveniencia.modelo.Proveedor;
import com.mx.curso.finales.tienda.conveniencia.servicio.InventarioService;

public class InventarioController {

    private final InventarioService inventarioService;

    public InventarioController() {
        // Inicialización de la capa de Servicio
        this.inventarioService = new InventarioService();
    }

    public void iniciarSimulacion() {
        System.out.println("=================================================");
        System.out.println("    SISTEMA DE GESTIÓN DE INVENTARIO POO");
        System.out.println("=================================================");

        // 1. CREACIÓN DE OBJETOS PROVEEDOR
        Proveedor prov1 = new Proveedor("P001", "Distribuidora Fresh", "555-1234");
        Proveedor prov2 = new Proveedor("P002", "Mayorista Lácteos", "555-5678");

        // 2. REGISTRO DE PRODUCTOS (RF1.1)
        System.out.println("\n--- 1. Registro de Productos ---");

        Producto prodA = new Producto("PRD001", "Manzana Roja", 15.50, 20, prov1);
        Producto prodB = new Producto("PRD002", "Leche Entera", 22.00, 10, prov2);
        Producto prodC = new Producto("PRD003", "Pan Integral", 35.00, 3, prov1); // Stock bajo intencional

        inventarioService.registrarProducto(prodA);
        inventarioService.registrarProducto(prodB);
        inventarioService.registrarProducto(prodC);

        // 3. CONSULTA INICIAL
        System.out.println("\n--- 2. Inventario Inicial ---");
        inventarioService.obtenerTodosLosProductos().forEach(System.out::println);

        // 4. MODIFICACIÓN DE STOCK (RF1.2)
        System.out.println("\n--- 3. Ajuste de Inventario ---");

        // Venta simulada (disminuir stock)
        System.out.println("-> Venta de 8 unidades de Leche...");
        inventarioService.modificarStock("PRD002", -8); // Stock pasa de 10 a 2. (¡Debería disparar alerta!)

        // Compra a proveedor (aumentar stock)
        System.out.println("-> Recepción de 50 unidades de Manzana...");
        inventarioService.modificarStock("PRD001", 50); // Stock pasa de 20 a 70

        // 5. PRUEBA DE ALERTA DE INVENTARIO (RF1.4)
        System.out.println("-> Venta de 2 unidades de Pan Integral (ya estaba bajo)...");
        inventarioService.modificarStock("PRD003", -2); // Stock pasa de 3 a 1. Dispara alerta.

        // 6. CONSULTA FINAL
        System.out.println("\n--- 4. Inventario Final ---");
        inventarioService.obtenerTodosLosProductos().forEach(p ->
                System.out.printf("ID: %s, Nombre: %s, Stock: %d%n", p.getId(), p.getNombre(), p.getCantidadStock()));
    }

    public static void main(String[] args) {
        InventarioController app = new InventarioController();
        app.iniciarSimulacion();
    }
}