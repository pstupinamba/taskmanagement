package com.taskmanagement.management.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.taskmanagement.management.domain.Pessoa;
import com.taskmanagement.management.domain.Tarefa;
import com.taskmanagement.management.repository.PessoaRepository;
import com.taskmanagement.management.repository.TarefaRepository;

@Service
public class TarefaService {
	
	@Autowired
	private TarefaRepository tarefaRepository;
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Transactional(readOnly = true)
	public List<Tarefa> findAll(){
		return tarefaRepository.findAll();

	}
	
	@Transactional
    public Tarefa alocarPessoaNaTarefa(Long tarefaId, Long pessoaId) {
        Tarefa tarefa = tarefaRepository.findById(tarefaId).orElseThrow(() -> new RuntimeException("Tarefa não encontrada"));
        Pessoa pessoa = pessoaRepository.findById(pessoaId).orElseThrow(() -> new RuntimeException("Pessoa não encontrada"));

        if (!tarefa.getDepartamento().equals(pessoa.getDepartamento())) {
            throw new RuntimeException("A pessoa não pertence ao mesmo departamento da tarefa");
        }

        tarefa.setPessoaAlocada(pessoa);
        return tarefaRepository.save(tarefa);
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
	
    @Transactional
    public Tarefa salvar(Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }


}
