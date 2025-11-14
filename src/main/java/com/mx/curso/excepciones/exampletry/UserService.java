package com.mx.curso.excepciones.exampletry;

import io.vavr.control.Try;

class User {
    String email;
    public User(String email) { this.email = email; }
    public String getEmail() { return email; }
}

public class UserService {

    public User validateEmail(String email) throws Exception {
        if (email.contains("@")) {
            return new User(email);
        } else {
            throw new IllegalArgumentException("Email inválido");
        }
    }

    public User checkUserExists(User user) throws Exception {
        if (!user.getEmail().equals("existing@example.com")) {
            return user;
        } else {
            throw new IllegalStateException("Usuario ya existe");
        }
    }

    public User saveToDatabase(User user) throws Exception {
        // Simulación de guardado
        return user;
    }

    public User sendWelcomeEmail(User user) throws Exception {
        // Simulación de envío de correo
        return user;
    }

    public void process(String email) {
        Try<User> result = Try.of(() -> validateEmail(email))
                .flatMap(user -> Try.of(() -> checkUserExists(user)))
                .flatMap(user -> Try.of(() -> saveToDatabase(user)))
                .flatMap(user -> Try.of(() -> sendWelcomeEmail(user)));

        result.onSuccess(user -> System.out.println("Proceso completado para: " + user.getEmail()))
                .onFailure(error -> System.err.println("Error: " + error.getMessage()));
    }
}