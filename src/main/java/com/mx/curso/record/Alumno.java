package com.mx.curso.record;

// Definición de un record
public record Alumno(String nombre, String matricula) implements Identificable {

    @Override
    public String getId() {
        return matricula;
    }

}

