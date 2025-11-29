package com.mx.curso.escenario.mapas;

import java.util.HashMap;
import java.util.Map;

public class AlumnoCache {

    private final Map<Integer, String> mapIdToNombre = new HashMap<>();
    private final Map<String, Integer> mapNombreToId = new HashMap<>();

    private final Object lock = new Object(); // Lock compartido

    // Inserción atómica en ambos mapas
    public void putAlumno(int id, String nombre) {
        synchronized (lock) {
            mapIdToNombre.put(id, nombre);
            mapNombreToId.put(nombre, id);
        }
    }

    // Eliminación atómica en ambos mapas
    public void removeAlumno(int id) {
        synchronized (lock) {
            String nombre = mapIdToNombre.remove(id);
            if (nombre != null) {
                mapNombreToId.remove(nombre);
            }
        }
    }

    // Lecturas también sincronizadas si requieren coherencia entre mapas
    public String getNombre(int id) {
        synchronized (lock) {
            return mapIdToNombre.get(id);
        }
    }

    public Integer getId(String nombre) {
        synchronized (lock) {
            return mapNombreToId.get(nombre);
        }
    }
}
