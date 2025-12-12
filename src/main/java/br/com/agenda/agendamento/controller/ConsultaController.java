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

import br.com.agenda.agendamento.dto.MedicoConsulta;
import br.com.agenda.agendamento.entity.Cliente;
import br.com.agenda.agendamento.entity.Consulta;
import br.com.agenda.agendamento.entity.Medico;
import br.com.agenda.agendamento.service.ClienteService;
import br.com.agenda.agendamento.service.ConsultaService;
import br.com.agenda.agendamento.service.MedicoService;




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

    consultaService.save(consulta);

    return "redirect:/consultas/listar";
  }

  @GetMapping("/listar")
  public String listar(Model model) {

    List<Consulta> consultas = consultaService.findAll();
    model.addAttribute("consultas", consultas);

    return "consultas/listaConsul";
  }


  @GetMapping("/criar")
  public String criarForm(Model model) {

    model.addAttribute("consulta", new Consulta());
    List<Medico> medicos = medicoService.findAll();
    model.addAttribute("medicos", medicos);

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
  

  @GetMapping("/excluir/{id}")

  public String excluir(@PathVariable Integer id) {
    consultaService.deleteById(id);
      return "redirect:/consultas/listar";
  }

  @GetMapping("/listar-med-consu")
  public String medicoeconsultas(Model model){
    List<MedicoConsulta> consultas = consultaService.medicoeconsultas();
    model.addAttribute("consultas", consultas);
    return "consultas/MedConsul";
  }

  
}
