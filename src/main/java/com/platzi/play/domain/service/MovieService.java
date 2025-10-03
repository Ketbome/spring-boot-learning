package com.platzi.play.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.platzi.play.domain.dto.MovieDto;
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

    public void save(MovieDto movieDto) {
        movieRepository.save(movieDto);
    }

    public void delete(Long id) {
        movieRepository.delete(id);
    }
    
    public void update(MovieDto movieDto) {
        movieRepository.update(movieDto);
    }
}
