/*
Gabriel Lima
*/
drop database if exists dorme7;
create database dorme7;
use dorme7;

create table clientes (

	cliente_id					INT 						auto_increment 		primary KEY	,
	cliente_nome				VARCHAR(50)				not NULL									,
	cliente_cpf					VARCHAR(50)				not NULL 								,
	cliente_sexo				VARCHAR(50)				not NULL 								,
	cliente_senha				VARCHAR(50) 			not NULL									,
	cliente_endereco			VARCHAR(150) 			not NULL									,
	cliente_cidade				VARCHAR(150) 			not NULL									,
	cliente_estado				VARCHAR(150) 			not NULL									,
	cliente_idade				INT						not NULL									,
	cliente_casa_alugada		VARCHAR(25)
	
);

create table vendedores (
	vendedor_id					INT 						auto_increment 		primary KEY	,
	vendedor_nome				VARCHAR(50)				not NULL									,
	vendedor_cnpj				VARCHAR(50)				not NULL 								,
	vendedor_sexo				VARCHAR(50)				not NULL 								,
	vendedor_senha				VARCHAR(50) 			not NULL									,
	vendedor_endereco			VARCHAR(150) 			not NULL									,
	vendedor_cidade				VARCHAR(150) 			not NULL									,
	vendedor_estado				VARCHAR(150) 			not NULL									,
	vendedor_idade				INT						not NULL									,
	vendedor_casas		VARCHAR(25)

);

create table casas (
	casa_id		int 			auto_increment		primary key,
	casa_endereco			VARCHAR(150) 			not NULL									,
	casa_cidade				VARCHAR(150) 			not NULL									,
	casa_estado				VARCHAR(150) 			not NULL									
);

INSERT INTO clientes (cliente_id, 
							cliente_nome, 
							cliente_cpf,
							cliente_sexo,
							cliente_senha,
							cliente_endereco,
							cliente_cidade,
							cliente_estado,
							cliente_idade
)			VALUES		(1,
							"Gabriel",
							"111.111.111-11",
							"111",
							"senhamaneira",
							"11",
							"11",
							"11",
							"11"
							);
							
INSERT INTO vendedores (vendedor_id, 
							vendedor_nome, 
							vendedor_cnpj,
							vendedor_sexo,
							vendedor_senha,
							vendedor_endereco,
							vendedor_cidade,
							vendedor_estado,
							vendedor_idade
)			VALUES		(1,
							"Gabriel",
							"11.111.111/1111-11",
							"11",
							"11",
							"11",
							"11",
							"11",
							"11"
							);