package com.br.hospital.agendamento.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.hospital.agendamento.dto.MedicoConsulta;
import com.br.hospital.agendamento.entity.Consulta;

import com.br.hospital.agendamento.repository.ConsultaRepository;


@Service
public class ConsultaService {

      //Injeção de independência//
      @Autowired
      private ConsultaRepository consultaRepository;
  
      //Metodo para salvar um aluno//
      public Consulta save(Consulta consulta){
          return consultaRepository.save(consulta);
      }
      
      //Metodo para listar todos os alunos//
      public List<Consulta> findAll(){
          return consultaRepository.findAll();
      } 

      public Consulta findById(Integer id){
        return consultaRepository.findById(id).orElse(null);
    }
  
public void deleteById (Integer id){
    consultaRepository.deleteById(id);
}

public List<MedicoConsulta> medicoeconsultas(){
return consultaRepository.medicoeconsultas();

}

  }

