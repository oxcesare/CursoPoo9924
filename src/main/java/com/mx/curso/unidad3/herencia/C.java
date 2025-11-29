package com.mx.curso.unidad3.herencia;

class Otro {

    public void mensaje() {
        System.out.println("Mensaje desde la clase Otro");
    }

}

class Segundo {

}

public class C implements D, E {

    public static void main(String[] args) {
        Otro otro = new Otro();
        otro.mensaje();

    }

    @Override
    public void metodoD() {

    }
}
