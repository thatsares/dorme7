use dorme7;


INSERT INTO `casas` (`casa_id`, `casa_nome`, `casa_cidade`, `casa_endereco`, `casa_numero`, `casa_quartos`, `casa_banheiros`, `casa_piscina`, `casa_churrasqueira`, `casa_alugada`,`vendedor_id`,`casa_valor`) VALUES
	(NULL, 'Casa de Campo', 'Sorocaba', 'Rua do Campo', '9000', '4', '2', true, true, false, 1, 555.65);
    
INSERT INTO `clientes` (`cliente_id`, `cliente_nome`, `cliente_cpf`, `cliente_sexo`, `cliente_senha`, `cliente_endereco`, `cliente_cidade`, `cliente_estado`, `cliente_idade`, `cliente_casa_alugada`) VALUES
	(NULL, 'Gabriel', '498.001.350-30', 'masculino', 'senhamaneira', '11', '11', '11', 11, NULL);
    
INSERT INTO `vendedores` (`vendedor_id`, `vendedor_nome`, `vendedor_cnpj`, `vendedor_sexo`, `vendedor_senha`, `vendedor_endereco`, `vendedor_cidade`, `vendedor_estado`, `vendedor_idade`) VALUES
	(NULL, 'Raphael', '67.251.204/0001-76', 'masculino', '11', '11', '11', '11', 11);


INSERT INTO `casas` (`casa_id`, `casa_nome`, `casa_cidade`, `casa_endereco`, `casa_numero`, `casa_quartos`, `casa_banheiros`, `casa_piscina`, `casa_churrasqueira`, `casa_alugada`,`vendedor_id`,`casa_valor`) VALUES
	(NULL, 'Casa de Praia', 'Santos', 'Rua Praia', '741', '5', '3', true, true, false, 2, 979.90);
    
INSERT INTO `clientes` (`cliente_id`, `cliente_nome`, `cliente_cpf`, `cliente_sexo`, `cliente_senha`, `cliente_endereco`, `cliente_cidade`, `cliente_estado`, `cliente_idade`, `cliente_casa_alugada`) VALUES
	(NULL, 'João', '531.773.918-74', 'masculino', 'senhalegal', '11', '11', '11', 11, NULL);
    
INSERT INTO `vendedores` (`vendedor_id`, `vendedor_nome`, `vendedor_cnpj`, `vendedor_sexo`, `vendedor_senha`, `vendedor_endereco`, `vendedor_cidade`, `vendedor_estado`, `vendedor_idade`) VALUES
	(NULL, 'Vitor', '16.232.789/0001-46', 'masculino', '11', '11', '11', '11', 11);


INSERT INTO `casas` (`casa_id`, `casa_nome`, `casa_cidade`, `casa_endereco`, `casa_numero`, `casa_quartos`, `casa_banheiros`, `casa_piscina`, `casa_churrasqueira`, `casa_alugada`,`vendedor_id`,`casa_valor`) VALUES
	(NULL, 'Casa no Centro', 'São Paulo', 'Rua do Centro', '115', '3', '1', false, false, true, 3, 459.75);
    
INSERT INTO `clientes` (`cliente_id`, `cliente_nome`, `cliente_cpf`, `cliente_sexo`, `cliente_senha`, `cliente_endereco`, `cliente_cidade`, `cliente_estado`, `cliente_idade`, `cliente_casa_alugada`) VALUES
	(NULL, 'Pedro', '272.729.481-67', 'masculino', 'senhadahora', '11', '11', '11', 11, NULL);
    
INSERT INTO `vendedores` (`vendedor_id`, `vendedor_nome`, `vendedor_cnpj`, `vendedor_sexo`, `vendedor_senha`, `vendedor_endereco`, `vendedor_cidade`, `vendedor_estado`, `vendedor_idade`) VALUES
	(NULL, 'Matheus', '38.345.417/0001-69', 'masculino', '11', '11', '11', '11', 11);


INSERT INTO `casas` (`casa_id`, `casa_nome`, `casa_cidade`, `casa_endereco`, `casa_numero`, `casa_quartos`, `casa_banheiros`, `casa_piscina`, `casa_churrasqueira`, `casa_alugada`,`vendedor_id`,`casa_valor`) VALUES
	(NULL, 'Casa do Interior', 'São Roque', 'Rua Interior', '1226', '6', '3', true, false, false, 4, 798.37);
    
INSERT INTO `clientes` (`cliente_id`, `cliente_nome`, `cliente_cpf`, `cliente_sexo`, `cliente_senha`, `cliente_endereco`, `cliente_cidade`, `cliente_estado`, `cliente_idade`, `cliente_casa_alugada`) VALUES
	(NULL, 'Guilherme', '569.388.441-43', 'masculino', 'senhatop', '11', '11', '11', 11, NULL);
    
INSERT INTO `vendedores` (`vendedor_id`, `vendedor_nome`, `vendedor_cnpj`, `vendedor_sexo`, `vendedor_senha`, `vendedor_endereco`, `vendedor_cidade`, `vendedor_estado`, `vendedor_idade`) VALUES
	(NULL, 'Paulo', '17.731.928/0001-49', 'masculino', '11', '11', '11', '11', 11);