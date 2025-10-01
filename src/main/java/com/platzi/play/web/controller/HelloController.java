package com.platzi.play.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.platzi.play.domain.service.PlatziPlayAiService;

@RestController
public class HelloController {
    private final String platform;
    private final PlatziPlayAiService platziPlayAiService;

    public HelloController(@Value("${spring.application.name}") String platform, PlatziPlayAiService platziPlayAiService) {
        this.platform = platform;
        this.platziPlayAiService = platziPlayAiService;
    }

    @GetMapping("/")
    public String hello() {
        return platziPlayAiService.generateWelcomeMessage(this.platform);
    }
}
