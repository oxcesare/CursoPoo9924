package com.mx.curso.finales.citasMedicas.modelo;

import java.time.LocalDateTime;

/**
 * 5. Horario: Modela una franja de tiempo que un médico ofrece. (RF3.1)
 */
public class Horario {
    private final LocalDateTime fechaHoraInicio;
    private EstadoHorario estado; // Estado (Disponible/Reservado)

    public Horario(LocalDateTime fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
        this.estado = EstadoHorario.DISPONIBLE;
    }

    // Lógica encapsulada
    public void reservar() {
        this.estado = EstadoHorario.RESERVADO;
    }

    public void liberar() {
        this.estado = EstadoHorario.DISPONIBLE;
    }

    // Getters
    public LocalDateTime getFechaHoraInicio() { return fechaHoraInicio; }
    public EstadoHorario getEstado() { return estado; }

    @Override
    public String toString() {
        return "Horario{" +
                "fechaHoraInicio=" + fechaHoraInicio +
                '}';
    }
}