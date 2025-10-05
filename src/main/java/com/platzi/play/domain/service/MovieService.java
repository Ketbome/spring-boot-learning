package com.platzi.play.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.platzi.play.domain.dto.MovieDto;
import com.platzi.play.domain.dto.UpdateMovieDto;
import com.platzi.play.domain.repository.MovieRepository;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public MovieDto getById(Long id) {
        return movieRepository.getById(id);
    }

    public List<MovieDto> getAll() {
        return movieRepository.getAll();
    }

    public MovieDto save(MovieDto movieDto) {
        return movieRepository.save(movieDto);
    }

    public MovieDto update(Long id, UpdateMovieDto movieDto) {
        return movieRepository.update(id, movieDto);
    }

    public void delete(Long id) {
        movieRepository.delete(id);
    }
    
}
