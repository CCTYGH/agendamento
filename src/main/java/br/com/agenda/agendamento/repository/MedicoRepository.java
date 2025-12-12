package br.com.agenda.agendamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.agenda.agendamento.entity.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Integer> {


}
