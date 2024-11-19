package com.taskmanagement.management.controller;

import com.taskmanagement.management.services.TarefaService;
import com.taskmanagement.management.domain.Tarefa;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(TarefaController.class)
public class TarefaControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private TarefaService tarefaService;

    @InjectMocks
    private TarefaController tarefaController; 

    private Tarefa tarefa;

    @BeforeEach
    public void setUp() {
        tarefa = new Tarefa(1L, "Tarefa 1", null, null, null, null, false, null, null);
    }

    @Test
    public void testAlocarPessoaNaTarefa() throws Exception {

        when(tarefaService.alocarPessoaNaTarefa(anyLong(), anyLong())).thenReturn(tarefa);

        mockMvc.perform(MockMvcRequestBuilders.put("/tarefas/rsalocarpessoadep/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{ \"pessoaId\": 1 }"))
                .andExpect(status().isOk()) 
                .andExpect(jsonPath("$.id").value(1L)); 
    }
}
