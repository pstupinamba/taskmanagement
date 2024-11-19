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

    @Column(name = "finalizado", columnDefinition = "BOOLEAN NOT NULL DEFAULT FALSE")
    private boolean finalizado;
    

    /************************************************************************
     * RELACIONAMENTOS ManyToOne
     * **********************************************************************/
    
    private Long pessoaAlocada;
    private Long departamentoId;
    
    /*
    @ManyToOne
    @JoinColumn(name = "pessoa_alocada", referencedColumnName = "id")
    private Pessoa pessoa;
    
    @ManyToOne
    @JoinColumn(name = "departamento_id", referencedColumnName = "id")
    private Departamento departamento;
	*/
    
    /************************************************************************
     * 
     * **********************************************************************/
    
	public Task() {
		
	}
	

	public Task(Long id, String titulo, LocalDateTime dataRegistro, LocalDateTime dataPrazo, Long duracao,
			boolean finalizado, Long pessoaAlocada, Long departamentoId) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.dataRegistro = dataRegistro;
		this.dataPrazo = dataPrazo;
		this.duracao = duracao;
		this.finalizado = finalizado;
		this.pessoaAlocada = pessoaAlocada;
		this.departamentoId = departamentoId;
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


	public Long getPessoaAlocada() {
		return pessoaAlocada;
	}


	public void setPessoaAlocada(Long pessoaAlocada) {
		this.pessoaAlocada = pessoaAlocada;
	}


	public Long getDepartamentoId() {
		return departamentoId;
	}


	public void setDepartamentoId(Long departamentoId) {
		this.departamentoId = departamentoId;
	}


	
}
