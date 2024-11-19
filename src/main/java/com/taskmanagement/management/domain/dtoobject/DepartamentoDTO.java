package com.taskmanagement.management.domain.dtoobject;

public class DepartamentoDTO {

    private Long departamentoId;
    private String nomeDepartamento;
    private Long quantidadePessoas;
    private Long quantidadeTarefas;
    
    public DepartamentoDTO(){
    	
    }

	public DepartamentoDTO(Long departamentoId, String nomeDepartamento, Long quantidadePessoas,
			Long quantidadeTarefas) {

		this.departamentoId = departamentoId;
		this.nomeDepartamento = nomeDepartamento;
		this.quantidadePessoas = quantidadePessoas;
		this.quantidadeTarefas = quantidadeTarefas;
	}

	public Long getDepartamentoId() {
		return departamentoId;
	}

	public void setDepartamentoId(Long departamentoId) {
		this.departamentoId = departamentoId;
	}

	public String getNomeDepartamento() {
		return nomeDepartamento;
	}

	public void setNomeDepartamento(String nomeDepartamento) {
		this.nomeDepartamento = nomeDepartamento;
	}

	public Long getQuantidadePessoas() {
		return quantidadePessoas;
	}

	public void setQuantidadePessoas(Long quantidadePessoas) {
		this.quantidadePessoas = quantidadePessoas;
	}

	public Long getQuantidadeTarefas() {
		return quantidadeTarefas;
	}

	public void setQuantidadeTarefas(Long quantidadeTarefas) {
		this.quantidadeTarefas = quantidadeTarefas;
	}

   
}
