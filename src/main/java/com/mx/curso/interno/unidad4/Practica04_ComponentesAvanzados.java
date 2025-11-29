package com.mx.curso.interno.unidad4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Practica04_ComponentesAvanzados implements ActionListener {

    // Componentes de la GUI declarados como variables de instancia
    private JFrame frame;
    private JComboBox<String> comboPrioridad;
    private JTextArea areaComentarios;
    private JButton botonEnviar;

    public Practica04_ComponentesAvanzados() {


        frame = new JFrame("Práctica 4: Componentes Avanzados");
        frame.setLayout(new BorderLayout(10, 10));

        // -----------------------------------------------------------------

        String[] opcionesPrioridad = {"Alta", "Media", "Baja", "Crítica"};
        comboPrioridad = new JComboBox<>(opcionesPrioridad);

        areaComentarios = new JTextArea(5, 30); // 5 filas, 30 columnas
        areaComentarios.setLineWrap(true);      // Permite que el texto salte de línea
        areaComentarios.setWrapStyleWord(true); // El salto se hace por palabra

        JScrollPane scroll = new JScrollPane(areaComentarios);

        JPanel panelCentral = new JPanel(new BorderLayout());

        JPanel panelCombo = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelCombo.add(new JLabel("Prioridad del Feedback: "));
        panelCombo.add(comboPrioridad);

        panelCentral.add(panelCombo, BorderLayout.NORTH);


        panelCentral.add(scroll, BorderLayout.CENTER);
        botonEnviar = new JButton("Enviar Feedback");
        frame.add(panelCentral, BorderLayout.CENTER);
        frame.add(botonEnviar, BorderLayout.SOUTH);

        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        botonEnviar.addActionListener(this);

        frame.setVisible(true);
    }

    /**
     * Paso 5: Lógica de Lectura
     * Se ejecuta cuando se pulsa el botón "Enviar Feedback".
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // Obtenemos el origen del evento para confirmar (opcional en este caso)
        if (e.getSource() == botonEnviar) {

            // A. Lectura de Prioridad (JComboBox)
            // Se debe hacer un casting explícito para obtener el String seleccionado
            String prioridadSel = (String) comboPrioridad.getSelectedItem();

            // B. Lectura de Comentarios (JTextArea)
            String comentarios = areaComentarios.getText();

            // Muestra ambos valores en la consola para confirmar la lectura de datos.
            System.out.println("----------------------------------------");
            System.out.println("Feedback Recibido:");
            System.out.println("Prioridad Seleccionada: " + prioridadSel);
            System.out.println("Comentarios:\n" + comentarios);
            System.out.println("----------------------------------------");

            // Opcional: Mostrar un mensaje al usuario en la GUI
            JOptionPane.showMessageDialog(frame, "Feedback enviado con prioridad: " + prioridadSel,
                    "Confirmación", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        // Buenas prácticas de Swing: Ejecutar la GUI en el Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(() -> new Practica04_ComponentesAvanzados());
    }
}