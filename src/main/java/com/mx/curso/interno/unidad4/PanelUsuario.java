package com.mx.curso.interno.unidad4;

import javax.swing.*;
import java.awt.*;

// Paso 1: Crear el Módulo (Herencia)
// Hereda de JPanel para obtener todas las propiedades de un contenedor.
public class PanelUsuario extends JPanel {

    // Componentes encapsulados (Paso 2)
    private final JTextField txtNombre;
    private final JTextField txtEmail;

    // Identificador para diferenciar visualmente la instancia
    private final JLabel lblTitulo;

    /**
     * Constructor que inicializa la interfaz gráfica del módulo.
     * @param titulo El título a mostrar en el panel (ej. "Datos del Cliente").
     */
    public PanelUsuario(String titulo) {
        // Paso 2: Encapsular la Interfaz y el Layout

        // Configuración del layout del panel (Grid para organizar etiquetas y campos)
        this.setLayout(new GridLayout(3, 2, 5, 5));
        this.setBorder(BorderFactory.createTitledBorder(titulo)); // Título visual

        // Inicialización de componentes
        lblTitulo = new JLabel(titulo);
        txtNombre = new JTextField(20);
        txtEmail = new JTextField(20);

        // Añadir componentes al PanelUsuario
        this.add(new JLabel("Nombre:"));
        this.add(txtNombre);
        this.add(new JLabel("Email:"));
        this.add(txtEmail);
        this.add(new JLabel("")); // Espacio vacío
        this.add(new JLabel("")); // Espacio vacío
    }

    /**
     * Paso 3: Método Público de Acceso (Encapsulamiento - Getter)
     * Devuelve el dato encapsulado sin exponer el JTextField.
     * @return El texto ingresado en el campo de nombre.
     */
    public String obtenerNombreUsuario() {
        return txtNombre.getText();
    }

    /**
     * Método adicional de acceso para el email, demostrando el encapsulamiento.
     * @return El texto ingresado en el campo de email.
     */
    public String obtenerEmailUsuario() {
        return txtEmail.getText();
    }
}