package com.br.hospital.agendamento.dto;




public class MedicoConsulta {

    private Integer idConsulta;
    private  String nomeMedico;

    public MedicoConsulta(Integer idConsulta, String nomeMedico) {
        this.idConsulta = idConsulta;
        this.nomeMedico = nomeMedico;
    }

  

    public Integer getIdConsulta() {
        return this.idConsulta;
    }

    public String getNomeMedico() {
        return this.nomeMedico;
    }
    
}
