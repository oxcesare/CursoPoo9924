package com.mx.curso.console;

import java.io.Console;

public class Test {

    public static void main(String[] args) {

        Console con = System.console();
        if (con == null) {
            System.out.println("No se puede obtener la consola. Ejecuta este programa desde una terminal real.");
            return;
        }
        String uname = con.readLine("User name: ");
        char[] p = con.readPassword("Password: ");

        System.out.println("User name: " + uname);
        System.out.print("Password: ");
        for (char c : p) {
            System.out.print(c);
        }
        System.out.println();
    }
}
