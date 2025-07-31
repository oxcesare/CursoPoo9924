package com.mx.curso.console;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test04 {
    public static void main(String[] args) {

        int i =123;

        try{
            FileOutputStream out = new FileOutputStream("test.txt");
            ObjectOutputStream oos = new ObjectOutputStream(out);
            //oos.writeObject(i);
            //oos.write(new Integer(i));
            oos.writeObject(i);
            oos.flush();
            oos.close();
        }catch(Exception e){
            e.printStackTrace();

        }



    }
}
