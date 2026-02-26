package com.mx.curso.finales.citasMedicas.servicio;

import com.mx.curso.finales.citasMedicas.modelo.*;

import com.mx.curso.finales.citasMedicas.modelo.Especialidad;
import com.mx.curso.finales.citasMedicas.modelo.EstadoCita;
import com.mx.curso.finales.citasMedicas.modelo.EstadoHorario;



import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * Servicio: Gestiona las colecciones y la lógica de negocio (agendamiento, búsqueda).
 */
public class GestionCitasService {

    private final List<Paciente> pacientes;
    private final List<Medico> medicos;
    private final List<Cita> citas;
    private final AtomicInteger contadorCitas = new AtomicInteger(100);

    public GestionCitasService() {
        this.pacientes = new ArrayList<>();
        this.medicos = new ArrayList<>();
        this.citas = new ArrayList<>();
    }

    // --- RF1.1 & RF1.2: Registro ---

    public void registrarPaciente(Paciente paciente) {
        this.pacientes.add(paciente);
        System.out.println("✅ Paciente registrado: " + paciente.getNombre());
    }

    public void registrarMedico(Medico medico) {
        this.medicos.add(medico);
        System.out.println("✅ Médico registrado: " + medico.getNombre() + " (" + medico.getEspecialidad() + ")");
    }

    // --- RF1.3: Consulta ---

    public Optional<Medico> buscarMedicoPorId(String id) {
        return medicos.stream().filter(m -> m.getId().equals(id)).findFirst();
    }

    // --- RF2.3: Búsqueda por Especialidad ---

    public List<Medico> buscarMedicosPorEspecialidad(Especialidad especialidad) {
        return medicos.stream()
                .filter(m -> m.getEspecialidad() == especialidad)
                .collect(Collectors.toList());
    }

    // --- RF3.1: Gestión de Horarios ---

    public void agregarDisponibilidadMedico(Medico medico, LocalDateTime fechaHora) {
        Horario nuevoSlot = new Horario(fechaHora);
        medico.agregarHorario(nuevoSlot);
    }

    // --- RF3.2: Agendamiento (Lógica Central) ---

    public Optional<Cita> agendarCita(Paciente paciente, Medico medico, LocalDateTime fechaHoraCita) {
        // 1. Buscar el slot disponible en el médico
        Optional<Horario> horarioOpt = medico.getHorariosDisponibles().stream()
                .filter(h -> h.getFechaHoraInicio().equals(fechaHoraCita))
                .filter(h -> h.getEstado() == EstadoHorario.DISPONIBLE)
                .findFirst();

        if (horarioOpt.isPresent()) {
            Horario horario = horarioOpt.get();
            // 2. Transacción atómica: Reservar el horario
            horario.reservar();

            // 3. Crear la Cita y asociarla
            String idCita = "CIT-" + contadorCitas.incrementAndGet();
            Cita nuevaCita = new Cita(idCita, paciente, medico, horario);

            this.citas.add(nuevaCita);
            paciente.agregarCita(nuevaCita);

            System.out.println("✅ Cita agendada: " + nuevaCita);
            return Optional.of(nuevaCita);

        } else {
            System.out.println("❌ ERROR: El horario seleccionado no está disponible.");
            return Optional.empty();
        }
    }

    // --- RF4.1: Cancelación ---

    public boolean cancelarCita(String idCita) {
        Optional<Cita> citaOpt = citas.stream()
                .filter(c -> c.getId().equals(idCita) && c.getEstado() == EstadoCita.AGENDADA)
                .findFirst();

        if (citaOpt.isPresent()) {
            Cita cita = citaOpt.get();
            // Lógica delegada al modelo Cita (Encapsulamiento)
            cita.cancelar();
            System.out.println("❌ Cita cancelada: " + cita.getId());
            return true;
        }
        System.out.println("⚠️ No se encontró la cita " + idCita + " o ya estaba cancelada.");
        return false;
    }
}