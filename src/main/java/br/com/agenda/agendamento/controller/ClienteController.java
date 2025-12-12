package br.com.agenda.agendamento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import br.com.agenda.agendamento.entity.Cliente;
import br.com.agenda.agendamento.service.ClienteService;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Cliente cliente) {

        clienteService.save(cliente);

        return "redirect:/clientes/listar";
    }

    @GetMapping("/listar")
    public String listar(Model model) {

        List<Cliente> clientes = clienteService.findAll();
        model.addAttribute("clientes", clientes);

        return "clientes/listaCliente";
    }

    @GetMapping("/criar")
    public String criarForm(Model model) {

        model.addAttribute("cliente", new Cliente());

        return "clientes/formCliente";

    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Integer id, Model model) {
        Cliente cliente = clienteService.findById(id);
        model.addAttribute("cliente", cliente);
        return "clientes/formCliente";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Integer id) {
        clienteService.deleteById(id);
        return "redirect:/clientes/listar";

    }

}
