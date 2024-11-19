package com.taskmanagement.management.services;

import com.taskmanagement.management.domain.Pessoa;
import com.taskmanagement.management.domain.Tarefa;
import com.taskmanagement.management.repository.TarefaRepository;
import com.taskmanagement.management.repository.PessoaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import static org.mockito.Mockito.*;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TarefaServiceTest {

    @Mock
    private TarefaRepository tarefaRepository; // Mock do repositório de Tarefa

    @Mock
    private PessoaRepository pessoaRepository; // Mock do repositório de Pessoa

    @InjectMocks
    private TarefaService tarefaService; // Serviço a ser testado

    private Tarefa tarefa;

    @BeforeEach
    public void setUp() {
        // Inicialize os objetos necessários para o teste
        tarefa = new Tarefa(1L, "Tarefa 1", null, null, null, null, false, null, null);
    }

    @Test
    public void testAlocarPessoaNaTarefa_Sucesso() {

        when(tarefaRepository.findById(1L)).thenReturn(Optional.of(tarefa));
        when(pessoaRepository.findById(1L)).thenReturn(Optional.of(new Pessoa()));

        Tarefa tarefaAtualizada = tarefaService.alocarPessoaNaTarefa(1L, 1L);
        
        assertNotNull(tarefaAtualizada); 
        assertEquals(1L, tarefaAtualizada.getId());
        verify(tarefaRepository).save(tarefa); 
    }

    @Test
    public void testAlocarPessoaNaTarefa_TarefaNaoEncontrada() {
        when(tarefaRepository.findById(1L)).thenReturn(Optional.empty());
  
        assertThrows(IllegalArgumentException.class, () -> {
            tarefaService.alocarPessoaNaTarefa(1L, 1L);
        });
    }
}
