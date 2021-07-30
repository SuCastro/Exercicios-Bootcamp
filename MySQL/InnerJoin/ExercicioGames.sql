#criando banco de dados
create database db_generation_game_online;

#usando o banco de dados
use db_generation_game_online;

#criando a tabela tb_classe
create table tb_classe (
idClasse int not null auto_increment,
categoria varchar (255) not null,
poder varchar (255) not null,
dominio varchar (255) not null,
primary key (idClasse)
);

#criando a tabela tb_personagem
create table tb_personagem (
idPersonagem int not null auto_increment,
fk_idClasse int not null,
nome varchar (255) not null,
cor_cabelo varchar (255) not null,
arma varchar (255) not null,
nivelForca INT not null,
nivelDefesa INT not null,
velocidade varchar (255) not null,
primary key (idPersonagem),
foreign key (fk_idClasse) REFERENCES db_generation_game_online.tb_classe(idClasse)
);

#populando tabela classe
Insert into tb_classe (IdClasse, categoria, poder, dominio) values (DEFAULT, 'semi-deus','manipula água','60%');
Insert into tb_classe (IdClasse, categoria, poder, dominio) values (DEFAULT,'sátiro','elo empático','70%');
Insert into tb_classe (IdClasse, categoria, poder, dominio) values (DEFAULT, 'deus','domina o vinho','100%');
Insert into tb_classe (IdClasse, categoria, poder, dominio) values (DEFAULT,'meiosangue','sabedoria aprimorada','90%');
Insert into tb_classe (IdClasse, categoria, poder, dominio) values (DEFAULT,'centauro','velocidade','100%');

SELECT * FROM db_generation_game_online.tb_classe;
SELECT * FROM db_generation_game_online.tb_classe;

#populando tabela personagem
insert into db_generation_game_online.tb_personagem (idPersonagem, fk_idClasse, nome, cor_cabelo, arma, nivelForca, NivelDefesa, velocidade) values (DEFAULT, 1, 'Percy Jackson','castanho-médio', 'manipula agua', 3000, 1000,'57%');
insert into db_generation_game_online.tb_personagem (idPersonagem, fk_idClasse, nome, cor_cabelo, arma, nivelForca, NivelDefesa, velocidade) values  (DEFAULT, 4, 'Annabeth Chase','ruivo','sabedoria e estratégia', 4500, 2500,'64%');
insert into db_generation_game_online.tb_personagem (idPersonagem, fk_idClasse, nome, cor_cabelo, arma, nivelForca, NivelDefesa, velocidade) values (DEFAULT, 2, 'Grover Underwood','castanho-escuro','perseguiçao', 2100, 1500, '92%');
insert into db_generation_game_online.tb_personagem (idPersonagem, fk_idClasse, nome, cor_cabelo, arma, nivelForca, NivelDefesa, velocidade) values (DEFAULT, 4, 'Thalia Grace','preto','canaliza raios', 4700, 2750,'70%');
insert into db_generation_game_online.tb_personagem (idPersonagem, fk_idClasse, nome, cor_cabelo, arma, nivelForca, NivelDefesa, velocidade) values (DEFAULT, 4, 'Luke Castellan','loiro','transporte', 3000, 900,'80%');
insert into db_generation_game_online.tb_personagem (idPersonagem, fk_idClasse, nome, cor_cabelo, arma, nivelForca, NivelDefesa, velocidade) values (DEFAULT, 4, 'Clarisse La Rue','castanho-médio','luta', 5500, 2500,'61%');
insert into db_generation_game_online.tb_personagem (idPersonagem, fk_idClasse, nome, cor_cabelo, arma, nivelForca, NivelDefesa, velocidade) values (DEFAULT, 5, 'Sr. Brunner','loiro','labarda', 1900, 2500, '76%');
insert into db_generation_game_online.tb_personagem (idPersonagem, fk_idClasse, nome, cor_cabelo, arma, nivelForca, NivelDefesa, velocidade) values (DEFAULT, 3, 'Sr. D','loiro','dominio da mente com o vinho', 7000, 1000,'38%');

SELECT * FROM db_generation_game_online.tb_personagem;
#selecionando nivel de forca 
SELECT * FROM db_generation_game_online.tb_personagem WHERE nivelForca > 2000;

#selecionando nivel defesa
SELECT * FROM db_generation_game_online.tb_personagem WHERE nivelDefesa > 1000 AND nivelDefesa < 2000;

#selecionando com LIKE
SELECT * FROM db_generation_game_online.tb_personagem WHERE nome LIKE "C%"; #select do LIKE para nomes que começam com a letra C
SELECT * FROM db_generation_game_online.tb_personagem WHERE nome LIKE "%C%"; #select do LIKE para nomes que contém a letra C
SELECT * FROM db_generation_game_online.tb_personagem WHERE nome LIKE "%E"; #select do LIKE para nomes que terminam com a letra E

#Juntando as tabelas 
SELECT * FROM db_generation_game_online.tb_personagem 
    INNER JOIN db_generation_game_online.tb_classe ON tb_classe.idClasse = tb_personagem.fk_idClasse;

#juntando as tabelas por caracteristicas 
SELECT tb_personagem.idPersonagem, tb_personagem.nome, tb_classe.categoria
    FROM tb_personagem INNER JOIN tb_classe ON tb_classe.idClasse = tb_personagem.fk_idClasse
        WHERE tb_classe.categoria LIKE "%meiosangue%";