package DEV.JV.TEST_FUNCTIONS.DELETS;

import DEV.JV.DAO.pagamentosDAO;

/**
 * Classe de teste para deletar um pagamento específico.
 */
public class DELETS_PAGAMENTOS {

    /**
     * Método principal para execução do teste de deleção do pagamento.
     *
     * @param args Argumentos da linha de comando.
     */
    public static void main(String[] args) {

        // Cria uma instância de pagamentosDAO para realizar operações no banco de dados.
        pagamentosDAO pagamentos = new pagamentosDAO();

        // Deleta o pagamento com ID especifico.
        pagamentos.delete(2L);
    }
}
