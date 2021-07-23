-- 1. Crie um banco de dados para um e commerce, onde o sistema trabalhará com as informações dos produtos deste ecommerce. 
-- 2. Crie uma tabela produtos e utilizando a habilidade de abstração e determine 5 atributos relevantes dos produtos para se trabalhar com o serviço deste ecommerce.
-- 3. Popule esta tabela com até 8 dados;
-- 4. Faça um select que retorne os produtos com o valor maior do que 500.
-- 5. Faça um select que retorne os produtos com o valor menor do que 500.
-- 6. Ao término atualize um dado desta tabela através de uma query de atualização.
-- 7. Salve as querys para cada uma dos requisitos o exercício em um arquivo .SQL ou texto e coloque no seu GitHuB pessoal e compartilhe esta atividade.

create database db_ecommerce;
use db_ecommerce;

create table tb_produto(
idcodproduto int auto_increment not null,
descricao varchar (255) not null,
categoria varchar (255) not null,
tamanho varchar (255) not null,
cor varchar (255) not null,
preco decimal (5,2) not null,
primary key (idcodproduto)
);

insert into tb_produto (descricao, categoria, tamanho, cor, preco)
values
('Calça Mom','Jeans','M','Azul','119.00'),
('Jaqueta','Corta-vento','P','Branca','89.00'),
('Bruzinha de onçinha','Malha','GG','Marrom','34.90'),
('Touca','Acessórios','Unico','Rosa','29.90'),
('Calça moletom','Moletom','M','Preto','49.90'),
('Coleção Friends','Camiseta','PP','Verde','39.90'),
('Saia','Jeans','38','Branca','89.00'),
('Camisa social','Algodão','M','Bege','109.99');

select * from tb_produto where preco > 500;

select * from tb_produto where preco < 500;

update tb_produto set tamanho = 'M' where idcodproduto = 6;

select * from tb_produto;