package com.platzi.play.persistance.crud;

import org.springframework.data.repository.CrudRepository;

import com.platzi.play.persistance.entity.MovieEntity;

public interface CrudMovieEntity extends CrudRepository<MovieEntity, Long> {
    
}
