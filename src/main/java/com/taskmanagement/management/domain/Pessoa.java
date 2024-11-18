package com.taskmanagement.management.domain;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "pessoa")
public class Pessoa {
	
	/************************************************************************
	 * *CAMPOS UNICOS
	 * **********************************************************************/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	/************************************************************************
	 * *CAMPOS PARTICULARES
	 * **********************************************************************/
	@Column(name = "nome")
	private String nome;
	
	/************************************************************************
	 * *CAMPOS ESTRANGEIROS
	 * **********************************************************************/
	private Long departamento_id;
	private Long task_list_id;
	
	
	public Pessoa() {
		
	}


	public Pessoa(Long id, String nome, Long departamento_id, Long task_list_id) {
		super();
		this.id = id;
		this.nome = nome;
		this.departamento_id = departamento_id;
		this.task_list_id = task_list_id;
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


	public Long getDepartamento_id() {
		return departamento_id;
	}


	public void setDepartamento_id(Long departamento_id) {
		this.departamento_id = departamento_id;
	}


	public Long getTask_list_id() {
		return task_list_id;
	}


	public void setTask_list_id(Long task_list_id) {
		this.task_list_id = task_list_id;
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
		Pessoa other = (Pessoa) obj;
		return Objects.equals(id, other.id);
	}		
	
}
