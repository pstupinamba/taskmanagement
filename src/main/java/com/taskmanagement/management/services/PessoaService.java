package com.taskmanagement.management.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taskmanagement.management.domain.Pessoa;
import com.taskmanagement.management.domain.dtoobject.PessoaDTO;
import com.taskmanagement.management.repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	/*public List<Pessoa> findAll(){
		List<Pessoa> result = pessoaRepository.findAll();
		return result;
	}*/
	
	public List<PessoaDTO> findAll(){
		List<Pessoa> result = pessoaRepository.findAll();
		return result.stream().map(x -> new PessoaDTO(x)).collect(Collectors.toList());
		
	}
	
}
