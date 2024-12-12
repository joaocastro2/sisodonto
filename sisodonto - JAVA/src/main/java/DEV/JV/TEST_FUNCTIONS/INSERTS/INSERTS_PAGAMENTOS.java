package DEV.JV.TEST_FUNCTIONS.INSERTS;

import DEV.JV.CLASSES_ENUM.formasPagamento;
import DEV.JV.DAO.pagamentosDAO;
import DEV.JV.MODEL.pagamentosMODEL;
import java.time.LocalDate;

public class INSERTS_PAGAMENTOS {

    public static void main(String[] args) {
        pagamentosDAO dao = new pagamentosDAO();
        pagamentosMODEL pagamento = new pagamentosMODEL(null, 1L, LocalDate.of(2024, 12, 11),
                                                         180.0, formasPagamento.DEBITO, true);

        dao.save(pagamento);
    }
}
