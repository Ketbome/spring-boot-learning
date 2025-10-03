package com.platzi.play.web.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.platzi.play.persistance.crud.CrudMovieEntity;

import org.springframework.web.bind.annotation.GetMapping;

import com.platzi.play.persistance.entity.MovieEntity;


@RestController
public class MovieController {
    private final CrudMovieEntity crudMovieEntity;

    public MovieController(CrudMovieEntity crudMovieEntity) {
        this.crudMovieEntity = crudMovieEntity;
    }

    @GetMapping("/movies")
    public List<MovieEntity> getAll() {
        return (List<MovieEntity>) crudMovieEntity.findAll();
    }
}
