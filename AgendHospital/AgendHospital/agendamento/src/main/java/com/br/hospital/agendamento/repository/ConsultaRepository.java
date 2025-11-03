package com.br.hospital.agendamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.hospital.agendamento.entity.Consulta;

public interface ConsultaRepository extends JpaRepository <Consulta, Integer> {

    
}
