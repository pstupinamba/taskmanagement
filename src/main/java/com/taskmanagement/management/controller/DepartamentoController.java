package com.taskmanagement.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskmanagement.management.domain.Tarefa;
import com.taskmanagement.management.domain.dtoobject.DepartamentoDTO;
import com.taskmanagement.management.services.DepartamentoService;

@RestController
@RequestMapping("/departamento")
public class DepartamentoController {

    @Autowired
    private DepartamentoService departamentoService;

	@GetMapping("/rsdepqntpessoatarefa")
    public ResponseEntity<List<DepartamentoDTO>> listPessoaDepartamentoTarefa() {
        List<DepartamentoDTO> departamentos = departamentoService.listPessoaDepartamentoTarefa();
        return ResponseEntity.ok(departamentos);
    }
}
