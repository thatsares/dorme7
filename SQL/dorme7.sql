-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           10.6.4-MariaDB - mariadb.org binary distribution
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

DROP DATABASE IF EXISTS `dorme7`;
-- Copiando estrutura do banco de dados para dorme7
CREATE DATABASE IF NOT EXISTS `dorme7` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `dorme7`;

-- Copiando estrutura para tabela dorme7.casas
CREATE TABLE IF NOT EXISTS `casas` (
  `casa_id` 			 int AUTO_INCREMENT,
  `casa_nome` 				varchar(50) NOT NULL,
  `casa_cidade`			varchar(50) DEFAULT NULL,
  `casa_endereco` 		varchar(50) DEFAULT NULL,
  `casa_numero` 			int(11) DEFAULT NULL,
  `casa_quartos` 			int(11) DEFAULT NULL,
  `casa_banheiros` 		int(11) DEFAULT NULL,
  `casa_piscina` 		boolean DEFAULT false,
  `casa_churrasqueira` 	boolean DEFAULT false,
  `casa_alugada`		boolean default false,
  `vendedor_id`			int		references vendedores(vendedor_id),
  `casa_valor` 			float DEFAULT NULL,
  PRIMARY KEY (`casa_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela dorme7.casas: ~0 rows (aproximadamente)
DELETE FROM `casas`;
/*!40000 ALTER TABLE `casas` DISABLE KEYS */;


INSERT INTO `casas` (`casa_id`, `casa_nome`, `casa_cidade`, `casa_endereco`, `casa_numero`, `casa_quartos`, `casa_banheiros`, `casa_piscina`, `casa_churrasqueira`, `casa_alugada`,`vendedor_id`,`casa_valor`) VALUES
	(1, 'Casa de Campo', 'Sorocaba', 'Rua do Campo', '9000', '4', '2', true, true, false, 1, 555.65);
    
    
INSERT INTO `casas` (`casa_id`, `casa_nome`, `casa_cidade`, `casa_endereco`, `casa_numero`, `casa_quartos`, `casa_banheiros`, `casa_piscina`, `casa_churrasqueira`, `casa_alugada`,`vendedor_id`,`casa_valor`) VALUES
	(NULL, 'Casa de Praia', 'Santos', 'Rua Praia', '741', '5', '3', true, true, false, 2, 979.90);
    
INSERT INTO `casas` (`casa_id`, `casa_nome`, `casa_cidade`, `casa_endereco`, `casa_numero`, `casa_quartos`, `casa_banheiros`, `casa_piscina`, `casa_churrasqueira`, `casa_alugada`,`vendedor_id`,`casa_valor`) VALUES
	(NULL, 'Casa no Centro', 'São Paulo', 'Rua do Centro', '115', '3', '1', false, false, true, 3, 459.75);
    
INSERT INTO `casas` (`casa_id`, `casa_nome`, `casa_cidade`, `casa_endereco`, `casa_numero`, `casa_quartos`, `casa_banheiros`, `casa_piscina`, `casa_churrasqueira`, `casa_alugada`,`vendedor_id`,`casa_valor`) VALUES
	(NULL, 'Casa do Interior', 'São Roque', 'Rua Interior', '1226', '6', '3', true, false, false, 4, 798.37);


/*!40000 ALTER TABLE `casas` ENABLE KEYS */;

-- Copiando estrutura para tabela dorme7.clientes
CREATE TABLE IF NOT EXISTS `clientes` (
  `cliente_id` int AUTO_INCREMENT,
  `cliente_nome` varchar(50) NOT NULL,
  `cliente_cpf` varchar(50) NOT NULL,
  `cliente_sexo` varchar(50) NOT NULL,
  `cliente_senha` varchar(500) NOT NULL,
  `cliente_endereco` varchar(150) NOT NULL,
  `cliente_cidade` varchar(150) NOT NULL,
  `cliente_estado` varchar(150) NOT NULL,
  `cliente_idade` int(11) NOT NULL,
  `cliente_casa_alugada` int 	references casas(casa_id),
  PRIMARY KEY (`cliente_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela dorme7.clientes: ~0 rows (aproximadamente)
DELETE FROM `clientes`;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;

INSERT INTO `clientes` (`cliente_id`, `cliente_nome`, `cliente_cpf`, `cliente_sexo`, `cliente_senha`, `cliente_endereco`, `cliente_cidade`, `cliente_estado`, `cliente_idade`, `cliente_casa_alugada`) VALUES
	(1, 'Gabriel', '498.001.350-30', 'masculino', 'senhamaneira', '11', '11', '11', 11, NULL);
    
INSERT INTO `clientes` (`cliente_id`, `cliente_nome`, `cliente_cpf`, `cliente_sexo`, `cliente_senha`, `cliente_endereco`, `cliente_cidade`, `cliente_estado`, `cliente_idade`, `cliente_casa_alugada`) VALUES
	(NULL, 'João', '531.773.918-74', 'masculino', 'senhalegal', '11', '11', '11', 11, NULL);
    
INSERT INTO `clientes` (`cliente_id`, `cliente_nome`, `cliente_cpf`, `cliente_sexo`, `cliente_senha`, `cliente_endereco`, `cliente_cidade`, `cliente_estado`, `cliente_idade`, `cliente_casa_alugada`) VALUES
	(NULL, 'Pedro', '272.729.481-67', 'masculino', 'senhadahora', '11', '11', '11', 11, NULL);
    
INSERT INTO `clientes` (`cliente_id`, `cliente_nome`, `cliente_cpf`, `cliente_sexo`, `cliente_senha`, `cliente_endereco`, `cliente_cidade`, `cliente_estado`, `cliente_idade`, `cliente_casa_alugada`) VALUES
	(NULL, 'Guilherme', '569.388.441-43', 'masculino', 'senhatop', '11', '11', '11', 11, NULL);

/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;

-- Copiando estrutura para tabela dorme7.vendedores
CREATE TABLE IF NOT EXISTS `vendedores` (
  `vendedor_id` int AUTO_INCREMENT,
  `vendedor_nome` varchar(50) NOT NULL,
  `vendedor_cnpj` varchar(50) NOT NULL,
  `vendedor_sexo` varchar(50) NOT NULL,
  `vendedor_senha` varchar(50) NOT NULL,
  `vendedor_endereco` varchar(150) NOT NULL,
  `vendedor_cidade` varchar(150) NOT NULL,
  `vendedor_estado` varchar(150) NOT NULL,
  `vendedor_idade` int(11) NOT NULL,
  PRIMARY KEY (`vendedor_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela dorme7.vendedores: ~0 rows (aproximadamente)
DELETE FROM `vendedores`;
/*!40000 ALTER TABLE `vendedores` DISABLE KEYS */;

INSERT INTO `vendedores` (`vendedor_id`, `vendedor_nome`, `vendedor_cnpj`, `vendedor_sexo`, `vendedor_senha`, `vendedor_endereco`, `vendedor_cidade`, `vendedor_estado`, `vendedor_idade`) VALUES
	(1, 'Raphael', '67.251.204/0001-76', 'masculino', '11', '11', '11', '11', 11);
    
INSERT INTO `vendedores` (`vendedor_id`, `vendedor_nome`, `vendedor_cnpj`, `vendedor_sexo`, `vendedor_senha`, `vendedor_endereco`, `vendedor_cidade`, `vendedor_estado`, `vendedor_idade`) VALUES
	(NULL, 'Vitor', '16.232.789/0001-46', 'masculino', '11', '11', '11', '11', 11);
    
INSERT INTO `vendedores` (`vendedor_id`, `vendedor_nome`, `vendedor_cnpj`, `vendedor_sexo`, `vendedor_senha`, `vendedor_endereco`, `vendedor_cidade`, `vendedor_estado`, `vendedor_idade`) VALUES
	(NULL, 'Matheus', '38.345.417/0001-69', 'masculino', '11', '11', '11', '11', 11);
    
INSERT INTO `vendedores` (`vendedor_id`, `vendedor_nome`, `vendedor_cnpj`, `vendedor_sexo`, `vendedor_senha`, `vendedor_endereco`, `vendedor_cidade`, `vendedor_estado`, `vendedor_idade`) VALUES
	(NULL, 'Paulo', '17.731.928/0001-49', 'masculino', '11', '11', '11', '11', 11);

/*!40000 ALTER TABLE `vendedores` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;

DROP PROCEDURE IF exists novoCliente;
DROP PROCEDURE IF exists getCliente;
DROP PROCEDURE IF exists getClienteSenha;

delimiter $
create procedure novoCliente(
  `cliente_nome` varchar(80),
  `cliente_cpf` varchar(80),
  `cliente_sexo` varchar(80),
  `cliente_senha` varchar(80),
  `cliente_endereco` varchar(150),
  `cliente_cidade` varchar(150),
  `cliente_estado` varchar(150),
  `cliente_idade` int
)
begin
    insert into clientes(cliente_nome, cliente_cpf, cliente_sexo, cliente_senha, cliente_endereco, cliente_cidade, cliente_estado, cliente_idade, cliente_casa_alugada) values(cliente_nome, cliente_cpf, cliente_sexo, cliente_senha, cliente_endereco, cliente_cidade, cliente_estado, cliente_idade, null);
end$

delimiter $

delimiter $
create procedure getCliente()
begin
    select cliente_nome, cliente_cpf, cliente_sexo, cliente_senha, cliente_endereco, cliente_cidade, cliente_estado, cliente_idade, cliente_casa_alugada from clientes;
end$

delimiter $
create procedure getClienteSenha(`cpf` varchar(80))
begin
    select cliente_senha from clientes where cliente_cpf = cpf;
end$
delimiter $

drop view if exists listaCasas;
create view listaCasas as 

    	select 
		C.casa_id as "ID",
        C.casa_nome as "Nome:",
        C.casa_cidade as "Cidade:",
		C.casa_endereco as "Endereço:",
        C.casa_numero as "Número:",
		C.casa_quartos as "Número de quartos:",
        C.casa_banheiros as "Número de banheiros:",
		C.casa_valor as "Diaria:",
        V.vendedor_nome as "Vendedor",
        case C.casa_piscina 
			when true then "Sim"
            when false then "Não"
        end		as "Possui piscina",
        
		case C.casa_churrasqueira 
			when true then "Sim"
            when false then "Não"
        end		as "Possui churrasqueira",
        
		case C.casa_alugada 
			when true then "Sim"
            when false then "Não"
        end		as "Está alugada?"
	from casas C
		left join vendedores V
			on C.vendedor_id = V.vendedor_id;

