package com.br.hospital.agendamento.repository;


import org.springframework.data.jpa.repository.JpaRepository;



import com.br.hospital.agendamento.entity.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Integer> {

    
}
