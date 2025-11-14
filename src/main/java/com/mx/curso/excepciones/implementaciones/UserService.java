package com.mx.curso.excepciones.implementaciones;

public class UserService {

    public Result<User, Exception> validateEmail(String email) {
        if (email.contains("@")) {
            return Result.success(new User(email));
        } else {
            return Result.failure(new IllegalArgumentException("Email inválido"));
        }
    }

    public Result<User, Exception> checkUserExists(User user) {
        if (!user.getEmail().equals("existing@example.com")) {
            return Result.success(user);
        } else {
            return Result.failure(new IllegalStateException("Usuario ya existe"));
        }
    }

    public Result<User, Exception> saveToDatabase(User user) {
        // Simulación de guardado
        return Result.success(user);
    }

    public Result<User, Exception> sendWelcomeEmail(User user) {
        // Simulación de envío de correo
        return Result.success(user);
    }

    public void process(String email) {
        Result<User, Exception> result = validateEmail(email)
                .flatMap(this::checkUserExists)
                .flatMap(this::saveToDatabase)
                .flatMap(this::sendWelcomeEmail);

        if (result.isSuccess()) {
            System.out.println("Proceso completado para: " + result.getValue().getEmail());
        } else {
            System.err.println("Error: " + result.getError().getMessage());
        }
    }
}