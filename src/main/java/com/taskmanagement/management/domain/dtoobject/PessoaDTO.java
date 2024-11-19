package com.taskmanagement.management.domain.dtoobject;

import java.util.List;

import com.taskmanagement.management.domain.Departamento;
import com.taskmanagement.management.domain.Tarefa;

public class PessoaDTO {
	
	private Long id;
	private String nome;
	private Departamento departamento;
	private List<Tarefa> tarefas;
	private Long tarefaTotalHoras;
	
 
	public PessoaDTO() {
		
	}


	public PessoaDTO(Long id, String nome, Departamento departamento, List<Tarefa> tarefas, Long tarefaTotalHoras) {
		super();
		this.id = id;
		this.nome = nome;
		this.departamento = departamento;
		this.tarefas = tarefas;
		this.tarefaTotalHoras = tarefaTotalHoras;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Departamento getDepartamento() {
		return departamento;
	}


	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}


	public Long getTarefaTotalHoras() {
		return tarefaTotalHoras;
	}


	public void setTarefaTotalHoras(Long tarefaTotalHoras) {
		this.tarefaTotalHoras = tarefaTotalHoras;
	}


	public List<Tarefa> getTarefas() {
		return tarefas;
	}


	public void setTarefas(List<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}


	


	
	

}
