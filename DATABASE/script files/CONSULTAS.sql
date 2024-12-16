
-- Lista as consultas de uma determinada pessoa
SELECT 
    c.idConsulta AS ID_DA_CONSULTA,
    p.nomePaciente AS NOME_DO_PACIENTE,
    f.nomeFuncionario AS NOME_DO_FUNCIONARIO,
    c.dataConsulta AS DATA_MARCADA,
    c.horaConsulta AS HORA_DA_CONSULTA,
    c.fk_idTratamento AS ID_DO_TRATAMENTO,
    c.situacao AS SITUACAO -- SITUAÇÃO = 0 (CONSULTA NÃO PAGA), SITUAÇÃO = 1 (CONSULTA PAGA).
FROM 
    consultas c
JOIN 
    pacientes p ON c.fk_cpfPaciente = p.cpfPaciente
JOIN 
    funcionarios f ON c.fk_cpfFuncionario = f.cpfFuncionario
WHERE 
    c.fk_cpfPaciente = '22222222222';
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

