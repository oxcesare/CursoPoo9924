package com.mx.curso.finales.citasMedicas.modelo;

/**
 * 1. Persona (Clase Abstracta): Base para Medico y Paciente.
 * Aplica el principio de ABSTRACCIÓN.
 */
public abstract class Persona {
    protected final String id;
    protected final String nombre;
    protected final String contacto;

    public Persona(String id, String nombre, String contacto) {
        this.id = id;
        this.nombre = nombre;
        this.contacto = contacto;
    }

    // Método polimórfico (se implementa en las subclases)
    public abstract String mostrarInformacionDetallada();

    // Getters para acceso controlado (Encapsulamiento)
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getContacto() { return contacto; }
}