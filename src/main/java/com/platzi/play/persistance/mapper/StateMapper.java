package com.platzi.play.persistance.mapper;

import org.mapstruct.Named;

public class StateMapper {
    
    private StateMapper() {
        // Private constructor to prevent instantiation
    }
    
    @Named("stringToState")
    public static Boolean stringToState(String estado) {
        if(estado == null) {
            return false;
        }

        return switch (estado.toUpperCase()) {
            case "D" -> true;
            case "P" -> false;
            default -> false;
        };
    }

    @Named("stateToString")
    public static String stateToString(Boolean estado) {
        return estado.equals(Boolean.TRUE) ? "D" : "P";
    }
}