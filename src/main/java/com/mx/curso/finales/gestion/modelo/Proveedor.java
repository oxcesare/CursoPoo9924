package com.mx.curso.finales.gestion.modelo;

public class Proveedor {
    private final String id;
    private final String nombre;
    private final String direccion;
    private final String telefono;

    public Proveedor(String id, String nombre, String direccion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // Getters
    public String getId() { return id; }
    public String getNombre() { return nombre; }

    @Override
    public String toString() {
        return "Proveedor [ID=" + id + ", Nombre=" + nombre + "]";
    }
}