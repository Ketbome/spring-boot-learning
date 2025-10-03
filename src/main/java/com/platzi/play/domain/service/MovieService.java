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

    public List<MovieDto> getAll() {
        return movieRepository.getAll();
    }
}
