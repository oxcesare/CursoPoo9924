package com.mx.curso.finales.banco.modelo;



import java.util.ArrayList;
import java.util.List;

/**
 * 1. Cliente: Encapsula los datos del cliente (RF1.1).
 * Contiene una lista de sus cuentas bancarias.
 */
public class Cliente {
    private final String idCliente;
    private final String nombre;
    // Agregación: Un Cliente contiene una lista de Cuentas Bancarias
    private final List<CuentaBancaria> cuentas;

    public Cliente(String idCliente, String nombre) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.cuentas = new ArrayList<>();
    }

    // Método para asociar la cuenta al cliente
    public void agregarCuenta(CuentaBancaria cuenta) {
        this.cuentas.add(cuenta);
    }

    // Getters
    public String getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public List<CuentaBancaria> getCuentas() {
        return cuentas;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "ID='" + idCliente + '\'' +
                ", Nombre='" + nombre + '\'' +
                ", Cuentas=" + cuentas.size() +
                '}';
    }
}