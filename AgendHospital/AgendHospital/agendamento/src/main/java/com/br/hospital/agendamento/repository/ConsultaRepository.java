package com.br.hospital.agendamento.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.br.hospital.agendamento.dto.MedicoConsulta;
import com.br.hospital.agendamento.entity.Consulta;

public interface ConsultaRepository extends JpaRepository <Consulta, Integer> {

    @Query("SELECT new com.br.hospital.agendamento.dto.MedicoConsulta(c.idConsulta, c.medico.nomeMedico) FROM Consulta c")
    List<MedicoConsulta> medicoeconsultas();

    
}
