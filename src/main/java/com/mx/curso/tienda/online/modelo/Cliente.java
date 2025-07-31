package com.mx.curso.tienda.online.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente {


    private long idCliente;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private String email;
    private String telefono;
    private String direccionEnvio;
    private String direccionFacturacion;
    private LocalDate fechaRegistro;
    private double lineaCreditoAsignada;
    private double lineaCreditoDisponible;


    private List<Pedido> historialPedidos;
    private List<MetodoPago> metodosPagoGuardados;

    /**
     * Constructor vacío.
     */
    public Cliente() {
        this.historialPedidos = new ArrayList<>();
        this.metodosPagoGuardados = new ArrayList<>();
    }

    /**
     * Constructor para crear un nuevo cliente con información básica.
     * @param nombre Nombre del cliente.
     * @param apellido Apellido del cliente.
     * @param fechaNacimiento Fecha de nacimiento del cliente.
     * @param email Correo electrónico del cliente.
     * @param telefono Número de teléfono del cliente.
     * @param direccionEnvio Dirección principal de envío.
     * @param direccionFacturacion Dirección principal de facturación.
     */
    public Cliente(String nombre, String apellido, LocalDate fechaNacimiento, String email, String telefono,
                   String direccionEnvio, String direccionFacturacion) {
        this(); // Llama al constructor vacío para inicializar listas
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
        this.telefono = telefono;
        this.direccionEnvio = direccionEnvio;
        this.direccionFacturacion = direccionFacturacion;
        this.fechaRegistro = LocalDate.now(); // Se registra la fecha actual al crear el cliente
    }

    // --- Getters y Setters ---

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public String getDireccionFacturacion() {
        return direccionFacturacion;
    }

    public void setDireccionFacturacion(String direccionFacturacion) {
        this.direccionFacturacion = direccionFacturacion;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public double getLineaCreditoAsignada() {
        return lineaCreditoAsignada;
    }

    public void setLineaCreditoAsignada(double lineaCreditoAsignada) {
        this.lineaCreditoAsignada = lineaCreditoAsignada;
    }

    public double getLineaCreditoDisponible() {
        return lineaCreditoDisponible;
    }

    public void setLineaCreditoDisponible(double lineaCreditoDisponible) {
        this.lineaCreditoDisponible = lineaCreditoDisponible;
    }

    public List<Pedido> getHistorialPedidos() {
        return historialPedidos;
    }

    public void setHistorialPedidos(List<Pedido> historialPedidos) {
        this.historialPedidos = historialPedidos;
    }

    public List<MetodoPago> getMetodosPagoGuardados() {
        return metodosPagoGuardados;
    }

    public void setMetodosPagoGuardados(List<MetodoPago> metodosPagoGuardados) {
        this.metodosPagoGuardados = metodosPagoGuardados;
    }

    // --- Métodos de Negocio (Ejemplos, la lógica principal estaría en el Service) ---

    /**
     * Actualiza la dirección de envío del cliente.
     * @param nuevaDireccion La nueva dirección de envío.
     */
    public void actualizarDireccionEnvio(String nuevaDireccion) {
        this.direccionEnvio = nuevaDireccion;
        // En una aplicación real, esto también implicaría una llamada al DAO desde el Service.
    }

    /**
     * Agrega un método de pago a la lista de métodos guardados del cliente.
     * @param metodoPago El método de pago a agregar.
     */
    public void agregarMetodoPago(MetodoPago metodoPago) {
        if (this.metodosPagoGuardados == null) {
            this.metodosPagoGuardados = new ArrayList<>();
        }
        this.metodosPagoGuardados.add(metodoPago);
        // En una aplicación real, esto también implicaría persistencia.
    }

    /**
     * Reduce la línea de crédito disponible del cliente.
     * @param monto El monto a deducir.
     * @return true si la deducción fue exitosa, false si no hay suficiente crédito.
     */
    public boolean deducirLineaCredito(double monto) {
        if (this.lineaCreditoDisponible >= monto) {
            this.lineaCreditoDisponible -= monto;
            return true;
        }
        return false;
    }

    /**
     * Aumenta la línea de crédito disponible del cliente (ej. por una devolución o ajuste).
     * @param monto El monto a añadir.
     */
    public void aumentarLineaCredito(double monto) {
        this.lineaCreditoDisponible += monto;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", email='" + email + '\'' +
                ", lineaCreditoAsignada=" + lineaCreditoAsignada +
                ", lineaCreditoDisponible=" + lineaCreditoDisponible +
                '}';
    }


}
