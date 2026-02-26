package com.mx.curso.finales.gestion.modelo;

public class Cliente {
    private final String id;
    private final String nombre;
    private final String direccion;
    private final String telefono;
    private final String rfc; // Opcional

    public Cliente(String id, String nombre, String direccion, String telefono, String rfc) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.rfc = rfc;
    }

    // Getters para acceso controlado (Encapsulamiento)
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getRfc() { return rfc; }

    @Override
    public String toString() {
        return "Cliente [ID=" + id + ", Nombre=" + nombre + ", Teléfono=" + telefono + "]";
    }
}