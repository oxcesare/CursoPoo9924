package com.mx.curso.arreglos;

public class OrderTest {

    //al llegar null la variable arr provoca un NullPointer Exception
    public void initData(String []arr){
        int ind =0;
        for(String str: arr){
            str.concat(str+" "+ind);
            ind++;
        }
    }

    public void printData(String []arr){
        for(String str: arr){
            System.out.println(str);
        }
    }


    public static void main(String[] args) {
        OrderTest ot = new OrderTest();
        String [] data = new String[2];
        ot.initData(data);
        ot.printData(data);

    }
}
