package com.example.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AiController {
    @GetMapping("/ai/query")
    public String query(@RequestParam String prompt) {
        // placeholder - integrate with OpenAI or other AI service
        return "You asked: " + prompt + " (AI response would appear here)";
    }
}
