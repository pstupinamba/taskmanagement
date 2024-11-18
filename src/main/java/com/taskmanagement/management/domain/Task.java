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
	
	@Column(name = "pessoa_alocada")
    private Long pessoaAlocada; 

    private LocalDateTime dataRegistro;
    private LocalDateTime dataPrazo;
    private Long departamentoId;
    private Long duracao;

    @Column(columnDefinition = "bit(1) NOT NULL DEFAULT FALSE")
    private boolean finalizado;

    /************************************************************************
     * RELACIONAMENTOS ManyToOne
     * **********************************************************************/
    @ManyToOne
    @JoinColumn(name = "pessoa_alocada", referencedColumnName = "id")
    private Pessoa pessoa;
	
    
    /************************************************************************
     *
     * **********************************************************************/
    
	public Task() {
		
	}

    /************************************************************************
    *
    * **********************************************************************/
	public Task(Long id, String titulo, Long pessoaAlocada, LocalDateTime dataRegistro, LocalDateTime dataPrazo,
			Long departamentoId, Long duracao, boolean finalizado, Pessoa pessoa) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.pessoaAlocada = pessoaAlocada;
		this.dataRegistro = dataRegistro;
		this.dataPrazo = dataPrazo;
		this.departamentoId = departamentoId;
		this.duracao = duracao;
		this.finalizado = finalizado;
		this.pessoa = pessoa;
	}


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


	public Long getPessoaAlocada() {
		return pessoaAlocada;
	}


	public void setPessoaAlocada(Long pessoaAlocada) {
		this.pessoaAlocada = pessoaAlocada;
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


	public Long getDepartamentoId() {
		return departamentoId;
	}


	public void setDepartamentoId(Long departamentoId) {
		this.departamentoId = departamentoId;
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


	
	
}
