package com.taskmanagement.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskmanagement.management.domain.Tarefa;
import com.taskmanagement.management.services.TarefaService;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

	@Autowired
    private  TarefaService tarefaService;
    
    @GetMapping("/rssempessoaalocada")
    public ResponseEntity<List<Tarefa>> findTopTresPessoaNAlocada() {
        List<Tarefa> tarefas = tarefaService.findTopTresPessoaNAlocada();
        return ResponseEntity.ok(tarefas);
    }
}

