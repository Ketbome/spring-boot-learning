package com.platzi.play.domain.dto;

import java.time.LocalDate;

import com.platzi.play.domain.Genre;

public record MovieDto(
    String title,
    Integer duration,
    Genre genre,
    Double rating,
    LocalDate releaseDate,
    String status
) {
}
