package com.mx.curso.arreglos;

public class Test {

    public static int[] getArray(){
        return null;
    }


    public static void main(String[] args) {
        int index =1;
        try {
            getArray()[index=2]=10;
        }catch(Exception e){

        }

        System.out.println("index = "+ index);
    }
}
