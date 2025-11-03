package com.br.hospital.agendamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.hospital.agendamento.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    
}