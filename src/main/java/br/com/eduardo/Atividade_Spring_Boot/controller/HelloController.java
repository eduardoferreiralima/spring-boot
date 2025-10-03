package br.com.eduardo.Atividade_Spring_Boot.controller;

import br.com.eduardo.Atividade_Spring_Boot.model.Hello;
import org.springframework.web.bind.annotation.*;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api")
public class HelloController {
    private static final String tempate = "Olá, %s! Seja bem vindo!";

    private final AtomicLong counter = new AtomicLong();

    @GetMapping(value = "/hello")
    public String greeting(){
        return "Bem-vindo à aplicação Spring Boot!";
    }

    @RequestMapping("/message")
    public Hello message(@RequestParam(value = "name", defaultValue = "User") String name){
        return new Hello(counter.incrementAndGet(), String.format(tempate, name));
    }
}
