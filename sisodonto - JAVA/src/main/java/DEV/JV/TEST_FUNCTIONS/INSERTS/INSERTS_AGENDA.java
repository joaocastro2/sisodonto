package DEV.JV.TEST_FUNCTIONS.INSERTS;

import DEV.JV.DAO.agendaDAO;
import DEV.JV.MODEL.agendaMODEL;

import java.time.LocalDate;

/**
 * Classe de teste para inserir uma nova agenda.
 */
public class INSERTS_AGENDA {

    /**
     * Método principal para execução do teste de inserção da agenda.
     *
     * @param args Argumentos da linha de comando.
     */
    public static void main(String[] args) {
        // Cria uma instância de agendaDAO para realizar operações no banco de dados.
        agendaDAO dao = new agendaDAO();

        // Cria uma nova agendaMODEL.
        agendaMODEL agenda = new agendaMODEL(null, "", LocalDate.of(2024, 12, 04));

        // Salva a nova agenda no banco de dados.
        dao.save(agenda);
    }
}
