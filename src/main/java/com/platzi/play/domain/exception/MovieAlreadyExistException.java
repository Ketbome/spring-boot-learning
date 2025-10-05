package com.platzi.play.domain.exception;

public class MovieAlreadyExistException extends RuntimeException {
    public MovieAlreadyExistException(String movie) {
        super("La pelicula " + movie + " ya existe");
    }
}
