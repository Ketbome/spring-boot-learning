package com.platzi.play.domain.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Max;

public record UpdateMovieDto(
    @NotBlank(message = "El titulo es requerido")
    String title,

    @Min(value = 0, message = "La calificacion debe ser mayor a 0")
    @Max(value = 5, message = "La calificacion debe ser menor a 5")
    BigDecimal rating,

    @PastOrPresent(message = "La fecha de estreno debe ser en el pasado o presente")
    LocalDate releaseDate,
    
    String status
) {
}
