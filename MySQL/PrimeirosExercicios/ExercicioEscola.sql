-- 1. Crie um banco de dados para um registro de uma escola, onde o sistema trabalhará com as informações dos estudantes deste registro dessa escola. 
-- 2. Crie uma tabela estudantes e utilizando a habilidade de abstração e determine 5 atributos relevantes dos estudantes para se trabalhar com o serviço dessa escola.
-- 3. Popule esta tabela com até 8 dados;
-- 4. Faça um select que retorne o/as estudantes com a nota maior do que 7.
-- 5. Faça um select que retorne o/as estudantes com a nota menor do que 7.
-- 6. Ao término atualize um dado desta tabela através de uma query de atualização.
-- 7. Salve as querys para cada uma dos requisitos o exercício em um arquivo .SQL ou texto e coloque no seu GitHuB pessoal e compartilhe esta atividade.

create database db_escola;
use db_escola;

create table tb_estudantes(
idEstudante int auto_increment not null,
registroAluno varchar (10) not null,
nomeCompleto varchar (255) not null,
statusMatricula varchar (255) not null,
serieMatricula varchar (255) not null,
frequencia varchar (100) not null,
notaMedia int not null,
primary key (idEstudante)
);

insert into tb_estudantes (registroAluno, nomeCompleto, statusMatricula, serieMatricula, frequencia, notaMedia)
values
('0009384756','Beatriz Almeida de Souza','ATIVO','7° série','69%', '4'),
('0007382910','Carlos Eduardo dos Santos','ATIVO','4° série','78%', '7'),
('0001237645','Paulo Henrique Alves Bueno','ATIVO','5° série','72%', '8'),
('0008562974','Clara da Silva Ferraz','EM ANÁLISE','5° série','35%', '9'),
('0004219694','Nicolas Pereira Amaral','ATIVO','6° série','60%', '6'),
('0002938981','Maria Julia Cerveira','EM ANÁLISE','8° série','40%', '3'),
('0007326215','Camila de Souza Carvalho','SUSPENSO','7° série','88%', '5'),
('0003847566','Matheus Ricardo Castro','ATIVO','6° série','100%', '9');

select * from tb_estudantes where notaMedia > 7;

select * from tb_estudantes where notaMedia < 7;

update tb_estudantes set frequencia = '51%' where idcodproduto = 6;

select * from tb_estudantes;