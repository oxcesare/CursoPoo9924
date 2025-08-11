package com.mx.curso.primitivos;

public class EnvoltoriosFloat {



    public static void main(String[] args) {

        float realFloat = 2.12e4f;
        System.out.println(realFloat);
        System.out.println(Float.BYTES);
        System.out.println(Float.SIZE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_NORMAL);
        System.out.println(Float.MIN_EXPONENT);


        System.out.println("***************************");


        double realDouble = 3.4028235E38;

        System.out.println(realDouble);
        System.out.println(Double.BYTES);
        System.out.println(Double.SIZE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_NORMAL);
        System.out.println(Double.MIN_EXPONENT);



    }
}
