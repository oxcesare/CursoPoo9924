package com.mx.curso.excepciones.either;

import io.vavr.control.Either;

class User {
    String email;
    public User(String email) { this.email = email; }
    public String getEmail() { return email; }
}

public class UserService {

    public Either<Exception, User> validateEmail(String email) {
        if (email.contains("@")) {
            return Either.right(new User(email));
        } else {
            return Either.left(new IllegalArgumentException("Email inválido"));
        }
    }

    public Either<Exception, User> checkUserExists(User user) {
        if (!user.getEmail().equals("existing@example.com")) {
            return Either.right(user);
        } else {
            return Either.left(new IllegalStateException("Usuario ya existe"));
        }
    }

    public Either<Exception, User> saveToDatabase(User user) {
        // Simulación de guardado
        return Either.right(user);
    }

    public Either<Exception, User> sendWelcomeEmail(User user) {
        // Simulación de envío de correo
        return Either.right(user);
    }

    public void process(String email) {
        Either<Exception, User> result = validateEmail(email)
                .flatMap(this::checkUserExists)
                .flatMap(this::saveToDatabase)
                .flatMap(this::sendWelcomeEmail);

        result.peek(user -> System.out.println("Proceso completado para: " + user.getEmail()))
                .peekLeft(error -> System.err.println("Error: " + error.getMessage()));
    }
}