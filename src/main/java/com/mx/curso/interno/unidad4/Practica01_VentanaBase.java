package com.mx.curso.interno.unidad4;

import javax.swing.*;

public class Practica01_VentanaBase {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Mi Primera Interfaz POO");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel etiquetaTitulo = new JLabel("Unidad 4: Interfaces Gráficas");

        JLabel etiquetaNombre = new JLabel("Docente: Cesar Ricardo Alducin Ruiz");

        etiquetaTitulo.setBounds(100, 50, 200, 20);
        etiquetaNombre.setBounds(100, 100, 250, 20);

        frame.add(etiquetaTitulo);
        frame.add(etiquetaNombre);

        frame.setVisible(true);

    }

}
