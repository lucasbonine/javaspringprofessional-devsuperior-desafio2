-- ===========================
-- tabela de categorias
-- ===========================
insert into tb_categoria(descricao) values ('Esporte');
insert into tb_categoria(descricao) values ('Arte');
insert into tb_categoria(descricao) values ('Tecnologia');

-- ===========================
-- tabela de atividades
-- ===========================
insert into tb_atividade(nome, descricao, preco, categoria_id) values ('Futebol', 'Treino de futebol', 50.0, 1);
insert into tb_atividade(nome, descricao, preco, categoria_id) values ('Pintura', 'Aula de pintura em tela', 80.0, 2);
insert into tb_atividade(nome, descricao, preco, categoria_id) values ('Programação Java', 'Curso de Java básico', 120.0, 3);

-- ===========================
-- tabela de participantes
-- ===========================
insert into tb_participante (nome, email) values ('Lucas', 'lucas@email.com');
insert into tb_participante (nome, email) values ('Ana', 'ana@email.com');
insert into tb_participante (nome, email) values ('Pedro', 'pedro@email.com');

-- ===========================
-- tabela de blocos
-- ===========================
insert into tb_bloco (inicio, fim, atividade_id) values ('2025-09-10T08:00:00', '2025-09-10T12:00:00', 1);
insert into tb_bloco (inicio, fim, atividade_id) values ('2025-09-10T13:00:00', '2025-09-10T17:00:00', 2);
insert into tb_bloco (inicio, fim, atividade_id) values ('2025-09-10T18:00:00', '2025-09-10T22:00:00', 3);

-- ===========================
-- tabela de relação participantes x atividades (n:n)
-- ===========================
insert into tb_participantes_atividades (participante_id, atividade_id) values (1, 1);
insert into tb_participantes_atividades (participante_id, atividade_id) values (1, 3);
insert into tb_participantes_atividades (participante_id, atividade_id) values (2, 2);
insert into tb_participantes_atividades (participante_id, atividade_id) values (3, 1);
insert into tb_participantes_atividades (participante_id, atividade_id) values (3, 3);
