package com.br.hospital.agendamento.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Medico {
    
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer idMedico;


@Column(nullable = false, length = 40)
private String nomeMedico;

@Column (nullable = false, length = 10)
private Integer crm;

@Column(nullable = false, length = 30)
private String especialidade;

}
