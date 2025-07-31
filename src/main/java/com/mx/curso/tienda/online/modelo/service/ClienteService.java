package com.mx.curso.tienda.online.modelo.service;

import com.mx.curso.tienda.online.modelo.Cliente;
import com.mx.curso.tienda.online.modelo.dao.ClienteDAO;
import com.mx.curso.tienda.online.modelo.excepciones.ClienteInvalidoException;
import com.mx.curso.tienda.online.modelo.excepciones.ClienteNoEncontradoException;
import com.mx.curso.tienda.online.modelo.excepciones.PersistenciaException;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class ClienteService {

    private final ClienteDAO clienteDAO; // Dependencia de la interfaz ClienteDAO

    /**
     * Constructor que inyecta la dependencia de ClienteDAO.
     * Esto permite que ClienteService no se preocupe por cómo se implementa el acceso a datos.
     * @param clienteDAO La implementación de ClienteDAO a utilizar.
     */
    public ClienteService(ClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

    /**
     * Registra un nuevo cliente en el sistema, aplicando las reglas de negocio.
     *
     * @param cliente El objeto Cliente con los datos iniciales (nombre, fechaNacimiento).
     * @return El objeto Cliente registrado, con su ID y línea de crédito asignados.
     * @throws ClienteInvalidoException Si el cliente no cumple con las reglas de negocio (ej. edad).
     * @throws PersistenciaException Si ocurre un error al guardar el cliente en la base de datos.
     */
    public Cliente registrarCliente(Cliente cliente) throws ClienteInvalidoException, PersistenciaException {
        // 1. Validar la edad del cliente
        if (cliente.getFechaNacimiento() == null) {
            throw new ClienteInvalidoException("La fecha de nacimiento del cliente no puede ser nula.");
        }

        int edad = calcularEdad(cliente.getFechaNacimiento());

        if (edad < 18 || edad > 65) {
            throw new ClienteInvalidoException("Cliente no aceptado. La edad debe estar entre 18 y 65 años. Edad actual: " + edad);
        }

        // 2. Asignar línea de crédito según la edad
        double lineaCreditoAsignada;
        if (edad >= 18 && edad <= 25) {
            lineaCreditoAsignada = 3000.00;
        } else if (edad >= 26 && edad <= 30) {
            lineaCreditoAsignada = 5000.00;
        } else { // edad >= 31 && edad <= 65
            lineaCreditoAsignada = 8000.00;
        }
        cliente.setLineaCreditoAsignada(lineaCreditoAsignada);
        cliente.setLineaCreditoDisponible(lineaCreditoAsignada); // Al inicio, disponible = asignada

        // 3. Persistir el cliente utilizando el DAO
        // El DAO se encarga de la conexión y la sentencia SQL
        Cliente clienteRegistrado = clienteDAO.registrarCliente(cliente);

        return clienteRegistrado;
    }

    /**
     * Obtiene los detalles de un cliente por su ID.
     *
     * @param idCliente El ID del cliente a buscar.
     * @return El objeto Cliente encontrado.
     * @throws ClienteNoEncontradoException Si el cliente con el ID especificado no existe.
     * @throws PersistenciaException Si ocurre un error al consultar la base de datos.
     */
    public Cliente obtenerClientePorId(long idCliente) throws ClienteNoEncontradoException, PersistenciaException {
        Cliente cliente = clienteDAO.obtenerClientePorId(idCliente);
        if (cliente == null) {
            throw new ClienteNoEncontradoException("No se encontró ningún cliente con el ID: " + idCliente);
        }
        return cliente;
    }

    /**
     * Actualiza la información de un cliente existente.
     *
     * @param cliente El objeto Cliente con la información a actualizar.
     * @throws ClienteNoEncontradoException Si el cliente a actualizar no existe.
     * @throws PersistenciaException Si ocurre un error al actualizar el cliente en la base de datos.
     */
    public void actualizarCliente(Cliente cliente) throws ClienteNoEncontradoException, PersistenciaException {
        // Opcional: Podrías verificar si el cliente existe antes de intentar actualizarlo
        // if (clienteDAO.obtenerClientePorId(cliente.getIdCliente()) == null) {
        //     throw new ClienteNoEncontradoException("El cliente con ID " + cliente.getIdCliente() + " no existe para actualizar.");
        // }
        clienteDAO.actualizarCliente(cliente);
    }

    /**
     * Elimina un cliente del sistema por su ID.
     *
     * @param idCliente El ID del cliente a eliminar.
     * @throws ClienteNoEncontradoException Si el cliente a eliminar no existe.
     * @throws PersistenciaException Si ocurre un error al eliminar el cliente de la base de datos.
     */
    public void eliminarCliente(long idCliente) throws ClienteNoEncontradoException, PersistenciaException {
        // Opcional: Podrías añadir lógica de negocio aquí, por ejemplo,
        // no permitir eliminar clientes con préstamos activos.
        // if (clienteDAO.obtenerClientePorId(idCliente) == null) {
        //     throw new ClienteNoEncontradoException("El cliente con ID " + idCliente + " no existe para eliminar.");
        // }
        clienteDAO.eliminarCliente(idCliente);
    }

    /**
     * Lista todos los clientes registrados en el sistema.
     *
     * @return Una lista de todos los clientes.
     * @throws PersistenciaException Si ocurre un error al consultar la base de datos.
     */
    public List<Cliente> listarTodosLosClientes() throws PersistenciaException {
        return clienteDAO.listarTodosLosClientes();
    }

    /**
     * Método auxiliar para calcular la edad de un cliente a partir de su fecha de nacimiento.
     * @param fechaNacimiento La fecha de nacimiento del cliente.
     * @return La edad del cliente en años.
     */
    private int calcularEdad(LocalDate fechaNacimiento) {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }


}
