package DEV.JV.TEST_FUNCTIONS.LISTS;

import DEV.JV.DAO.agendaDAO;
import DEV.JV.MODEL.agendaMODEL;
import DEV.JV.MODEL.consultaMODEL;

import java.util.List;
import java.util.Optional;

/**
 * Classe de teste para listar todas as agendas.
 */
public class LISTS_AGENDAS {

    /**
     * Método principal para execução do teste de listagem das agendas.
     *
     * @param args Argumentos da linha de comando.
     */
    public static void main(String[] args) {
        // Cria uma instância de agendaDAO para realizar operações no banco de dados.
        agendaDAO dao = new agendaDAO();

        // Recupera todas as agendas do banco de dados.
        List<agendaMODEL> agendas = dao.findAll();

        // Itera sobre a lista de agendas e imprime os detalhes de cada uma.
        for (agendaMODEL agenda : agendas) {
            System.out.println("ID: " + agenda.getIdAgenda());
            System.out.println("CPF: " + agenda.getFk_idFuncionario());
            System.out.println("INÍCIO: " + agenda.getInicioAgenda());
            System.out.println("==================================================");
        }
    }
}