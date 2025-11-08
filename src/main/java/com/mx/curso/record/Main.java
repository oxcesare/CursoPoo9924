package com.mx.curso.record;


// Uso
public class Main {
    public static void main(String[] args) {

        Alumno alumno = new Alumno("Cesar", "UX99992353");

        System.out.println(alumno.nombre());    // Cesar
        System.out.println(alumno.matricula()); // UX99992353
        System.out.println(alumno);             // Alumno[nombre=Cesar, matricula=UX99992353]
        System.out.println(alumno.getId());
    }
}
