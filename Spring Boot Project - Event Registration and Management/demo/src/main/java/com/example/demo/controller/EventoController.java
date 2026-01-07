package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EventoController {

    @GetMapping("/cadastro")
    public String cadastro() {
        return "cadastro"; // templates/cadastro.html
    }

    @GetMapping("/listar")
    public String listar() {
        return "listar"; // templates/listar.html
    }
}

