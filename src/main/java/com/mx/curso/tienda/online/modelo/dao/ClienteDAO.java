package com.mx.curso.tienda.online.modelo.dao;

import com.mx.curso.tienda.online.modelo.Cliente;

import java.util.List;

public interface ClienteDAO {

    Cliente registrarCliente(Cliente cliente);

    Cliente obtenerClientePorId(long id);
    void actualizarCliente(Cliente cliente);
    void eliminarCliente(long id);

    List<Cliente> listarTodosLosClientes();


}
