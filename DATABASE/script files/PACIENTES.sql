
-- Lista todos os pacientes da tabela pacientes 
SELECT cpfPaciente as CPF_DO_PACIENTE, nomePaciente as NOME_DO_PACIENTE, nascimento as NASCIMENTO, sexo as SEXO,
cep as CEP, endereço as ENDEREÇO, telefone as TEL, email as EMAIL
FROM pacientes;
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- Altera cpf do paciente

/*
	O BANCO DE DADOS POSSUI UMA SEGURANÇA EM RELAÇÃO A ALTERAÇÃO DE DADOS PRIMÁRIOS, COMO É O CASO DO CPF
    PARA ALTERAR O CPF, PRIMEIRO DESATIVE O SAFE MODE, ATUALIZE O CPF E LOGO APÓS, ATIVA O SAFE MODE
    NÃO ESQUECER NENHUMA INFO.
*/

SET SQL_SAFE_UPDATES = 0;
UPDATE pacientes SET cpfPaciente = '88888888888'
WHERE cpfPaciente = 70875339103;
SET SQL_SAFE_UPDATES = 1;
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
