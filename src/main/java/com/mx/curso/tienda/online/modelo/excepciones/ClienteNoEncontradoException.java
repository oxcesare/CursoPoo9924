package com.mx.curso.tienda.online.modelo.excepciones;

/**
 * Excepción personalizada para cuando un cliente no se encuentra en la base de datos
 * o no existe para una operación específica (ej. actualizar, eliminar).
 * Es una excepción marcada. Se lanza desde la capa de servicio.
 */
public class ClienteNoEncontradoException extends Exception {
    private static final long serialVersionUID = 1L; // Recomendado para serialización

    /**
     * Constructor que acepta un mensaje descriptivo de que el cliente no fue encontrado.
     * @param message Mensaje que indica que el cliente no existe.
     */
    public ClienteNoEncontradoException(String message) {
        super(message);
    }

    /**
     * Constructor que acepta un mensaje y la causa original de la excepción.
     * @param message Mensaje que indica que el cliente no existe.
     * @param cause La causa original de la excepción.
     */
    public ClienteNoEncontradoException(String message, Throwable cause) {
        super(message, cause);
    }
}
