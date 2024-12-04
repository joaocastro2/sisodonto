package DEV.JV.TEST_FUNCTIONS.LISTS;

import DEV.JV.DAO.agendaDAO;
import DEV.JV.MODEL.agendaMODEL;
import DEV.JV.MODEL.funcionariosMODEL;

import java.util.List;

public class LISTS_AGENDAS {

    public static void main(String[] args) {
        agendaDAO dao = new agendaDAO();
        List<agendaMODEL> agendas = dao.findAll();
        for (agendaMODEL agenda : agendas) {
            System.out.println("ID: " + agenda.getIdAgenda());
            System.out.println("CPF: " + agenda.getFk_idFuncionario());
            System.out.println("NOME: " + agenda.getInicioAgenda());
            System.out.println("==================================================");
        }
    }
}
