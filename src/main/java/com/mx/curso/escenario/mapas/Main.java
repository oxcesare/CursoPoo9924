package com.mx.curso.escenario.mapas;

public class Main {

    public static void main(String[] args) {

        AlumnoCache cache = new AlumnoCache();

        cache.putAlumno(1, "Cesar");
        cache.putAlumno(2, "Ricardo");

        System.out.println(cache.getNombre(1));    // Cesar
        System.out.println(cache.getId("Ricardo")); // 2

    }
}
