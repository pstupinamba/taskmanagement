package com.taskmanagement.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taskmanagement.management.domain.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long>{

}
