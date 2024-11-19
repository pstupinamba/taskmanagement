package com.taskmanagement.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskmanagement.management.domain.Pessoa;
import com.taskmanagement.management.domain.dtoobject.PessoaDTO;
import com.taskmanagement.management.services.PessoaService;

@RestController
@RequestMapping(value = "/pessoa")
public class PessoaController {
	
	@Autowired
	private PessoaService pessoaService;
	
	/*@GetMapping
	public List<Pessoa> findAll(){
		List<Pessoa> result = pessoaService.findAll();
		return result;
	}*/
	
	@GetMapping
	public List<PessoaDTO> findAll(){
		List<PessoaDTO> result = pessoaService.findAll();
		return result;
	}
	 
}
