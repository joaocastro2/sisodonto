package DEV.JV.TEST_FUNCTIONS.INSERTS;

import DEV.JV.DAO.agendaDAO;
import DEV.JV.MODEL.agendaMODEL;
import DEV.JV.MODEL.funcionariosMODEL;

import java.time.LocalDate;

public class INSERTS_AGENDA {

    public static void main(String[] args) {
        agendaDAO dao = new agendaDAO();
        agendaMODEL agenda = new agendaMODEL(null, "66666666666", LocalDate.of(2024, 12, 04));

        dao.save(agenda);
    }

}
