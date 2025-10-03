package com.platzi.play.domain.repository;

import java.util.List;

import com.platzi.play.domain.dto.MovieDto;

public interface MovieRepository {
    List<MovieDto> getAll();
}
