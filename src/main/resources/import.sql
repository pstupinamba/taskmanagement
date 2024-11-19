-- INSERT DEPARTAMENTO
INSERT INTO departamento (id, nome) VALUES
(1, 'Financeiro'),
(2, 'Comercial'),
(3, 'Desenvolvimento');

-- Inserir pessoas com departamento associado
INSERT INTO pessoa (id, nome, departamento_id) VALUES
(1, 'Camila', 1),
(2, 'Pedro', 2),
(3, 'Fabiano', 3),
(4, 'Raquel', 3),
(5, 'Patricia', 3),
(6, 'Joaquim', 1);


-- EXECUTAR ESTE SEPARADO APÓS RODAR O SISTEMA
-- INSERT TAREFAS
INSERT INTO tarefa (id, titulo, descricao, data_prazo, departamento_id, duracao, pessoa_id, finalizado, data_registro) VALUES
(1001, 'Validar NF Janeiro', 'Validar notas recebidas no mês de Janeiro', '2022-02-15 17:00:00', 1, 14, 1, TRUE, '2022-01-01 08:30:00'),
(1002, 'Bug 352', 'Corrigir bug 352 na versão 1.25', '2022-05-10 18:00:00', 3, 25, 3, FALSE, '2022-03-01 09:00:00'),
(1003, 'Liberação da versão 1.24', 'Disponibilizar pacote para testes', '2022-02-02 16:00:00', 3, 2, NULL, TRUE, '2022-01-15 10:00:00'),
(1004, 'Reunião A', 'Reunião com cliente A para apresentação do produto', '2022-02-05 15:00:00', 3, 5, 5, FALSE, '2022-01-20 14:30:00'),
(1005, 'Reunião final', 'Fechamento contrato', '2022-03-28 12:00:00', 3, 10, NULL, FALSE, '2022-03-28 12:00:00'),
(1006, 'Pagamento 01/2022', 'Realizar pagamento dos fornecedores', '2022-01-31 17:45:00', 1, 4, 1, TRUE, '2021-12-20 09:15:00'),
(1007, 'Bug 401', 'Corrigir bug 401 na versão 1.20', '2022-02-01 14:00:00', 3, 6, NULL, TRUE, '2022-01-10 08:45:00'),
(1008, 'Bug 399', 'Corrigir bug 399 na versão 1.20', '2022-01-28 17:30:00', 3, 5, NULL, FALSE, '2022-01-05 13:00:00'),
(1009, 'Reunião B', 'Reunião com cliente B para apresentação do produto', '2022-01-30 15:30:00', 3, 10, 5, TRUE, '2022-01-15 10:00:00'),
(1010, 'Validar NF Fevereiro', 'Validar notas recebidas no mês de Fevereiro', '2022-03-15 16:00:00', 1, 14, 6, FALSE, '2022-02-01 08:00:00')
