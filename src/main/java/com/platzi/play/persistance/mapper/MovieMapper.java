package com.platzi.play.persistance.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.platzi.play.domain.dto.MovieDto;
import com.platzi.play.persistance.entity.MovieEntity;

@Mapper(componentModel = "spring", uses = {GenreMapper.class, StateMapper.class})
public interface MovieMapper {
    @Mapping(source = "titulo", target = "title")
    @Mapping(source = "duracion", target = "duration")
    @Mapping(source = "genero", target = "genre", qualifiedByName = "stringToGenre")
    @Mapping(source = "clasificacion", target = "rating")
    @Mapping(source = "fechaEstreno", target = "releaseDate")
    @Mapping(source = "estado", target = "status", qualifiedByName = "stringToState")
    MovieDto toDto(MovieEntity movieEntity);
    List<MovieDto> toDto(Iterable<MovieEntity> movieEntities);

    @Mapping(source = "title", target = "titulo")
    @Mapping(source = "duration", target = "duracion")
    @Mapping(source = "genre", target = "genero", qualifiedByName = "genreToString")
    @Mapping(source = "rating", target = "clasificacion")
    @Mapping(source = "releaseDate", target = "fechaEstreno")
    @Mapping(source = "status", target = "estado", qualifiedByName = "stateToString")
    MovieEntity toEntity(MovieDto movieDto);
}
