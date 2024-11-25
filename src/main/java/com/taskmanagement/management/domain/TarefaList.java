package com.taskmanagement.management.domain;

import java.util.Objects;

public class TarefaList {

	/************************************************************************
	 * *CAMPOS PARTICULARES
	 * **********************************************************************/
	private Long id;
	private String nome;
	
	
	public TarefaList(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	
	/************************************************************************
	* GETTERS AND SETTERS
	* **********************************************************************/


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


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TarefaList other = (TarefaList) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
