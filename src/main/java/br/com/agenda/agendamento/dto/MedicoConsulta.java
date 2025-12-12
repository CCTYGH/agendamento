package br.com.agenda.agendamento.dto;

public class MedicoConsulta {

    private Integer idConsulta;
    private  String nomeMedico;
    private String especialidade;

    public MedicoConsulta(Integer idConsulta, String nomeMedico, String especialidade) {
        this.idConsulta = idConsulta;
        this.nomeMedico = nomeMedico;
        this.especialidade = especialidade;
    }

  

    public Integer getIdConsulta() {
        return this.idConsulta;
    }

    public String getNomeMedico() {
        return this.nomeMedico;
    }
    public String getEspecialidade() {
        return this.especialidade;
    }
    
}
