

-- INSERT DE PESSOAS
DELETE FROM pessoa;
DELETE FROM departamento;
DELETE FROM tarefas;

INSERT INTO pessoa (id, nome, departamento_id, tarefa_id) VALUES (1, 'Carlos Silva', null, null);
INSERT INTO pessoa (id, nome, departamento_id, tarefa_id) VALUES (2, 'Ana Souza', null,null);
INSERT INTO pessoa (id, nome, departamento_id, tarefa_id) VALUES (3, 'Bruna Costa', null, null);
INSERT INTO pessoa (id, nome, departamento_id, tarefa_id) VALUES (4, 'João Pereira', null, null);
INSERT INTO pessoa (id, nome, departamento_id, tarefa_id) VALUES (5, 'Felipe Oliveira', null, null);

-- INSERT DEPARTAMENTO

INSERT INTO departamento (id, nome) VALUES (1, 'Desenvolvimento');
INSERT INTO departamento (id, nome) VALUES (2, 'Marketing');
INSERT INTO departamento (id, nome) VALUES (3, 'Recursos Humanos');

-- INSERT TAREFAS

-- Inserção para a tabela de Tarefas
INSERT INTO tarefas (id, titulo, data_registro, data_prazo, duracao, finalizado, pessoa_alocada, departamento_id) 
VALUES (1, 'Desenvolver API', '2024-11-01 09:00:00', '2024-11-10 18:00:00', 80, TRUE, 1, 1);

INSERT INTO tarefas (id, titulo, data_registro, data_prazo, duracao, finalizado, pessoa_alocada, departamento_id) 
VALUES (2, 'Campanha de Natal', '2024-11-05 10:00:00', '2024-12-05 17:00:00', 50, FALSE, 2, 2);

INSERT INTO tarefas (id, titulo, data_registro, data_prazo, duracao, finalizado, pessoa_alocada, departamento_id) 
VALUES (3, 'Recrutamento de pessoal', '2024-11-07 08:30:00', '2024-11-30 18:00:00', 60, FALSE, 3, 3);

