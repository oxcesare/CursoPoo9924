package com.mx.curso.finales.banco.servicio;

import com.mx.curso.finales.banco.modelo.Cliente;
import com.mx.curso.finales.banco.modelo.CuentaBancaria;

import java.util.ArrayList;
import java.util.List;

/**
 * Servicio encargado de la lógica de Clientes y la apertura de Cuentas.
 * Gestiona la memoria (colecciones) del sistema.
 */
public class ClienteService {

    // Colección para persistir los clientes en memoria
    private final List<Cliente> registroClientes;
    private int contadorCuentas = 1000; // Contador simple para asignar IDs

    public ClienteService() {
        this.registroClientes = new ArrayList<>();
    }

    /**
     * RF1.1: Permite la creación de un nuevo cliente.
     */
    public Cliente registrarNuevoCliente(String nombre) {
        String idCliente = "CLI-" + (registroClientes.size() + 1);
        Cliente nuevoCliente = new Cliente(idCliente, nombre);
        this.registroClientes.add(nuevoCliente);
        System.out.println("Cliente registrado: " + nuevoCliente.getIdCliente());
        return nuevoCliente;
    }

    /**
     * Simula la apertura y asignación de la cuenta.
     * RF2.2: Asigna la cuenta creada a un cliente existente.
     */
    public CuentaBancaria abrirCuentaAhorro(Cliente cliente, double saldoInicial) {

        String numCuenta = "CTA-" + (++contadorCuentas);

        // 1. Creación del objeto Cuenta
        CuentaBancaria nuevaCuenta = new CuentaBancaria.CuentaAhorro(numCuenta, cliente, saldoInicial);

        // 2. Asociación (Regla de Negocio)
        cliente.agregarCuenta(nuevaCuenta);

        System.out.println("Cuenta de Ahorro " + numCuenta + " abierta exitosamente para " + cliente.getNombre());
        return nuevaCuenta;
    }

    public Cliente buscarClientePorId(String idCliente) {
        return registroClientes.stream()
                .filter(c -> c.getIdCliente().equals(idCliente))
                .findFirst()
                .orElse(null);
    }
}
