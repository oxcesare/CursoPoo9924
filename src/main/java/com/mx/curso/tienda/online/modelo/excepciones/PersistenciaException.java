package com.mx.curso.tienda.online.modelo.excepciones;

/**
 * Excepción personalizada para errores que ocurren en la capa de persistencia (DAO).
 * Es una excepción marcada (checked exception) para forzar su manejo.
 * Indica problemas al interactuar con la base de datos (ej. SQL, conexión).
 */
public class PersistenciaException extends Exception {
    private static final long serialVersionUID = 1L; // Recomendado para serialización

    /**
     * Constructor que acepta un mensaje descriptivo del error.
     * @param message Mensaje que describe la causa de la excepción.
     */
    public PersistenciaException(String message) {
        super(message);
    }

    /**
     * Constructor que acepta un mensaje y la causa original de la excepción.
     * Esto es útil para envolver excepciones de bajo nivel (ej. SQLException).
     * @param message Mensaje que describe la causa de la excepción.
     * @param cause La causa original de la excepción.
     */
    public PersistenciaException(String message, Throwable cause) {
        super(message, cause);
    }
}

