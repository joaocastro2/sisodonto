package DEV.JV.TEST_FUNCTIONS.DELETS;

import DEV.JV.DAO.consultaDAO;

/**
 * Classe de teste para deletar uma consulta específica.
 */
public class DELETS_CONSULTAS {

    /**
     * Método principal para execução do teste de deleção da consulta.
     * @param args Argumentos da linha de comando.
     */
    public static void main(String[] args) {

        // Cria uma instância de consultaDAO para realizar operações no banco de dados.
        consultaDAO consultaDEL = new consultaDAO();

        // Deleta a consulta com o ID especifico.
        consultaDEL.delete(3L);
    }
}
