package DEV.JV.TEST_FUNCTIONS.DELETS;

import DEV.JV.DAO.agendaDAO;

/**
 * Classe de teste para deletar uma agenda específica.
 */
public class DELETS_AGENDA {

    /**
     * Método principal para execução do teste de deleção da agenda.
     * @param args Argumentos da linha de comando.
     */
    public static void main(String[] args) {
        agendaDAO delAgenda = new agendaDAO();

        // Deleta a agenda com ID específico .
        delAgenda.delete(3L);
    }
}
