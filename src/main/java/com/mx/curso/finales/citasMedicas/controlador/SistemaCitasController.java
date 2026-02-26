package com.mx.curso.finales.citasMedicas.controlador;

import com.mx.curso.finales.citasMedicas.modelo.Cita;
import com.mx.curso.finales.citasMedicas.modelo.Especialidad;
import com.mx.curso.finales.citasMedicas.modelo.Medico;
import com.mx.curso.finales.citasMedicas.modelo.Paciente;
import com.mx.curso.finales.citasMedicas.servicio.GestionCitasService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

/**
 * Controlador: Punto de entrada de la aplicación.
 * Orquesta la simulación del flujo de gestión de citas.
 */
public class SistemaCitasController {

    private final GestionCitasService service;

    public SistemaCitasController() {
        this.service = new GestionCitasService();
    }

    public void iniciarSimulacion() {
        System.out.println("=================================================");
        System.out.println("    SIMULADOR DE GESTIÓN DE CITAS MÉDICAS (POO)");
        System.out.println("=================================================");

        // --- 1. CONFIGURACIÓN INICIAL (RF1.1 & RF1.2) ---

        Paciente p1 = new Paciente("P1", "Mario Hernández", "mario@mail.com");
        Paciente p2 = new Paciente("P2", "Luisa Gámez", "luisa@mail.com");

        Medico m1 = new Medico("M1", "Dra. Ana Soto", "ana@clinic.com", Especialidad.CARDIOLOGIA);
        Medico m2 = new Medico("M2", "Dr. Luis Pérez", "luis@clinic.com", Especialidad.PEDIATRIA);

        service.registrarPaciente(p1);
        service.registrarPaciente(p2);
        service.registrarMedico(m1);
        service.registrarMedico(m2);

        // --- 2. GESTIÓN DE HORARIOS (RF3.1) ---

        LocalDateTime hoy = LocalDate.now().atTime(9, 0);
        LocalDateTime manana = LocalDate.now().plusDays(1).atTime(10, 0);

        // Asignar disponibilidad al Cardiólogo
        service.agregarDisponibilidadMedico(m1, hoy);
        service.agregarDisponibilidadMedico(m1, hoy.plusHours(1));

        // Asignar disponibilidad al Pediatra
        service.agregarDisponibilidadMedico(m2, manana);
        service.agregarDisponibilidadMedico(m2, manana.plusHours(1));

        System.out.println("\n--- Disponibilidad de Médicos ---");
        System.out.println(m1.getNombre() + ": " + m1.getHorariosDisponibles());
        System.out.println(m2.getNombre() + ": " + m2.getHorariosDisponibles());

        // --- 3. BÚSQUEDA POR ESPECIALIDAD (RF2.3) ---

        System.out.println("\n--- 3. Búsqueda por Especialidad (CARDIOLOGIA) ---");
        List<Medico> cardios = service.buscarMedicosPorEspecialidad(Especialidad.CARDIOLOGIA);
        cardios.forEach(m -> System.out.println("Encontrado: " + m.getNombre()));

        // --- 4. AGENDAMIENTO DE CITAS (RF3.2) ---

        System.out.println("\n--- 4. Agendamiento ---");

        // Cita 1: Mario con Dra. Soto (Horario disponible)
        Optional<Cita> c1 = service.agendarCita(p1, m1, hoy);

        // Cita 2: Luisa con Dr. Pérez (Horario disponible)
        Optional<Cita> c2 = service.agendarCita(p2, m2, manana);

        // Cita 3: Intento de reservar el mismo slot (Debe fallar RNF2.2)
        System.out.println("\nIntento de reservar el mismo slot (Debe fallar):");
        service.agendarCita(p2, m1, hoy);

        // --- 5. CANCELACIÓN DE CITA (RF4.1) ---

        if (c1.isPresent()) {
            System.out.println("\n--- 5. Cancelación ---");
            // Cancelar la primera cita
            service.cancelarCita(c1.get().getId());

            // Comprobar que el slot se liberó
            System.out.println("\n--- Comprobación de Horario Liberado ---");
            System.out.println(m1.getNombre() + " (Slot original): " + m1.getHorariosDisponibles().get(0));

            // Intentar re-agendar en el slot liberado (Debe ser exitoso)
            System.out.println("\nIntento de re-agendar en slot liberado:");
            service.agendarCita(p2, m1, hoy);
        }
    }

    public static void main(String[] args) {
        SistemaCitasController app = new SistemaCitasController();
        app.iniciarSimulacion();
    }
}