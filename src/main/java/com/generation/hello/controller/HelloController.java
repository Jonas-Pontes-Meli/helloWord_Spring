package com.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class HelloController {
    @GetMapping("hello")
    public String hello() {
        return "Hello Word!";
    }

    @GetMapping("bsm")
    public String bsm() {
        return "Responsabilidade pessoal,\n" +
                "Mentalidade de crescimento,\n" +
                "Orientação ao futuro,\n" +
                "Persistência,\n" +
                "Comunicação,\n" +
                "Adaptabilidade,\n" +
                "Trabalho em equipe,\n" +
                "Proatividade,\n";
    }

    @GetMapping("objetivo")
    public String objetivo() {
        return "aprender spring e ver o jogo do brasil!";
    }
}
