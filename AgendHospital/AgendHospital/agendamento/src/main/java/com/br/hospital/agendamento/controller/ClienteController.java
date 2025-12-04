package com.br.hospital.agendamento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.br.hospital.agendamento.entity.Cliente;
import com.br.hospital.agendamento.service.ClienteService;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

 @PostMapping("/salvar")
  public String salvar(@ModelAttribute Cliente cliente) {
    // Salvar Cliente
    clienteService.save(cliente);
    // redireciona para lista clientes//
    return "redirect:/clientes/listar";
  }

  @GetMapping("/listar")
  public String listar(Model model) {
    // Listar todos os clientes
    List<Cliente> clientes = clienteService.findAll();
    model.addAttribute("clientes", clientes);
    // retorna a pagia de lista de clientes
    return "clientes/listaCliente";
  }

  // metodo para abrir o formulário de criação de clientes
  @GetMapping("/criar")
  public String criarForm(Model model) {
    // Adiciona um novo cliente ao modelo
    model.addAttribute("cliente", new Cliente());
    // Retorna a página do formulário de clientes
    return "clientes/formCliente";

  }

  @GetMapping("/editar/{id}")
  public String editar(@PathVariable Integer id, Model model) {
      Cliente cliente = clienteService.findById(id);
      model.addAttribute("cliente", cliente);
      return "clientes/formCliente";
  }

  //Método para excluir um cliente
  @GetMapping("/excluir/{id}")
  //excluir um cliente pelo id
  public String excluir(@PathVariable Integer id) {
    clienteService.deleteById(id);
      return "redirect:/clientes/listar";

    
}

}

