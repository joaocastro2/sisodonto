package DEV.JV.TEST_FUNCTIONS.DELETS;

import DEV.JV.DAO.agendaDAO;

public class DELETS_AGENDA {

    public static void main(String[] args) {
        agendaDAO delAgenda = new agendaDAO();
        delAgenda.delete(3L);
    }

}
