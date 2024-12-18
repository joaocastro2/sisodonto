package DEV.JV.TEST_FUNCTIONS.DELETS;

import DEV.JV.DAO.funcionariosDAO;

/**
 * Classe de teste para deletar um funcionário específico.
 */
public class DELETS_FUNCIONARIOS {

    /**
     * Método principal para execução do teste de deleção do funcionário.
     * @param args Argumentos da linha de comando.
     */
    public static void main(String[] args) {
        // Cria uma instância de funcionariosDAO para realizar operações no banco de dados.
        funcionariosDAO funcionariosDEL = new funcionariosDAO();

        // Deleta o funcionário com CPF especifico.
        funcionariosDEL.delete("33333333333");
    }
}
