package com.mx.curso.factura;

import java.util.Scanner;

public class DetalleDeFactura {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame la descripcion del producto de oficina:");
        String descripcion = scanner.nextLine();
        System.out.println("Dame el precio del primer producto:");
        double precio1 = scanner.nextDouble();
        System.out.println("Dame el precio del segundo producto:");
        double precio2 = scanner.nextDouble();

        double total = precio1 + precio2;


        System.out.println("La factura producto de oficina tiene un total bruto de"
                + " $" + total + "  " + "con un impuesto de " + (total * 0.19) + " " +
                "y un total neto de $" + (total * 1.19) + ".");
    }
}
