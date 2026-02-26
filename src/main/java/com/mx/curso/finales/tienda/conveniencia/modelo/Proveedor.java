package com.mx.curso.finales.tienda.conveniencia.modelo;

/**
 * 1. Proveedor: Entidad simple que modela el origen de los productos. (RF2.1)
 */
public class Proveedor {
    private final String id;
    private final String nombre;
    private final String contacto;

    public Proveedor(String id, String nombre, String contacto) {
        this.id = id;
        this.nombre = nombre;
        this.contacto = contacto;
    }

    // Getters para acceso controlado (Encapsulamiento)
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Proveedor [ID=" + id + ", Nombre=" + nombre + "]";
    }
}