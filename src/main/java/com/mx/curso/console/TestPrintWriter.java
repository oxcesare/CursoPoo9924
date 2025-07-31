package com.mx.curso.console;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TestPrintWriter {

    public static void main(String[] args) throws FileNotFoundException {

        PrintWriter pw = new PrintWriter("file.txt");
        pw.print("Whiz");
        pw.print(new char[]{'I', 'a', 'b'});
        pw.println();
        pw.flush();
        pw.close();

    }
}
