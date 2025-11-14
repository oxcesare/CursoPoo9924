package com.mx.curso.unidad2.herencia;

public class Persona {

    private String name;

    public Persona(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int calcularAsistencia(){
        int asistencia=4;

        return asistencia;
    }
}
