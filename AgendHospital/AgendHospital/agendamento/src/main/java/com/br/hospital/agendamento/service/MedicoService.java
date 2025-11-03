package com.br.hospital.agendamento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.hospital.agendamento.entity.Medico;
import com.br.hospital.agendamento.repository.MedicoRepository;

@Service
public class MedicoService {

      //Injeção de independência//
      @Autowired
      private MedicoRepository medicoRepository;
  
      //Metodo para salvar um aluno//
      public Medico save(Medico medico){
          return medicoRepository.save(medico);
      }
      
      //Metodo para listar todos os alunos//
      public List<Medico> findAll(){
          return medicoRepository.findAll();
      } 

      public Medico findById(Integer id){
        return medicoRepository.findById(id).orElse(null);
    }
  
public void deleteById (Integer id){
    medicoRepository.deleteById(id);
}

  }

