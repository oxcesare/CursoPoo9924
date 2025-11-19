package com.mx.curso.interno.unidad2.ciclos;

public class ManejoDeCiclos {

    public static void main(String[] args) {

        int i=0;
        while(i<5){
            System.out.println("El valor de i es: "+ i);
            i++;
        }

        //declarar un do while que imprima numeros del 10 al 8
        int j=10;
        do{
            System.out.println("El valor de j es: "+ j);
            j--;
        }while(j>=8);

        //Tabla de multiplicar numero 7
        int numero=7;
        for(int k=1; k<=10; k++){
            int resultado = numero * k;
            System.out.println(numero + " x " + k + " = " + resultado);
        }
    }
}
