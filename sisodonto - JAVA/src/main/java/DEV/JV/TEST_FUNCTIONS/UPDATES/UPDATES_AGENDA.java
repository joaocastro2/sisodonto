package DEV.JV.TEST_FUNCTIONS.UPDATES;

import DEV.JV.DAO.agendaDAO;
import DEV.JV.MODEL.agendaMODEL;
import org.w3c.dom.ls.LSOutput;

import java.util.Optional;

public class UPDATES_AGENDA {

    public static void main(String[] args) {
        agendaDAO dao = new agendaDAO();
        Optional<agendaMODEL> agendaMODELOptional = dao.findById(3L);

        agendaMODEL agenda = agendaMODELOptional.get();
        System.out.println("ID: " + agenda.getIdAgenda());
        System.out.println("FUNCIONÁRIO: " + agenda.getFk_idFuncionario());
        System.out.println("INICIO DA AGENDA: " + agenda.getInicioAgenda());

        //agenda.setFk_idFuncionario("33333333333");
        //dao.update(agenda);
    }

}
