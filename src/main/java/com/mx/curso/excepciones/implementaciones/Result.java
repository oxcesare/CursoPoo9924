package com.mx.curso.excepciones.implementaciones;

import java.util.function.Function;

public class Result<T, E> {

    private final T value;
    private final E error;
    private final boolean isSuccess;

    private Result(T value, E error, boolean isSuccess) {
        this.value = value;
        this.error = error;
        this.isSuccess = isSuccess;
    }

    public static <T, E> Result<T, E> success(T value) {
        return new Result<>(value, null, true);
    }

    public static <T, E> Result<T, E> failure(E error) {
        return new Result<>(null, error, false);
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public T getValue() {
        return value;
    }

    public E getError() {
        return error;
    }

    public <U> Result<U, E> flatMap(Function<T, Result<U, E>> mapper) {
        if (isSuccess) {
            try {
                return mapper.apply(value);
            } catch (Exception ex) {
                return Result.failure((E) ex);
            }
        } else {
            return Result.failure(error);
        }
    }
}
