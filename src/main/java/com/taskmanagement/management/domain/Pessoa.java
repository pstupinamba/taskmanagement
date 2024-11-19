package com.taskmanagement.management.domain;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
    
    @OneToMany(mappedBy = "pessoaAlocada")
    private List<Tarefa> tarefas;
	
	public Pessoa() {
		
	}

	public Pessoa(Long id, String nome, Departamento departamento, List<Tarefa> tarefas) {
		super();
		this.id = id;
		this.nome = nome;
		this.departamento = departamento;
		this.tarefas = tarefas;
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

	public List<Tarefa> getTarefas() {
		return tarefas;
	}

	public void setTarefas(List<Tarefa> tarefas) {
		this.tarefas = tarefas;
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
