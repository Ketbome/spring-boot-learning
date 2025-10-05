package com.platzi.play.domain.repository;

import java.util.List;

import com.platzi.play.domain.dto.MovieDto;
import com.platzi.play.domain.dto.UpdateMovieDto;

public interface MovieRepository {
    MovieDto getById(Long id);
    
    List<MovieDto> getAll();

    MovieDto save(MovieDto movieDto);

    MovieDto update(Long id, UpdateMovieDto movieDto);

    void delete(Long id);
    
}
