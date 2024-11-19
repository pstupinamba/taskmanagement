package com.taskmanagement.management.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.taskmanagement.management.domain.Departamento;
import com.taskmanagement.management.domain.dtoobject.DepartamentoDTO;
import com.taskmanagement.management.repository.DepartamentoRepository;

@Service
public class DepartamentoService {
	
	@Autowired
	private DepartamentoRepository departamentoRepository;
	
	@Transactional(readOnly = true)
	public List<Departamento> findAll(){
		return departamentoRepository.findAll();

	}
	
	@Transactional(readOnly = true)
	public List<DepartamentoDTO> listPessoaDepartamentoTarefa() {
	    return departamentoRepository.listPessoaDepartamentoTarefa()
	        .stream()
	        .map(projection -> new DepartamentoDTO(
	            projection.getDepartamentoId(),
	            projection.getDepartamentoNome(),
	            projection.getTotalPessoas(),
	            projection.getTotalTarefas()
	        ))
	        .collect(Collectors.toList());
	}


}
