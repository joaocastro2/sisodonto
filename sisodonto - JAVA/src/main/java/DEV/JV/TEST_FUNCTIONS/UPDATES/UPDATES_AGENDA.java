package DEV.JV.TEST_FUNCTIONS.UPDATES;

import DEV.JV.DAO.agendaDAO;
import DEV.JV.MODEL.agendaMODEL;

import java.util.Optional;

/**
 * Classe de teste para atualizar uma agenda.
 */
public class UPDATES_AGENDA {

    /**
     * Método principal para execução do teste de atualização da agenda.
     *
     * @param args Argumentos da linha de comando.
     */
    public static void main(String[] args) {
        // Cria uma instância de agendaDAO para realizar operações no banco de dados.
        agendaDAO dao = new agendaDAO();

        // Recupera uma agenda específica pelo ID (3L).
        Optional<agendaMODEL> agendaMODELOptional = dao.findById(3L);

        // Verifica se a agenda está presente e imprime os detalhes.
        if (agendaMODELOptional.isPresent()) {
            agendaMODEL agenda = agendaMODELOptional.get();
            System.out.println("ID: " + agenda.getIdAgenda());
            System.out.println("FUNCIONÁRIO: " + agenda.getFk_idFuncionario());
            System.out.println("INICIO DA AGENDA: " + agenda.getInicioAgenda());

            // Código comentado para atualizar a agenda.
            //agenda.setFk_idFuncionario("33333333333");
            //dao.update(agenda);
        } else {
            System.out.println("Agenda com ID 3 não encontrada.");
        }
    }
}
