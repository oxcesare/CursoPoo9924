package com.mx.curso.sealed;

// Clase sellada que solo permite ser extendida por Circle y Square
public abstract sealed class Shape permits Circle, Square, Triangle {


    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape square = new Square();
        Shape triangle = new Triangle();

        System.out.println("Created shapes: " + circle.getClass().getSimpleName() + ", "
                + square.getClass().getSimpleName() + ", "
                + triangle.getClass().getSimpleName());
    }

    public String getDescription(Shape shape) {
        return switch (shape) {
            case Circle c -> "Es un círculo";
            case Square s -> "Es un cuadrado";
            case Triangle t -> "Es un triángulo";
            // No es necesario un 'default' porque el compilador sabe que son todos los casos.
        };
    }
}

// Clases permitidas
final class Circle extends Shape {
    // ...
}

final class Square extends Shape {
    // ...
}

// Clase 'no permitida' (esto generaría un error de compilación)
// class Pentagon extends Shape {}

// Una clase permitida debe ser final, sellada o no-sellada
// Si es 'final', su jerarquía termina ahí
// Si es 'sealed', continua la jerarquía
// Si es 'non-sealed', la jerarquía se abre de nuevo
final class Triangle extends Shape {}