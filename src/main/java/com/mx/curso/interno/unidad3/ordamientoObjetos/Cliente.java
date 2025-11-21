package com.mx.curso.interno.unidad3.ordamientoObjetos;

public class Cliente {
    private final int idCliente;
    private final String numeroSeguroSocial; // Lo manejamos como String para preservar ceros iniciales
    private final String nombre;

    public Cliente(int idCliente, String numeroSeguroSocial, String nombre) {
        this.idCliente = idCliente;
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.nombre = nombre;
    }

    // Getters
    public int getIdCliente() {
        return idCliente;
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    // Método toString para impresión
    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + idCliente +
                ", NSS='" + numeroSeguroSocial + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}