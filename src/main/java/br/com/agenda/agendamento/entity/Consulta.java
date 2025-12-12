package br.com.agenda.agendamento.entity;

import java.time.LocalDateTime;



import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idConsulta;


    @Column (nullable = false, length = 100000000)
    private String observacoes;


    
    @DateTimeFormat(pattern = "dd-MM-yyyy HH:mm")
    @Column (nullable = false)
    private LocalDateTime datahoraConsulta;



    @ManyToOne
    @JoinColumn (name = "idMedico_fk")
    private Medico medico;

    @ManyToOne
    @JoinColumn (name = "idCliente_fk")
    private Cliente cliente;

}


