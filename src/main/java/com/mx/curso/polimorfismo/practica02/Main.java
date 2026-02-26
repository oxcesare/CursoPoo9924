package com.mx.curso.polimorfismo.practica02;


/**
 * La interfaz es la mejor opcion para definir el comportamiento
 * de una clase, ya que nos permite definir un contrato que
 * debe ser cumplido por cualquier clase que implemente la interfaz.
 *
 * Es otra forma de implementar el polimorfismo, ya que una clase
 * puede implementar varias interfaces.
 */
public class Main {

    public static void main(String[] args) {

        Saludable persona1 = new Mesero();
        persona1.saludar();
    }

}
