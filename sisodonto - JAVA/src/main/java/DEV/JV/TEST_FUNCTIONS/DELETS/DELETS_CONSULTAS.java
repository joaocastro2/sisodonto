package DEV.JV.TEST_FUNCTIONS.DELETS;

import DEV.JV.DAO.consultaDAO;

public class DELETS_CONSULTAS {

    public static void main(String[] args) {
        
        consultaDAO consultaDEL = new consultaDAO();
        consultaDEL.delete(3L);
    }
}
