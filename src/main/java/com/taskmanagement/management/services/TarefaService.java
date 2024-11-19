package com.taskmanagement.management.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.taskmanagement.management.domain.Tarefa;
import com.taskmanagement.management.repository.TarefaRepository;

@Service
public class TarefaService {
	
	private TarefaRepository tarefasRepository;
	
	@Transactional(readOnly = true)
	public List<Tarefa> findAll(){
		return tarefasRepository.findAll();

	}

}
