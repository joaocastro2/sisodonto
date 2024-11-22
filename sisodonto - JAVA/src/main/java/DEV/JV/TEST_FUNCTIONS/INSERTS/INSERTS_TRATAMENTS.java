package DEV.JV.TEST_FUNCTIONS.INSERTS;

import DEV.JV.CLASSES_ENUM.tiposTratamento;
import DEV.JV.DAO.tratamentosDAO;
import DEV.JV.MODEL.tratamentosMODEL;

public class INSERTS_TRATAMENTS {

    public static void main(String[] args) {
        tratamentosDAO dao = new tratamentosDAO();

        tratamentosMODEL tratamentos = new tratamentosMODEL(tiposTratamento.MANUTENCAO, "30min, troca de aparelho ", 120.0);
        dao.save(tratamentos);
    }
}
