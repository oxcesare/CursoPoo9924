package com.mx.curso.unidad2.ciclos;

public class AnalizadorDeNumeros {

    public static void main(String[] args) {

        int suma = 0;

        for (int i = 0; i < 100; i++) {
            suma += i;
        }
        System.out.println("La suma de los primeros 100 numeros es: " + suma);

        //Encontrar el primero numero mayor a 50

        int num=1;

        while(num<70){
            if(num>50){
                System.out.println("El primer numero mayor a 50 es: " + num);
                break;
            }
            num++;
        }
    }
}
