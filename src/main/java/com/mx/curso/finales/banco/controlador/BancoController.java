package com.mx.curso.finales.banco.controlador;

import com.mx.curso.finales.banco.modelo.Cliente;
import com.mx.curso.finales.banco.modelo.CuentaBancaria;
import com.mx.curso.finales.banco.servicio.ClienteService;

public class BancoController {

    private final ClienteService clienteService;

    public BancoController() {
        // El controlador inicializa la capa de Servicio
        this.clienteService = new ClienteService();
    }
    public void iniciarSimulacion() {
        System.out.println("==============================================");
        System.out.println("     SIMULADOR BÁSICO DE APERTURA DE CUENTAS");
        System.out.println("==============================================");

        // 1. REGISTRO DE CLIENTES
        System.out.println("\n--- 1. Proceso de Registro de Clientes ---");

        Cliente cliente1 = clienteService.registrarNuevoCliente("Ana Torres");
        Cliente cliente2 = clienteService.registrarNuevoCliente("Marco Pérez");

        System.out.println(cliente1);
        System.out.println(cliente2);

        // 2. APERTURA DE CUENTAS
        System.out.println("\n--- 2. Apertura y Asociación de Cuentas ---");

        // Abrir una cuenta para Ana
        CuentaBancaria cuentaAna = clienteService.abrirCuentaAhorro(cliente1, 500.00);

        // Abrir dos cuentas para Marco
        CuentaBancaria cuentaMarco1 = clienteService.abrirCuentaAhorro(cliente2, 1250.75);
        CuentaBancaria cuentaMarco2 = clienteService.abrirCuentaAhorro(cliente2, 200.00);

        // 3. DEMOSTRACIÓN DE OPERACIONES BÁSICAS Y POO
        System.out.println("\n--- 3. Operaciones y Herencia ---");

        // Operación heredada: depositar
        cuentaAna.depositar(300.00);

        // Operación polimórfica: retirar (usa la lógica específica de CuentaAhorro)
        cuentaMarco1.retirar(100.00);
        cuentaMarco1.retirar(1500.00); // Intento fallido

        // Aplicar Interés (método abstracto implementado)
        cuentaAna.aplicarInteresODeduccion();

        // 4. VERIFICACIÓN FINAL (Controlador consulta el estado)
        System.out.println("\n--- 4. Estado Final de Cuentas ---");
        System.out.println(cliente1.getNombre() + " tiene cuentas: " + cliente1.getCuentas());
        System.out.println(cliente2.getNombre() + " tiene cuentas: " + cliente2.getCuentas());
    }


    public static void main(String[] args) {
        BancoController banco = new BancoController();
        banco.iniciarSimulacion();
    }
}
