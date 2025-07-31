package com.mx.curso.console;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test3 {

    public static void main(String[] args) throws IOException {


        BufferedWriter br = new BufferedWriter(new java.io.OutputStreamWriter(System.out));


        BufferedWriter cr = new BufferedWriter(new FileWriter("file.txt"));
    }
}
