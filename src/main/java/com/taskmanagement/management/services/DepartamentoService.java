package com.taskmanagement.management.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.taskmanagement.management.domain.Departamento;
import com.taskmanagement.management.repository.DepartamentoRepository;

@Service
public class DepartamentoService {
	
	private DepartamentoRepository departamentoRepository;
	
	@Transactional(readOnly = true)
	public List<Departamento> findAll(){
		return departamentoRepository.findAll();

	}

}
