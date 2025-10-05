package com.platzi.play.domain.service;

import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface PlatziPlayAiService {
    
    @UserMessage("""
            Genera un saludo de bienvenida a la plataforma de gestion de peliculas {{platform}}
            """)
    public String generateWelcomeMessage(@V("platform") String platform);

    @UserMessage("""
            Eres un experto en sugerir peliculas para la plataforma de gestion de peliculas no incluyas peliculas que esten fuera de la plataforma debes recomendar maximo 3 peliculas.
            """)
    public String generateSuggestedMovie(@V("platform") String platform);
}
