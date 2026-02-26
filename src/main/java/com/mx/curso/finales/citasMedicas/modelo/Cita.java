package com.mx.curso.finales.citasMedicas.modelo;

import java.time.LocalDateTime;

/**
 * 6. Cita: Modela la transacción de la cita.
 */
public class Cita {
    private final String id;
    private final Paciente paciente; // Asociación
    private final Medico medico;     // Asociación
    private final Horario horarioAsociado; // Referencia al slot reservado
    private EstadoCita estado;

    public Cita(String id, Paciente paciente, Medico medico, Horario horarioAsociado) {
        this.id = id;
        this.paciente = paciente;
        this.medico = medico;
        this.horarioAsociado = horarioAsociado;
        this.estado = EstadoCita.AGENDADA;
    }

    // Lógica encapsulada (RF4.1)
    public void cancelar() {
        if (this.estado == EstadoCita.AGENDADA) {
            this.estado = EstadoCita.CANCELADA;
            // Liberar el horario asociado al cancelar la cita
            this.horarioAsociado.liberar();
        }
    }

    // Getters
    public String getId() { return id; }
    public Paciente getPaciente() { return paciente; }
    public Medico getMedico() { return medico; }
    public LocalDateTime getFechaHora() { return horarioAsociado.getFechaHoraInicio(); }
    public EstadoCita getEstado() { return estado; }

    @Override
    public String toString() {
        return String.format("Cita [ID:%s, Paciente:%s, Médico:%s (%s), Fecha:%s, Estado:%s]",
                id, paciente.getNombre(), medico.getNombre(), medico.getEspecialidad(),
                getFechaHora().toLocalTime(), estado);
    }
}