package DEV.JV.TEST_FUNCTIONS.DELETS;

import DEV.JV.DAO.pagamentosDAO;
import DEV.JV.DAO.tratamentosDAO;

public class DELETS_PAGAMENTOS {

    public static void main(String[] args) {

    pagamentosDAO pagamentos = new pagamentosDAO();
        pagamentos.delete(2L);
    }
}
