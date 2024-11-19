package com.taskmanagement.management.services;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.taskmanagement.management.domain.Departamento;
import com.taskmanagement.management.domain.Pessoa;
import com.taskmanagement.management.domain.dtoobject.PessoaDTO;
import com.taskmanagement.management.repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
		
	@Transactional(readOnly = true)
	public List<Pessoa> findAll(){
		List<Pessoa> result = pessoaRepository.findAll();
		return result;
	}
	
	@Transactional(readOnly = true)
	public List<PessoaDTO> listTotalHoraTarefa() {
        List<Map<String, Object>> results = pessoaRepository.listTotalHoraTarefa();

        return results.stream()
            .map(result -> {
                Long pessoaId = (Long) result.get("pessoaId");
                String pessoaNome = (String) result.get("pessoaNome");
                Long departamentoId = (Long) result.get("departamentoId");
                String departamentoNome = (String) result.get("departamentoNome");
                Long tarefaTotalHoras = (Long) result.get("tarefaTotalHoras");

                Departamento departamento = new Departamento(departamentoId, departamentoNome);

                return new PessoaDTO(pessoaId, pessoaNome, departamento, null, tarefaTotalHoras);
            })
            .collect(Collectors.toList());
    }
	
    


	
}
