package com.br.hospital.agendamento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
@RequestMapping("/agendamento")


public class AgendamentoController {

    @GetMapping
    public String index(Model model) {
        return "index";
    }
    
    
}
