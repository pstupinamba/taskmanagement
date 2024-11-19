package com.taskmanagement.management.repository;

import java.util.List;
import java.util.Map;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.taskmanagement.management.domain.Pessoa;


public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

	
    @Query(value = "SELECT p.id AS pessoaId, p.nome AS pessoaNome, d.nome AS departamentoNome, " +
            " SUM(CASE " +
            " WHEN t.finalizado = TRUE THEN TIMESTAMPDIFF(HOUR, t.dataRegistro, t.dataPrazo) " +
            " ELSE TIMESTAMPDIFF(HOUR, t.dataRegistro, CURRENT_TIMESTAMP) " +
            " END) AS tarefaTotalHoras " +
            " FROM pessoa p " +
            " LEFT JOIN tarefa t ON t.pessoa_alocada = p.id " +
            " LEFT JOIN departamento d ON p.departamento_id = d.id " +
            " GROUP BY p.id, p.nome, d.nome", nativeQuery = true)
    List<Map<String, Object>> listTotalHoraTarefa();
}
