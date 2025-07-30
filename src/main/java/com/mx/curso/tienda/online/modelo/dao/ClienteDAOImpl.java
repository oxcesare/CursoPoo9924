package com.mx.curso.tienda.online.modelo.dao;

import com.mx.curso.tienda.online.modelo.Cliente;

public class ClienteDAOImpl implements ClienteDAO {

    @Override
    public Cliente registrarCliente(Cliente cliente) {
        // Aquí se implementaría la lógica para registrar un cliente en la base de datos.
        // Por ahora, simplemente retornamos el cliente recibido.
        return cliente;
    }

    @Override
    public Cliente obtenerClientePorId(long id) {
        return null;
    }

    @Override
    public void actualizarCliente(Cliente cliente) {

    }

    @Override
    public void eliminarCliente(long id) {

    }

}
