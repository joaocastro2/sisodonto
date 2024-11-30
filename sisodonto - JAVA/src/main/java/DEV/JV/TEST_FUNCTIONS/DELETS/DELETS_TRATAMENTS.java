package DEV.JV.TEST_FUNCTIONS.DELETS;

import DEV.JV.DAO.pacientesDAO;
import DEV.JV.DAO.tratamentosDAO;

public class DELETS_TRATAMENTS {

    public static void main(String[] args) {
        tratamentosDAO tratamentos = new tratamentosDAO();
        tratamentos.delete(1L);
    }

}
