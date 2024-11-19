package com.taskmanagement.management.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.taskmanagement.management.domain.Tarefa;
import com.taskmanagement.management.repository.TarefaRepository;

@Service
public class TarefaService {
	
	@Autowired
	private TarefaRepository tarefaRepository;
	
	@Transactional(readOnly = true)
	public List<Tarefa> findAll(){
		return tarefaRepository.findAll();

	}
	
	@Transactional(readOnly = true)
	public List<Tarefa> findTopTresPessoaNAlocada() {
	    System.out.println("Iniciando busca de tarefas...");

	    List<Tarefa> tarefas = tarefaRepository.findTopTresPessoaNAlocada();

	    if (tarefas == null || tarefas.isEmpty()) {
	        System.out.println("Nenhuma tarefa encontrada.");
	    } else {
	        System.out.println("Tarefas encontradas: " + tarefas);
	    }

	    return tarefas;
	}


}
