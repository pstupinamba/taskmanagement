package com.taskmanagement.management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.taskmanagement.management.domain.Departamento;
import com.taskmanagement.management.domain.Pessoa;
import com.taskmanagement.management.domain.dtoobject.DepartamentoDTO;
import com.taskmanagement.management.projections.DepartamentoProjection;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long>{

	
	@Query(value = "SELECT d.id AS departamentoId, " +
            "       d.nome AS departamentoNome, " +
            "       COUNT(DISTINCT p.id) AS totalPessoas, " +
            "       COUNT(DISTINCT t.id) AS totalTarefas " +
            " FROM departamento d " +
            " LEFT JOIN pessoa p ON p.departamento_id = d.id " +
            " LEFT JOIN tarefa t ON t.departamento_id = d.id " +
            " GROUP BY d.id, d.nome",  nativeQuery = true)
	List<DepartamentoProjection> listPessoaDepartamentoTarefa();
	
}
