package com.platzi.play;

import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface PlatziPlayAiService {
    
    @UserMessage("""
            Genera un saludo de bienvenida a la plataforma de gestion de peliculas
            """)
    public String generateWelcomeMessage();
}
