package com.taskmanagement.management.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "departamento")
public class Departamento {
	
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

    /************************************************************************
     * OUTROS
     * **********************************************************************/
    
	public Departamento() {
		
	}

    public Departamento(Long id, String nome) {
		super();
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


	


	
	
}
