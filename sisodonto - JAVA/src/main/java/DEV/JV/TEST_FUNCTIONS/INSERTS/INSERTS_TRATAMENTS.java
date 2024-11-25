package DEV.JV.TEST_FUNCTIONS.INSERTS;

import DEV.JV.CLASSES_ENUM.tiposTratamento;
import DEV.JV.DAO.tratamentosDAO;
import DEV.JV.MODEL.tratamentosMODEL;

//import static DEV.JV.MODEL.tratamentosMODEL.contador;


public class INSERTS_TRATAMENTS {

    public static void main(String[] args) {

        tratamentosDAO dao = new tratamentosDAO();
        tratamentosMODEL tratamento = new tratamentosMODEL(null, tiposTratamento.APLICACAO, "APLICAÇÃO DE APARELHO ORTODONTICO", 180.0);
        dao.save(tratamento);

    }
}
