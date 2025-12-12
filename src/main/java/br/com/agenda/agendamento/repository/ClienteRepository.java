package br.com.agenda.agendamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.agenda.agendamento.entity.Cliente;



public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    
}