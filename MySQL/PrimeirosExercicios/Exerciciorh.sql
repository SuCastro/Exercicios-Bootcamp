-- Exercício 1
-- 1. Crie um banco de dados para um serviço de RH de uma empresa, onde o sistema trabalhará com as informações dos funcionaries desta empresa.
-- 2. Crie uma tabela de funcionaries e utilizando a habilidade de abstração e determine 5 atributos relevantes dos funcionaries para se trabalhar com o serviço deste RH.
-- 3. Popule esta tabela com até 5 dados.
-- 4. Faça um select que retorne os funcionaries com o salário maior do que 2000.
-- 5. Faça um select que retorne os funcionaries com o salário menor do que 2000.
-- 6. Ao término atualize um dado desta tabela através de uma query de atualização.
-- 7. Salve as querys para cada uma dos requisitos o exercício em um arquivo .SQL ou texto e coloque no seu GitHub pessoal e compartilhe esta atividade.

create database db_setorRH;
use db_setorRH;

create table tb_funcionarios (
idFuncionario int auto_increment not null,
nome varchar (255) not null,
idade int not null,
email varchar (255) not null,
setor varchar (255) not null,
salario decimal (6,2) not null,
primary key (idFuncionario)
);

insert into tb_funcionarios (nome, idade, email, setor, salario)
values 
('Pietro Mendes','23','pie.mendes@email.com', 'Financeiro','6500.00'),
('Peter Amaral','25','pet.amaral@email.com', 'Vendas','3100.00'),
('Maria Isabel Rodrigues','19','mabel.rodrigues@email.com', 'T.I','5700.00'),
('Carolina Menezes','28','carol.menezes@email.com', 'Logística','4090.00'),
('Scarlet Jhorenson','30','scarlet.jho@email.com', 'Atendimento','1750.00');

select * from tb_funcionarios;

select * from tb_funcionarios where salario > 2000;

select * from tb_funcionarios where salario < 2000;

update tb_funcionarios set setor = 'T.I' where idFuncionario = 5;

select * from tb_funcionarios;
