package com.mx.curso.interno.unidad3.ordamientoObjetos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenamientoClientes {

    public static void main(String[] args) {
        // 1. Crear la lista de objetos Cliente
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente(102, "555-444", "Ana García"));
        clientes.add(new Cliente(101, "999-111", "Luis Castro"));
        clientes.add(new Cliente(102, "111-777", "Carla López")); // Mismo ID que Ana
        clientes.add(new Cliente(100, "123-456", "Omar Ruiz"));
        clientes.add(new Cliente(101, "999-111", "Esaú Silva")); // Mismo ID y NSS que Luis

        System.out.println("--- Lista Original ---");
        clientes.forEach(System.out::println);

        // 2. Definir el Comparator para el ordenamiento
        // Criterio 1: idCliente (ascendente)
        // Criterio 2: numeroSeguroSocial (ascendente, solo si idCliente es igual)

        Comparator<Cliente> comparador = Comparator
                .comparing(Cliente::getIdCliente) // Primer criterio (función lambda concisa)
                .thenComparing(Cliente::getNumeroSeguroSocial); // Segundo criterio (usado como desempate)

        // 3. Ordenar la lista
        clientes.sort(comparador);

        System.out.println("\n--- Lista Ordenada (ID y NSS) ---");
        clientes.forEach(System.out::println);
    }
}