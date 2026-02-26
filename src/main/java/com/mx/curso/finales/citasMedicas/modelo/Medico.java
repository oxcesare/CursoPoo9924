package com.mx.curso.finales.citasMedicas.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * 3. Medico (Clase Concreta): Extiende Persona. (RF1.2)
 */
public class Medico extends Persona {
    private final Especialidad especialidad; // Asociación a Especialidad (RF2.2)
    // Lista de Horarios Disponibles (RF3.1)
    private final List<Horario> horariosDisponibles;

    public Medico(String id, String nombre, String contacto, Especialidad especialidad) {
        super(id, nombre, contacto);
        this.especialidad = especialidad;
        this.horariosDisponibles = new ArrayList<>();
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public List<Horario> getHorariosDisponibles() {
        return horariosDisponibles;
    }

    public void agregarHorario(Horario horario) {
        this.horariosDisponibles.add(horario);
    }

    @Override
    public String mostrarInformacionDetallada() {
        return String.format("Médico [ID: %s, Nombre: %s, Especialidad: %s, Horarios: %d]",
                getId(), getNombre(), getEspecialidad(), horariosDisponibles.size());
    }
}