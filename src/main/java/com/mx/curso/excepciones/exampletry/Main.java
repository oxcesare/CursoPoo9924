package com.mx.curso.excepciones.exampletry;

public class Main {
    public static void main(String[] args) {
        UserService service = new UserService();
        service.process("nuevo@example.com");       // Éxito
        service.process("existing@example.com");    // Error en checkUserExists
        service.process("emailInvalido");           // Error en validateEmail
    }
}
