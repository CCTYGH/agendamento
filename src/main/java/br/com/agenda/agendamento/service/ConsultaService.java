package br.com.agenda.agendamento.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.agenda.agendamento.dto.MedicoConsulta;
import br.com.agenda.agendamento.entity.Consulta;
import br.com.agenda.agendamento.repository.ConsultaRepository;


@Service
public class ConsultaService {


      @Autowired
      private ConsultaRepository consultaRepository;
  
 
      public Consulta save(Consulta consulta){
          return consultaRepository.save(consulta);
      }
      

      public List<Consulta> findAll(){
          return consultaRepository.findAll();
      } 

      public Consulta findById(Integer id){
        return consultaRepository.findById(id).orElse(null);
    }
  
public void deleteById (Integer id){
    consultaRepository.deleteById(id);
}

public List<MedicoConsulta> medicoeconsultas(){
return consultaRepository.medicoeconsultas();

}

  }

