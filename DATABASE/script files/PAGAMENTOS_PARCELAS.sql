
-- Lista os pagamentos (com cada parcela e situação)

SELECT 
	p.idpagamento AS ID_DO_PAGAMENTO,
    p.fk_idConsulta AS ID_DA_CONSULTA,
    p.valor AS VALOR,
    p.Forma_Pagamento AS FORMA_DE_PAGAMENTO,
    p.numeroParcelas AS TOTAL_DE_PARCELAS,
    d.numeroParcela AS NUMERO_DA_PARCELA,
    d.ValorParcela AS VALOR_DA_PARCELA,
    d.dataVencimento AS VENCIMENTO_DA_PARCELA,
    d.dataPagamento AS PAGAMENTO_DA_PARCELA,
    d.status AS STATUS
FROM 
	pagamentos p 
JOIN
	parcelas d ON p.idpagamento = d.fk_idPagamento
WHERE 
	p.idPagamento = '1';
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- Atualiza pagamentos
UPDATE pagamentos SET dataPagamento = '', Valor = '', Forma_Pagamento = '', numeroParcelas = '', situação = ''
WHERE idPagamento = '';
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- Atualiza parcelas
UPDATE parcelas SET numeroParcela = '', valorParcela = '', dataVencimento = '', dataPagamento = '', status = ''
WHERE idParcela = ''; 
