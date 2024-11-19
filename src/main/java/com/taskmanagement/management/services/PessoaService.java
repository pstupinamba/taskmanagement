package com.taskmanagement.management.services;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.taskmanagement.management.domain.Pessoa;
import com.taskmanagement.management.domain.Tarefa;
import com.taskmanagement.management.domain.dtoobject.PessoaDTO;
import com.taskmanagement.management.repository.PessoaRepository;
import com.taskmanagement.management.repository.TarefaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private TarefaRepository tarefaRepository;
		
	@Transactional(readOnly = true)
	public List<Pessoa> findAll(){
		return pessoaRepository.findAll();
	}
	
	@Transactional(readOnly = true)
	public List<PessoaDTO> listTotalHoraTarefa() {

	    List<Pessoa> pessoas = pessoaRepository.findAll();  

	    return pessoas.stream()
	            .map(pessoa -> {

	                List<Tarefa> tarefas = tarefaRepository.findByPessoaAlocada(pessoa); 

	                long totalHoras = tarefas.stream()
	                        .mapToLong(this::calcularHorasTarefa)  
	                        .sum();
                
	                return new PessoaDTO(pessoa.getId(), pessoa.getNome(), pessoa.getDepartamento(), tarefas, totalHoras);
	            })
	            .collect(Collectors.toList());
	}


	private long calcularHorasTarefa(Tarefa tarefa) {
	    LocalDateTime dataRegistro = tarefa.getDataRegistro();
	    LocalDateTime dataPrazo = tarefa.getDataPrazo();

	    if (dataRegistro != null) {
	        if (tarefa.isFinalizado()) {
	            return java.time.Duration.between(dataRegistro, dataPrazo).toHours();
	        } else {
	            return java.time.Duration.between(dataRegistro, LocalDateTime.now()).toHours();
	        }
	    }

	    return 0;
	}

		
}
