package com.mx.curso.excepciones;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExceptionPropagationExample {

    public static void main(String[] args) {
        System.out.println("--- Inicio del programa ---");
        try {
            // La ejecución comienza aquí, llama al método 1
            method1();
        } catch (RuntimeException e) {
            System.err.println("Capturada RuntimeException en main: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Capturada IOException en main: " + e.getMessage());
        } finally {
            System.out.println("Bloque finally de main ejecutado.");
        }
        System.out.println("--- Fin del programa ---");
    }

    // Método 1: Llama al método 2
    public static void method1() throws IOException {
        System.out.println("  Entrando a method1()");
        method2();
        System.out.println("  Saliendo de method1()"); // Esta línea no se ejecuta si la excepción se propaga
    }

    // Método 2: Llama al método 3
    public static void method2() throws IOException {
        System.out.println("    Entrando a method2()");
        method3();
        System.out.println("    Saliendo de method2()"); // Esta línea no se ejecuta si la excepción se propaga
    }

    // Método 3: Llama al método 4
    public static void method3() throws IOException {
        System.out.println("      Entrando a method3()");
        method4();
        System.out.println("      Saliendo de method3()"); // Esta línea no se ejecuta si la excepción se propaga
    }

    // Método 4: Lanza una excepción (RuntimeException o IOException)
    public static void method4() throws IOException {
        System.out.println("        Entrando a method4()");

        // Ejemplo 1: Lanzar una RuntimeException (no necesita 'throws' en la firma)
        // System.out.println("        Lanzando una RuntimeException...");
        // throw new RuntimeException("¡Error inesperado desde el método 4!");

        // Ejemplo 2: Lanzar una IOException (necesita 'throws IOException' en la firma)
        System.out.println("        Intentando una operación que puede lanzar IOException...");
        Path nonExistentFile = Paths.get("nonExistentDirectory/nonExistentFile.txt");
        Files.readAllBytes(nonExistentFile); // Esto lanzará una IOException (FileNotFoundException)

        System.out.println("        Saliendo de method4()"); // Esta línea NO se ejecuta si se lanza la excepción
    }

    // Método 5: Un método que podría ser llamado, pero en este ejemplo no lo es directamente desde la cadena de propagación
    public static void method5() {
        System.out.println("          Entrando a method5()");
        System.out.println("          Saliendo de method5()");
    }

    // Método 4: Lanza y captura la excepción localmente
    public static void method44() { // Notar que ya no necesita 'throws IOException'
        System.out.println("        Entrando a method4()");
        try {
            System.out.println("        Intentando una operación que puede lanzar IOException...");
            Path nonExistentFile = Paths.get("nonExistentDirectory/nonExistentFile.txt");
            Files.readAllBytes(nonExistentFile); // Esto lanzará una IOException (FileNotFoundException)
            System.out.println("        Esta línea NO se ejecuta si se lanza la excepción antes.");

        } catch (IOException e) {
            // ¡La excepción es capturada aquí!
            System.err.println("        Capturada IOException DENTRO de method4(): " + e.getMessage());
            // Aquí puedes decidir qué hacer:
            // 1. Manejarla y continuar: El programa seguirá ejecutándose normalmente DESPUÉS del catch.
            // 2. Lanzar una nueva excepción (wrap): Puedes lanzar una RuntimeException o una excepción personalizada.
            //    throw new RuntimeException("Error al leer archivo en method4", e);
            // 3. Registrar el error y devolver un valor por defecto.
        } finally {
            System.out.println("        Bloque finally de method4() ejecutado.");
        }

        // Esta línea sí se ejecuta porque la excepción fue capturada dentro de method4()
        System.out.println("        Saliendo de method4() (la excepción fue manejada aquí).");
    }
}