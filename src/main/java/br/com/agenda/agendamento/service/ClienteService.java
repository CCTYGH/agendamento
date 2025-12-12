package br.com.agenda.agendamento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.agenda.agendamento.entity.Cliente;
import br.com.agenda.agendamento.repository.ClienteRepository;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

 public Cliente save(Cliente cliente){
          return clienteRepository.save(cliente);
      }
      

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

