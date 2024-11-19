package com.taskmanagement.management.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.taskmanagement.management.domain.Pessoa;


public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

	@Query(value = "SELECT p.id AS pessoaId, "
			+ "       p.nome AS pessoaNome, "
			+ "       d.id AS departamentoId, "
			+ "       d.nome AS departamentoNome, "
			+ "       t.id AS tarefaId, "
			+ "       t.data_registro, "
			+ "       t.data_prazo, "
			+ "       t.finalizado "
			+ " FROM pessoa p "
			+ " LEFT JOIN tarefa t ON t.pessoa_id = p.id "
			+ " LEFT JOIN departamento d ON p.departamento_id = d.id ", nativeQuery = true)
    List<Pessoa> listPessoaDepartamentoTarefa(); 	

}
