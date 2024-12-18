package DEV.JV.TEST_FUNCTIONS.INSERTS;

import DEV.JV.CLASSES_ENUM.formasPagamento;
import DEV.JV.DAO.pagamentosDAO;
import DEV.JV.MODEL.pagamentosMODEL;
import java.time.LocalDate;

/**
 * Classe de teste para inserir um novo pagamento.
 */
public class INSERTS_PAGAMENTOS {

    /**
     * Método principal para execução do teste de inserção do pagamento.
     *
     * @param args Argumentos da linha de comando.
     */
    public static void main(String[] args) {
        // Cria uma instância de pagamentosDAO para realizar operações no banco de dados.
        pagamentosDAO dao = new pagamentosDAO();

        // Cria uma nova instancia de pagamentosMODEL.
        pagamentosMODEL pagamento = new pagamentosMODEL(null, 2L, LocalDate.of(2024, 12, 11),
                180.0, formasPagamento.DEBITO, true);

        // Salva o novo pagamento no banco de dados.
        dao.save(pagamento);
    }
}
