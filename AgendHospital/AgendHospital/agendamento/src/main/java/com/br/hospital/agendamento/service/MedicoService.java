package com.br.hospital.agendamento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======

>>>>>>> a1d56653b142466eee7ecfa5be5412cc490c0db6
>>>>>>> b1efcfca4c9b69ee13e6b85f5f213901a221c27e
import com.br.hospital.agendamento.entity.Medico;
import com.br.hospital.agendamento.repository.MedicoRepository;

@Service
public class MedicoService {

      //Injeção de independência//
      @Autowired
      private MedicoRepository medicoRepository;
  
      //Metodo para salvar um aluno//
      public Medico save(Medico medico){
<<<<<<< HEAD
         return medicoRepository.save(medico);
=======
          return medicoRepository.save(medico);
>>>>>>> b1efcfca4c9b69ee13e6b85f5f213901a221c27e
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

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======

>>>>>>> a1d56653b142466eee7ecfa5be5412cc490c0db6
>>>>>>> b1efcfca4c9b69ee13e6b85f5f213901a221c27e

  }

