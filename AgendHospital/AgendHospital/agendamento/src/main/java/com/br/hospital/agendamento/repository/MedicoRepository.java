package com.br.hospital.agendamento.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.br.hospital.agendamento.dto.MedicoConsulta;
import com.br.hospital.agendamento.entity.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Integer> {

    @Query("SELECT new com.br.hospital.agendamento.dto(a.idConsulta, a.nomeMedico) FROM Medico a")
    List<MedicoConsulta> medicoeconsultas();

    
}
