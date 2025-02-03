package com.austinjarrett.portfolio.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
public class PortfolioBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(PortfolioBackendApplication.class, args);
    }

    @RestController
    class HelloControllre {
        @GetMapping("/api/hello")
        @CrossOrigin(origins = "*")
        String hello() {
            return "Hello, Crystal!";
        }
    }
}
