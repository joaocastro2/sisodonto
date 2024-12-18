package DEV.JV.TEST_FUNCTIONS.INSERTS;

import DEV.JV.CLASSES_ENUM.tiposTratamento;
import DEV.JV.DAO.tratamentosDAO;
import DEV.JV.MODEL.tratamentosMODEL;

/**
 * Classe de teste para inserir um novo tratamento.
 */
public class INSERTS_TRATAMENTS {

    /**
     * Método principal para execução do teste de inserção do tratamento.
     *
     * @param args Argumentos da linha de comando.
     */
    public static void main(String[] args) {

        // Cria uma instância de tratamentosDAO para realizar operações no banco de dados.
        tratamentosDAO dao = new tratamentosDAO();

        // Cria uma nova instancia de tratamentosMODEL.
        tratamentosMODEL tratamento = new tratamentosMODEL(null, tiposTratamento.CLAREAMENTO, "Clareamento basico", 85.0);

        // Salva o novo tratamento no banco de dados.
        dao.save(tratamento);
    }
}
