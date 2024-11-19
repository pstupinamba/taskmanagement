package com.taskmanagement.management.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.taskmanagement.management.domain.Pessoa;
import com.taskmanagement.management.domain.dtoobject.PessoaDTO;
import com.taskmanagement.management.services.PessoaService;

@RestController
@RequestMapping(value = "/pessoa")
public class PessoaController {
	
	@Autowired
	private PessoaService pessoaService;
	
	@GetMapping("/rsfindall")
	public List<Pessoa> findAll(){
		return pessoaService.findAll();
	}
    
    @GetMapping("/rstotalhorastarefa")
    public List<PessoaDTO> rstotalhorastarefa() {
        return pessoaService.listTotalHoraTarefa();
    }
	 
}
