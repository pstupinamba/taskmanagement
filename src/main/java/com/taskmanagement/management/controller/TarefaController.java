package com.taskmanagement.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.taskmanagement.management.domain.Tarefa;
import com.taskmanagement.management.services.TarefaService;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

	@Autowired
    private  TarefaService tarefaService;
	
	
	@GetMapping("/rsfindall")
	public List<Tarefa> findAll(){
		return tarefaService.findAll();
	}
    
    @GetMapping("/rssempessoaalocada")
    public ResponseEntity<List<Tarefa>> findTopTresPessoaNAlocada() {
        List<Tarefa> tarefas = tarefaService.findTopTresPessoaNAlocada();
        return ResponseEntity.ok(tarefas);
    }
    
    @PutMapping("/rsalocarpessoadep/{id}")
    public ResponseEntity<Tarefa> rsalocarpessoadep(@PathVariable Long id, @RequestBody Long pessoaId) {
        Tarefa tarefaAtualizada = tarefaService.alocarPessoaNaTarefa(id, pessoaId);
        return ResponseEntity.ok(tarefaAtualizada);
    }
    
    @PostMapping("/rsinsert")
    public ResponseEntity<Tarefa> rsinsert(@RequestBody Tarefa tarefa) {
        Tarefa novaTarefa = tarefaService.salvar(tarefa);
        return ResponseEntity.ok(novaTarefa);
    }
    
    @PutMapping("/rsfinalizar/{id}")
    public ResponseEntity<Tarefa> rsfinalizar(@PathVariable Long id) {
        Tarefa tarefaFinalizada = tarefaService.finalizarTarefa(id);
        return ResponseEntity.ok(tarefaFinalizada);
    }
}

