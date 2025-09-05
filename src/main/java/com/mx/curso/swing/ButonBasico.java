package com.mx.curso.swing;

public class ButonBasico {

    public static void main(String[] args) {

        javax.swing.JButton boton = new javax.swing.JButton("Presioname");
        boton.addActionListener(e -> System.out.println("Botón presionado!"));

        javax.swing.JFrame frame = new javax.swing.JFrame("Botón Básico");
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(boton);
        frame.setSize(200, 100);
        frame.setVisible(true);

        //agregar una caja de texto para recibir lo que el usuario escriba
        javax.swing.JTextField textField = new javax.swing.JTextField(20);
        frame.getContentPane().add(textField, java.awt.BorderLayout.NORTH);

        //Mostrar el texto ingresado en la caja de texto al presionar el botón
        boton.addActionListener(e -> {
            String texto = textField.getText();
            System.out.println("Texto ingresado: " + texto);
            textField.setText(""); // Limpiar la caja de texto después de mostrar el texto
        });

    }
}
