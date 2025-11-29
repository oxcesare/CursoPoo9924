package com.mx.curso.interno.unidad4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Practica03_ManejoEventos implements ActionListener {

    // Componentes de la GUI
    private JFrame frame;
    private JTextField txtCantidad;
    private JTextField txtPrecio;
    private JButton botonCalcular;

    public Practica03_ManejoEventos() {
        // Configuración del JFrame
        frame = new JFrame("Práctica 3: Manejo de Eventos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 200);
        frame.setLayout(new GridLayout(4, 2, 10, 10)); // Layout de cuadrícula

        // Inicialización de Componentes
        txtCantidad = new JTextField(10);
        txtPrecio = new JTextField(10);
        botonCalcular = new JButton("Calcular");

        // Añadir componentes al Frame
        frame.add(new JLabel("Cantidad:"));
        frame.add(txtCantidad);
        frame.add(new JLabel("Precio Unitario:"));
        frame.add(txtPrecio);
        frame.add(new JLabel("")); // Espacio vacío para alineación
        frame.add(botonCalcular);

        // Paso 3: Conectar el Evento
        // Registra esta instancia de la clase (this) como el Listener del botón
        botonCalcular.addActionListener(this);

        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        // Se podría verificar el origen del evento, pero como solo hay un botón, es opcional.
        // if (e.getSource() == botonCalcular) { ... }

        // Paso 4: Lógica de Lectura y Cálculo

        // A. Lectura
        String strCantidad = txtCantidad.getText();
        String strPrecio = txtPrecio.getText();

        try {
            // B. Conversión y Excepción
            int cantidad = Integer.parseInt(strCantidad);
            double precio = Double.parseDouble(strPrecio);

            // Verificación básica de valores positivos
            if (cantidad <= 0 || precio <= 0) {
                JOptionPane.showMessageDialog(frame,
                        "La cantidad y el precio deben ser valores positivos.",
                        "Error de Validación",
                        JOptionPane.WARNING_MESSAGE);
                return; // Detiene la ejecución si los valores no son válidos
            }

            // C. Cálculo
            double total = cantidad * precio;

            // D. Feedback
            // Muestra el resultado final usando JOptionPane
            JOptionPane.showMessageDialog(frame,
                    String.format("Costo Total: $%.2f", total),
                    "Resultado del Cálculo",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException ex) {
            // Captura NumberFormatException si la conversión falla (ej. si hay letras)
            JOptionPane.showMessageDialog(frame,
                    "Error: Asegúrese de ingresar solo números válidos en ambos campos.",
                    "Error de Formato",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    public static void main(String[] args) {


        SwingUtilities.invokeLater(() -> new Practica03_ManejoEventos());

    }


}
