package com.platzi.play.persistance;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.stereotype.Repository;

import com.platzi.play.domain.dto.MovieDto;
import com.platzi.play.domain.dto.UpdateMovieDto;
import com.platzi.play.domain.repository.MovieRepository;
import com.platzi.play.persistance.crud.CrudMovieEntity;
import com.platzi.play.persistance.entity.MovieEntity;
import com.platzi.play.persistance.mapper.MovieMapper;

@Repository
public class MovieEntityRepository implements MovieRepository {
    private final CrudMovieEntity crudMovieEntity;
    private final MovieMapper movieMapper;

    public MovieEntityRepository(CrudMovieEntity crudMovieEntity, MovieMapper movieMapper) {
        this.movieMapper = movieMapper;
        this.crudMovieEntity = crudMovieEntity;
    }

    @Override
    public MovieDto getById(Long id) {
        return this.movieMapper.toDto(this.crudMovieEntity.findById(id).orElse(null));
    }

    @Override
    public List<MovieDto> getAll() {
        return this.movieMapper.toDto(this.crudMovieEntity.findAll());
    }

    @Override
    public MovieDto save(MovieDto movieDto) {
        MovieEntity movieEntity = this.movieMapper.toEntity(movieDto);
        movieEntity.setEstado("D");

        return this.movieMapper.toDto(this.crudMovieEntity.save(movieEntity));
    }

    @Override
    public MovieDto update(Long id, UpdateMovieDto movieDto) {
        MovieEntity movieEntity = this.crudMovieEntity.findById(id).orElse(null);
        if (movieEntity == null) {
            return null;
        }
        
        // Log para debug
        Logger.getLogger(MovieEntityRepository.class.getName()).info(
            "UpdateMovieDto recibido - status: '" + movieDto.status() + "' (longitud: " + 
            (movieDto.status() != null ? movieDto.status().length() : "null") + ")"
        );
        
        this.movieMapper.updateEntityFromDto(movieDto, movieEntity);
        
        // Log después del mapeo
        Logger.getLogger(MovieEntityRepository.class.getName()).info(
            "MovieEntity después del mapeo - estado: '" + movieEntity.getEstado() + "' (longitud: " + 
            (movieEntity.getEstado() != null ? movieEntity.getEstado().length() : "null") + ")"
        );

        return this.movieMapper.toDto(this.crudMovieEntity.save(movieEntity));
    }

    @Override
    public void delete(Long id) {
        this.crudMovieEntity.deleteById(id);
    }
}
