package com.platzi.play.domain.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public record UpdateMovieDto(
    String title,
    BigDecimal rating,
    LocalDate releaseDate,
    String status
) {
}
