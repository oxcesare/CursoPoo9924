package com.mx.curso.colas;

import java.util.LinkedList;
import java.util.List;

public class EjemploCola {

    public static void main(String[] args) {


        //Ejemplo de colas FIFO (First In First Out)
        //En este ejemplo se utiliza la clase LinkedList que implementa la interfaz Queue
        List<Integer> cola = new LinkedList<>();
        cola.add(1);
        cola.add(2);
        cola.add(3);
        cola.add(4);


        for(Integer elemento : cola) {
            System.out.println("Elemento: " + elemento);
        }
    }
}
