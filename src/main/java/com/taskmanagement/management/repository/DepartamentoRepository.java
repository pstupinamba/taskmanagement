package com.taskmanagement.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taskmanagement.management.domain.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long>{

}
