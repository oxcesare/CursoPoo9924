package com.mx.curso.unidad3;

public class Alumno {

    private String matricula;
    private String nombre;

    public Alumno() {
        System.out.println("Inicia clase");
    }

    public static void main(String[] args) {
        Alumno alumno = new Alumno();
    }

    public Alumno recibeAlumno(Alumno alumno){
        return alumno;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
