package com.taskmanagement.management.domain;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	 * *OUTROS
	 * **********************************************************************/
	
    /************************************************************************
     * RELACIONAMENTOS ManyToOne
     * **********************************************************************/
	
    @ManyToOne
    @JoinColumn(name = "departamento_id", referencedColumnName = "id")
    private Departamento departamento;
    
    @ManyToOne
    @JoinColumn(name = "task_id", referencedColumnName = "id")
    private Task task;
	
	public Pessoa() {
		
	}



	public Pessoa(Long id, String nome, Departamento departamento, Task task) {
		super();
		this.id = id;
		this.nome = nome;
		this.departamento = departamento;
		this.task = task;
	}


	/************************************************************************
	* GETTERS AND SETTERS
	***********************************************************************/


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



	public Task getTask() {
		return task;
	}



	public void setTask(Task task) {
		this.task = task;
	}


	/************************************************************************
	* HASH AND EQUALS
	***********************************************************************/
	
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
