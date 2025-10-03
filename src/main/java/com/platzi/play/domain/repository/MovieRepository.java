package com.platzi.play.domain.repository;

import java.util.List;

import com.platzi.play.domain.dto.MovieDto;

public interface MovieRepository {
    MovieDto getById(Long id);
    
    List<MovieDto> getAll();

    void save(MovieDto movieDto);

    void delete(Long id);

    void update(MovieDto movieDto);
    
}
