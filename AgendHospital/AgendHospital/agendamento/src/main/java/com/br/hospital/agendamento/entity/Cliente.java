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

public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
private Integer idCliente;


@Column(nullable = false, length = 40)
private String nomeCliente;

@Column (nullable = false, length = 100)
private String endereco;

@Column (nullable = false, length = 100)
private String cpf;

@Column (nullable = false, length = 100)
private String bairro;

@Column (nullable = false, length = 100)
private Integer numero;

@Column (nullable = false, length = 100)
private Integer cep;

@Column (nullable = false, length = 100)
private String estadoCidade;


@Column (nullable = false, length = 100)
private String complemento;

@Column (nullable = false, length = 20)
private String telefone;



}
