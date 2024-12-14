
-- Lista todos os funcionários da tabela de funcionários (SEM AGENDA)
SELECT idFuncionario as ID_DO_FUNCIONARIO, cpfFuncionario as CPF_DO_FUNCIONARIO, nomeFuncionario as NOME_DO_FUNCIONARIO, setor as SETOR, telefone as TEL,
email as EMAIL_DO_FUNCIONARIO, cep as CEP, endereco as ENDEREÇO, dataNascimento as NASCIMENTO, dataAdimissao as ADIMISSÃO
FROM funcionarios;  
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- Lista todos os funcionários e suas agendas
SELECT idAgenda as ID_DA_AGENDA, fk_cpfFuncionario as CPF_DO_FUNCIONARIO, idFuncionario as ID_DO_FUNCIONARIO, nomeFuncionario as NOME_DO_FUNCIONARIO, setor as SETOR
FROM agendas, funcionarios;
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- Lista funcionário com sua agenda
SELECT a.idAgenda as ID_DA_AGENDA, a.fk_cpfFuncionario as CPF_DO_FUNCIONARIO, f.idFuncionario as ID_DO_FUNCIONARIO, f.nomeFuncionario as NOME_DO_FUNCIONARIO, f.setor as SETOR
FROM agendas a, funcionarios f
WHERE cpfFuncionario = "-----------";
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*
	O BANCO DE DADOS POSSUI UMA SEGURANÇA EM RELAÇÃO A ALTERAÇÃO DE DADOS PRIMÁRIOS, COMO É O CASO DO CPF
    PARA ALTERAR O CPF, PRIMEIRO DESATIVE O SAFE MODE, ATUALIZE O CPF E LOGO APÓS, ATIVA O SAFE MODE
    NÃO ESQUECER NENHUMA INFO.
*/

-- Altera cpf do funcionário
SET SQL_SAFE_UPDATES = 0;
UPDATE funcionarios SET cpfFuncionario = 'CPF DO FUNCIONARIO'
WHERE idFuncionario = 'ID';
SET SQL_SAFE_UPDATES = 1;
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
