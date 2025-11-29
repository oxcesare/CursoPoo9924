package com.mx.curso.interno.unidad4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Practica05_Modularizacion implements ActionListener {

    // Componentes de la GUI
    private JFrame frame;
    private JButton botonProcesar;

    // Paso 4: Reutilización de los Módulos (Objetos)
    private PanelUsuario panelCliente; // Instancia 1 para Cliente
    private PanelUsuario panelVendedor; // Instancia 2 para Vendedor

    public Practica05_Modularizacion() {
        frame = new JFrame("Práctica 5: Diseño Modular con JPanel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Usar BorderLayout para el Frame principal: Paneles al Centro, Botón al Sur
        frame.setLayout(new BorderLayout(10, 10));

        // Inicialización de los componentes modulares
        panelCliente = new PanelUsuario("Datos del Cliente");
        panelVendedor = new PanelUsuario("Datos del Vendedor");

        // Contenedor para los dos Paneles (Paso 5: Ensamble)
        JPanel panelContenedor = new JPanel(new GridLayout(1, 2, 15, 0));
        panelContenedor.add(panelCliente);
        panelContenedor.add(panelVendedor);

        // Botón y conexión
        botonProcesar = new JButton("Procesar Datos Modulares");
        botonProcesar.addActionListener(this);

        // Añadir los componentes al JFrame
        frame.add(panelContenedor, BorderLayout.CENTER);
        frame.add(botonProcesar, BorderLayout.SOUTH);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    /**
     * Método que se ejecuta al pulsar el botón.
     * Accede a los datos de forma modular.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonProcesar) {

            // Paso 5: Llamar a los métodos públicos de acceso en cada objeto
            String nombreCliente = panelCliente.obtenerNombreUsuario();
            String emailVendedor = panelVendedor.obtenerEmailUsuario();

            String mensaje = String.format(
                    "--- Lectura Modular ---\n" +
                            "Nombre del Cliente: %s\n" +
                            "Email del Vendedor: %s\n\n" +
                            "Datos obtenidos a través del método público de cada objeto (Encapsulamiento exitoso).",
                    nombreCliente, emailVendedor
            );

            System.out.println(mensaje);
            JOptionPane.showMessageDialog(frame, mensaje, "Resultado Modular", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        // Ejecutar la GUI en el Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(() -> new Practica05_Modularizacion());
    }
}