package com.taskmanagement.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taskmanagement.management.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
