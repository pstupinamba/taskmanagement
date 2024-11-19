package com.taskmanagement.management.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.taskmanagement.management.domain.Pessoa;
import com.taskmanagement.management.domain.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long>{
    
    List<Tarefa> findByPessoaAlocada(Pessoa pessoa);
    
    //@Query("SELECT t FROM Tarefa t WHERE t.pessoaAlocada = :pessoa AND t.finalizado = true")
    //List<Tarefa> findFinalizadasByPessoa(@Param("pessoa") Pessoa pessoa);    
    
    @Query(value = " SELECT * FROM tarefa WHERE pessoa_id IS NULL ORDER BY data_prazo ASC LIMIT 3 ", nativeQuery = true)
    List<Tarefa> findTopTresPessoaNAlocada();


}
