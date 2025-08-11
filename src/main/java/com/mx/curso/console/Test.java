package com.mx.curso.console;

import java.io.Console;

public class Test {

    public static void main(String[] args) {

        Console con = System.console();
        String uname = con.readLine("User name");
        char[] p = con.readPassword("Password: ");


        System.out.println("User name: " + uname.toString());

        System.out.println("Password: ");

        for (char c : p) {
            System.out.print(c);
        }

    }
}
