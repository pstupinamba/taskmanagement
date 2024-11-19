package com.taskmanagement.management.domain.dtoobject;


import com.taskmanagement.management.domain.Pessoa;

public class PessoaDTO {
	
	private Long id;
	private String nome;
	private Long departamentoId;
	private Long tarefaListId;
	
 
	public PessoaDTO() {
		
	}

	public PessoaDTO(Pessoa entity) {
		id = entity.getId();
		nome = entity.getNome();
		departamentoId = entity.getDepartamentoId();
		tarefaListId = entity.getTarefaId();
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

	public Long getDepartamentoId() {
		return departamentoId;
	}

	public void setDepartamentoId(Long departamentoId) {
		this.departamentoId = departamentoId;
	}

	public Long getTarefaListId() {
		return tarefaListId;
	}

	public void setTarefaListId(Long tarefaListId) {
		this.tarefaListId = tarefaListId;
	}



	
	

}
