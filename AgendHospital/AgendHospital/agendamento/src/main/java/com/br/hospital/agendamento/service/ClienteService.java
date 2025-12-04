package com.br.hospital.agendamento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.hospital.agendamento.entity.Cliente;
import com.br.hospital.agendamento.repository.ClienteRepository;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

 public Cliente save(Cliente cliente){
          return clienteRepository.save(cliente);
      }
      
      //Metodo para listar todos os alunos//
      public List<Cliente> findAll(){
          return clienteRepository.findAll();
      } 

      public Cliente findById(Integer id){
        return clienteRepository.findById(id).orElse(null);
    }
  
public void deleteById (Integer id){
    clienteRepository.deleteById(id);
}

  }

