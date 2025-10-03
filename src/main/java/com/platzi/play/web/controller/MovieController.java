package com.platzi.play.web.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;

import com.platzi.play.domain.service.MovieService;
import com.platzi.play.domain.dto.MovieDto;


@RestController
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public List<MovieDto> getAll() {
        return movieService.getAll();
    }
}
