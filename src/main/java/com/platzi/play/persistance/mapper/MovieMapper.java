package com.platzi.play.persistance.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.platzi.play.domain.dto.MovieDto;
import com.platzi.play.domain.dto.UpdateMovieDto;
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

    @InheritInverseConfiguration
    @Mapping(source = "genre", target = "genero", qualifiedByName = "genreToString")
    @Mapping(source = "status", target = "estado", qualifiedByName = "stateToString")
    MovieEntity toEntity(MovieDto movieDto);

    @Mapping(source = "title", target = "titulo", nullValuePropertyMappingStrategy = org.mapstruct.NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(source = "rating", target = "clasificacion", nullValuePropertyMappingStrategy = org.mapstruct.NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(source = "releaseDate", target = "fechaEstreno", nullValuePropertyMappingStrategy = org.mapstruct.NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(source = "status", target = "estado", qualifiedByName = "stateToString", nullValuePropertyMappingStrategy = org.mapstruct.NullValuePropertyMappingStrategy.IGNORE)
    void updateEntityFromDto(UpdateMovieDto updateMovieDto, @MappingTarget MovieEntity movieEntity);
}
