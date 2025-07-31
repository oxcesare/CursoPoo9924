package com.mx.curso.tienda.online.modelo.excepciones;

public class ClienteInvalidoException extends Exception {

    private static final long serialVersionUID = 1L; // Recomendado para serialización

    /**
     * Constructor que acepta un mensaje descriptivo del error de validación del cliente.
     * @param message Mensaje que describe la razón por la cual el cliente es inválido.
     */
    public ClienteInvalidoException(String message) {
        super(message);
    }

    /**
     * Constructor que acepta un mensaje y la causa original de la excepción.
     * @param message Mensaje que describe la razón por la cual el cliente es inválido.
     * @param cause La causa original de la excepción.
     */
    public ClienteInvalidoException(String message, Throwable cause) {
        super(message, cause);
    }
}
