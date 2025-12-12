package br.com.agenda.agendamento.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
private String primeiroNome;

@Column(nullable = false, length = 40)
private String sobreNome;

@Column (nullable = false, length = 100)
private String endereco;

@Column (nullable = false, length = 100)
private String cpf;

@Column (nullable = false, length = 100)
private String bairro;

@Column (nullable = false, length = 100)
private Integer numero;

@Column (nullable = false, length = 100)
private String cep;

@Column (nullable = false, length = 100)
private String estadoCidade;



@Column (nullable = false, length = 20)
private String telefone;





@OneToMany(mappedBy = "cliente", cascade = CascadeType.REMOVE, orphanRemoval = true)
private List<Consulta> consultas;


}
