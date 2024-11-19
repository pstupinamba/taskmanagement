package com.taskmanagement.management.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "tarefa")
public class Tarefa {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
    private String titulo;
    private String descricao;
    private LocalDateTime dataRegistro;
    private LocalDateTime dataPrazo;
    private Long duracao;  
    
    @Column(name = "finalizado", columnDefinition = "BIT DEFAULT FALSE")
    private boolean finalizado;
  
    
    @ManyToOne
    @JoinColumn(name = "departamento_id")
    private Departamento departamento;

    @ManyToOne
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoaAlocada;
    
	   
    
	public Tarefa() {
		
	}

	public Tarefa(Long id, String titulo, String descricao, LocalDateTime dataRegistro, LocalDateTime dataPrazo,
			Long duracao, boolean finalizado, Departamento departamento, Pessoa pessoaAlocada) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.dataRegistro = dataRegistro;
		this.dataPrazo = dataPrazo;
		this.duracao = duracao;
		this.finalizado = finalizado;
		this.departamento = departamento;
		this.pessoaAlocada = pessoaAlocada;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getDataRegistro() {
		return dataRegistro;
	}

	public void setDataRegistro(LocalDateTime dataRegistro) {
		this.dataRegistro = dataRegistro;
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

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Pessoa getPessoaAlocada() {
		return pessoaAlocada;
	}

	public void setPessoaAlocada(Pessoa pessoaAlocada) {
		this.pessoaAlocada = pessoaAlocada;
	}

	public LocalDateTime getDataPrazo() {
		return dataPrazo;
	}

	public void setDataPrazo(LocalDateTime dataPrazo) {
		this.dataPrazo = dataPrazo;
	}

	
}
