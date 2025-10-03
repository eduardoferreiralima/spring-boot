package br.com.eduardo.Atividade_Spring_Boot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {
    @GetMapping(value = "/hello")
    public String greeting(){
        return "Bem-vindo à aplicação Spring Boot!";
    }
}
