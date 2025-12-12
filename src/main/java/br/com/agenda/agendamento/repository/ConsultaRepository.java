package br.com.agenda.agendamento.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.agenda.agendamento.dto.MedicoConsulta;
import br.com.agenda.agendamento.entity.Consulta;

public interface ConsultaRepository extends JpaRepository<Consulta, Integer> {

    @Query("""
        SELECT new br.com.agenda.agendamento.dto.MedicoConsulta(
            c.idConsulta,
            c.medico.nomeMedico,
            c.medico.especialidade
        )
        FROM Consulta c
    """)
    List<MedicoConsulta> medicoeconsultas();

}
