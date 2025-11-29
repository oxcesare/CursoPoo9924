package com.mx.curso.unidad3.herencia.practica02;

public class Semaforo {

    private String estadoActual = "ROJO";
    private int idSemaforo;
    private static int TIEMPO_TOTAL_CICLO = 60;
    private static int contadorSemaforos = 0;

    /**
     * Constructor sin argumentos
     */
    public Semaforo() {
        contadorSemaforos++;
        this.idSemaforo = contadorSemaforos;
    }

    public String getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(String estadoActual) {
        this.estadoActual = estadoActual;
    }

    public int getIdSemaforo() {
        return idSemaforo;
    }


    public void cambiarEstado() {
        if (getEstadoActual().equals("ROJO")) {
            estadoActual = "VERDE";
        } else if (getEstadoActual().equals("VERDE")) {
            estadoActual = "AMARILLO";
        } else {
            estadoActual = "ROJO";
        }
    }

    public static void main(String[] args) {

        Semaforo semaforo1 = new Semaforo();
        semaforo1.setEstadoActual("ROJO");
        semaforo1.cambiarEstado();
        semaforo1.cambiarEstado();
        Semaforo.TIEMPO_TOTAL_CICLO = 60;
        System.out.println(semaforo1.getEstadoActual());


        Semaforo semaforo2 = new Semaforo();
        semaforo2.setEstadoActual("VERDE");
        semaforo2.cambiarEstado();
        semaforo2.cambiarEstado();
        Semaforo.TIEMPO_TOTAL_CICLO = 80;
        System.out.println(semaforo2.getEstadoActual());

        Semaforo semaforo3 = new Semaforo();
        semaforo3.cambiarEstado();
        semaforo3.cambiarEstado();
        Semaforo.TIEMPO_TOTAL_CICLO = 90;
        System.out.println(semaforo3.getEstadoActual());


    }
}
