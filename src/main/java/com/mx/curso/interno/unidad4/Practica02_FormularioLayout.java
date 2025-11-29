package com.mx.curso.interno.unidad4;

import javax.swing.*;
import java.awt.*;

public class Practica02_FormularioLayout {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Mi Primera Interfaz POO");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //Instancia un JPanel llamado panelEntrada.
        JPanel panelEntrada = new JPanel();

        panelEntrada.setLayout(new GridLayout(3, 2, 10, 10));

        JTextField nombre = new JTextField();
        JTextField cantidad = new JTextField();
        JTextField precio = new JTextField();

        JLabel etiquetaNombre = new JLabel("Nombre:");
        JLabel etiquetaCantidad = new JLabel("Cantidad:");
        JLabel etiquetaPrecio = new JLabel("Precio:");

        panelEntrada.add(etiquetaNombre);
        panelEntrada.add(nombre);
        panelEntrada.add(etiquetaCantidad);
        panelEntrada.add(cantidad);
        panelEntrada.add(etiquetaPrecio);
        panelEntrada.add(precio);

        JButton guardarProducto = new JButton("Guardar Producto");
        frame.add(guardarProducto, BorderLayout.SOUTH);

        frame.add(panelEntrada, BorderLayout.CENTER);
        frame.setVisible(true);

    }
}
