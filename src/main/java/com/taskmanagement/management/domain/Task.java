package com.taskmanagement.management.domain;

import java.time.LocalDateTime;
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
@Table(name= "task")
public class Task {
	
	/************************************************************************
	 * *CAMPOS UNICOS
	 * **********************************************************************/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	/************************************************************************
	 * *CAMPOS PARTICULARES
	 * **********************************************************************/
	@Column(name = "titulo")
	private String titulo;
	
	/************************************************************************
	 * *OUTROS
	 * **********************************************************************/	

    private LocalDateTime dataRegistro;
    private LocalDateTime dataPrazo;   
    private Long duracao;
    
    
    /************************************************************************
	 * *BOOLEANS
	 * **********************************************************************/

    @Column(columnDefinition = "bit(1) NOT NULL DEFAULT FALSE")
    private boolean finalizado;
    

    /************************************************************************
     * RELACIONAMENTOS ManyToOne
     * **********************************************************************/
    @ManyToOne
    @JoinColumn(name = "pessoa_alocada", referencedColumnName = "id")
    private Pessoa pessoa;
    
    @ManyToOne
    @JoinColumn(name = "departamento_id", referencedColumnName = "id")
    private Departamento departamento;
	
    
    /************************************************************************
     * 
     * **********************************************************************/
    
	public Task() {
		
	}
	
	
	public Task(Long id, String titulo, LocalDateTime dataRegistro, LocalDateTime dataPrazo, Long duracao,
			boolean finalizado, Pessoa pessoa, Departamento departamento) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.dataRegistro = dataRegistro;
		this.dataPrazo = dataPrazo;
		this.duracao = duracao;
		this.finalizado = finalizado;
		this.pessoa = pessoa;
		this.departamento = departamento;
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


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LocalDateTime getDataRegistro() {
		return dataRegistro;
	}


	public void setDataRegistro(LocalDateTime dataRegistro) {
		this.dataRegistro = dataRegistro;
	}


	public LocalDateTime getDataPrazo() {
		return dataPrazo;
	}


	public void setDataPrazo(LocalDateTime dataPrazo) {
		this.dataPrazo = dataPrazo;
	}


	public Long getDuracao() {
		return duracao;
	}


	public void setDuracao(Long duracao) {
		this.duracao = duracao;
	}


	public boolean isFinalizado() {
		return finalizado;
	}


	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}


	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	

	public Departamento getDepartamento() {
		return departamento;
	}


	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	
}
