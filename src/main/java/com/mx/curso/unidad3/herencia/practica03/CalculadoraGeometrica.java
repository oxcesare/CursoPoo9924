package com.mx.curso.unidad3.herencia.practica03;

public class CalculadoraGeometrica {

    private String nombreFigura;
    public static double PI = Math.PI;

    public CalculadoraGeometrica() {
        this.nombreFigura = "Desconocida";
    }

    public CalculadoraGeometrica(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }

    public String getNombreFigura() {
        return nombreFigura;
    }

    public double calcularArea(double radio) {
        return PI * radio * radio;
    }

    public double calcularArea(double ancho, double alto) {
        return ancho * alto;
    }

    public double calcularArea(double base, int altura) {
        return (base * altura) / 2;
    }

    public static void main(String[] args) {
        CalculadoraGeometrica cal1
                = new CalculadoraGeometrica("Principal");

        System.out.println("Area del circulo " +
                cal1.calcularArea(5));

        System.out.println("Area del rectangulo " +
                cal1.calcularArea(4, 6));

        System.out.println("Area del triangulo " +
                cal1.calcularArea(12, 18));

        System.out.println("*********************************");

        CalculadoraGeometrica cal2
                = new CalculadoraGeometrica("Segunda Instancia");

        System.out.println("Area del circulo " +
                cal2.calcularArea(10));

        System.out.println("Area del rectangulo " +
                cal2.calcularArea(41, 6));

        System.out.println("Area del triangulo " +
                cal2.calcularArea(6, 4));


    }

}
