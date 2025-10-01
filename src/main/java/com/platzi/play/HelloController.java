package com.platzi.play;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final PlatziPlayAiService platziPlayAiService;

    public HelloController(PlatziPlayAiService platziPlayAiService) {
        this.platziPlayAiService = platziPlayAiService;
    }

    @GetMapping("/")
    public String hello() {
        return platziPlayAiService.generateWelcomeMessage();
    }
}
