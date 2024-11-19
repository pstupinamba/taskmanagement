-- INSERT DEPARTAMENTO
INSERT INTO departamento (id, nome) VALUES (1, 'Desenvolvimento');
INSERT INTO departamento (id, nome) VALUES (2, 'Marketing');
INSERT INTO departamento (id, nome) VALUES (3, 'Recursos Humanos');

-- Inserir pessoas com departamento associado
INSERT INTO pessoa (nome, departamento_id) VALUES ('Carlos Silva', 1); 
INSERT INTO pessoa (nome, departamento_id) VALUES ('Ana Souza', 2);     
INSERT INTO pessoa (nome, departamento_id) VALUES ('Bruna Costa', 3);   
INSERT INTO pessoa (nome, departamento_id) VALUES ('Felipe Oliveira', 2);

-- Atualizando departamento para cada pessoa
UPDATE pessoa SET departamento_id = 1 WHERE id = 1; -- Carlos Silva no Departamento de Desenvolvimento
UPDATE pessoa SET departamento_id = 2 WHERE id = 2; -- Ana Souza no Departamento de Marketing
UPDATE pessoa SET departamento_id = 3 WHERE id = 3; -- Bruna Costa no Departamento de RH
UPDATE pessoa SET departamento_id = 1 WHERE id = 4; -- João Pereira no Departamento de Desenvolvimento
UPDATE pessoa SET departamento_id = 2 WHERE id = 5; -- Felipe Oliveira no Departamento de Marketing


-- EXECUTAR ESTE SEPARADO APÓS RODAR O SISTEMA
-- INSERT TAREFAS
INSERT INTO tarefa (titulo, descricao, data_registro, data_prazo, duracao, finalizado, pessoa_id, departamento_id)
VALUES 
('Desenvolver API', 'Desenvolver uma API para o sistema', '2024-11-01 09:00:00', '2024-11-10 18:00:00', 80, true, null, 1),  
('Campanha de Natal', 'Criar e executar campanha de Natal', '2024-11-05 10:00:00', '2024-12-05 17:00:00', 50, false, null, 2), 
('Recrutamento de pessoal', 'Recrutar pessoas para vaga de desenvolvedor', '2024-11-07 08:30:00', '2024-11-30 18:00:00', 60, false, null, 3);
