package br.com.agenda.agendamento.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/agendamento")


public class AgendamentoController {

    @GetMapping
    public String index(Model model) {
        return "index";
    }
    
}
    