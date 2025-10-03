package com.platzi.play.persistance.mapper;

import org.mapstruct.Named;

import com.platzi.play.domain.Genre;

public class GenreMapper {
    private GenreMapper() {
        // Private constructor to prevent instantiation
    }
    
    @Named("stringToGenre")
    public static Genre stringToGenre(String genero) {
        if(genero == null) {
            return null;
        }
        
        return switch (genero.toUpperCase()) {
            case "ACCION" -> Genre.ACTION;
            case "COMEDIA" -> Genre.COMEDY;
            case "DRAMA" -> Genre.DRAMA;
            case "ANIMADA" -> Genre.ANIMATION;
            case "CIENCIA_FICCION" -> Genre.SCIENCE_FICTION;
            case "TERROR" -> Genre.HORROR;
            case "ROMANCE" -> Genre.ROMANCE;
            default -> null;
        };
    }

    @Named("genreToString")
    public static String genreToString(Genre genre) {
        if(genre == null) {
            return null;
        }
        
        return switch (genre) {
            case ACTION -> "ACCION";
            case COMEDY -> "COMEDIA";
            case DRAMA -> "DRAMA";
            case ANIMATION -> "ANIMADA";
            case SCIENCE_FICTION -> "CIENCIA_FICCION";
            case HORROR -> "TERROR";
            case ROMANCE -> "ROMANCE";
            default -> null;
        };
    }
    
}
