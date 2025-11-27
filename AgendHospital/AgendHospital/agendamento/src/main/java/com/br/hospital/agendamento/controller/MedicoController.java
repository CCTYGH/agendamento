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


import com.br.hospital.agendamento.entity.Medico;
import com.br.hospital.agendamento.service.MedicoService;




@Controller
@RequestMapping("/medicos")
public class MedicoController {


    @Autowired
    private MedicoService medicoService;


    @PostMapping("/salvar")
  public String salvar(@ModelAttribute Medico medico) {
    // Salvar Aluno
    medicoService.save(medico);
    // redireciona para lista alunos//
    return "redirect:/medicos/listar";
  }

  @GetMapping("/listar")
  public String listar(Model model) {
    // Listar todos os alunos
    List<Medico> medicos = medicoService.findAll();
    model.addAttribute("medicos", medicos);
    // retorna a pagia de lista de alunos
    return "medicos/listaMedicos";
  }

  // metodo para abrir o formulário de criação de alunos
  @GetMapping("/criar")
  public String criarForm(Model model) {
    // Adiciona um novo aluno ao modelo
    model.addAttribute("medico", new Medico());
    // Retorna a página do formulário de alunos
    return "medicos/formularioMedicos";

  }

  @GetMapping("/editar/{id}")
  public String editar(@PathVariable Integer id, Model model) {
      Medico medico = medicoService.findById(id);
      model.addAttribute("medico", medico);
      return "medicos/formularioMedicos";
  }
  
  //Método para excluir um aluno
  @GetMapping("/excluir/{id}")
  //excluir um aluno pelo id
  public String excluir(@PathVariable Integer id) {
    medicoService.deleteById(id);
      return "redirect:/medicos/listar";
  }


    
}
