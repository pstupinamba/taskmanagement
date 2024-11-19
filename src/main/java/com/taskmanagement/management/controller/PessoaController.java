package com.taskmanagement.management.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
   @PostMapping("/rsinsert")
    public ResponseEntity<Pessoa> rsinsert(@RequestBody Pessoa pessoa) {
        Pessoa novaPessoa = pessoaService.salvar(pessoa);
        return ResponseEntity.ok(novaPessoa);
    }
    
   
   @PutMapping("/rsalterar/{id}")
   public ResponseEntity<Pessoa> rsalterar(@PathVariable Long id, @RequestBody Pessoa pessoaAtualizada) {
       try {
           Pessoa pessoa = pessoaService.atualizar(id, pessoaAtualizada);
           return ResponseEntity.ok(pessoa);
       } catch (RuntimeException e) {
           return ResponseEntity.notFound().build();
       }
   }
   
   @DeleteMapping("/rsremover/{id}")
   public ResponseEntity<Void> rsremover(@PathVariable Long id) {
       try {
           pessoaService.deletar(id);
           return ResponseEntity.noContent().build();
       } catch (RuntimeException e) {
           return ResponseEntity.notFound().build();
       }
   }
   

   
   
    @GetMapping("/rstotalhorastarefa")
    public List<PessoaDTO> rstotalhorastarefa() {
        return pessoaService.listTotalHoraTarefa();
    }
	 
}
