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
import com.br.hospital.agendamento.entity.Consulta;
import com.br.hospital.agendamento.entity.Medico;
import com.br.hospital.agendamento.service.ClienteService;
import com.br.hospital.agendamento.service.ConsultaService;
import com.br.hospital.agendamento.service.MedicoService;




@Controller
@RequestMapping("/consultas")
public class ConsultaController {


    @Autowired
    private ConsultaService consultaService;

    @Autowired
    private MedicoService medicoService;

    @Autowired
    private ClienteService clienteService;



    @PostMapping("/salvar")
  public String salvar(@ModelAttribute Consulta consulta) {
    // Salvar Aluno
    consultaService.save(consulta);
    // redireciona para lista alunos//
    return "redirect:/consultas/listar";
  }

  @GetMapping("/listar")
  public String listar(Model model) {
    // Listar todos os alunos
    List<Consulta> consultas = consultaService.findAll();
    model.addAttribute("consultas", consultas);
    // retorna a pagia de lista de alunos
    return "consultas/listaConsul";
  }

  // metodo para abrir o formulário de criação de alunos
  @GetMapping("/criar")
  public String criarForm(Model model) {
    // Adiciona um novo aluno ao modelo
    model.addAttribute("consulta", new Consulta());
    List<Medico> medicos = medicoService.findAll();
    model.addAttribute("medicos", medicos);
    // Retorna a página do formulário de alunos
    List<Cliente> clientes = clienteService.findAll();
    model.addAttribute("clientes", clientes);
    return "consultas/formConsul";

  }

  @GetMapping("/editar/{id}")
  public String editar(@PathVariable Integer id, Model model) {
      Consulta consulta = consultaService.findById(id);
      model.addAttribute("consulta", consulta);
      List<Medico> medicos = medicoService.findAll();
      model.addAttribute("medicos", medicos);
      List<Cliente> clientes = clienteService.findAll();
      model.addAttribute("clientes", clientes);

      return "consultas/formConsul";
  }
  
  //Método para excluir um aluno
  @GetMapping("/excluir/{id}")
  //excluir um aluno pelo id
  public String excluir(@PathVariable Integer id) {
    consultaService.deleteById(id);
      return "redirect:/consultas/listar";
  }


    
}
