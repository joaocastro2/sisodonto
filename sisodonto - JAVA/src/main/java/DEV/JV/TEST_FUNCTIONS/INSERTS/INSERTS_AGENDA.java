package DEV.JV.TEST_FUNCTIONS.INSERTS;

import DEV.JV.DAO.agendaDAO;
import DEV.JV.MODEL.agendaMODEL;
import DEV.JV.MODEL.funcionariosMODEL;

import java.time.LocalDate;

public class INSERTS_AGENDA {

    public static void main(String[] args) {
        agendaDAO dao = new agendaDAO();
        agendaMODEL agenda = new agendaMODEL(null, "----------", LocalDate.of(2024, 12, 03));

        dao.save(agenda);
    }

}
