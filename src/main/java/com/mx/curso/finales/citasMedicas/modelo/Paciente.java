package com.mx.curso.finales.citasMedicas.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * 2. Paciente (Clase Concreta): Extiende Persona. (RF1.1)
 */
public class Paciente extends Persona {
    // Almacena el historial de citas (Asociación)
    private final List<Cita> historialCitas;

    public Paciente(String id, String nombre, String contacto) {
        super(id, nombre, contacto);
        this.historialCitas = new ArrayList<>();
    }

    public List<Cita> getHistorialCitas() {
        return historialCitas;
    }

    public void agregarCita(Cita cita) {
        this.historialCitas.add(cita);
    }

    @Override
    public String mostrarInformacionDetallada() {
        return String.format("Paciente [ID: %s, Nombre: %s, Contacto: %s, Citas: %d]",
                getId(), getNombre(), getContacto(), historialCitas.size());
    }
}