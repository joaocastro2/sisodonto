package DEV.JV.TEST_FUNCTIONS.INSERTS;

import DEV.JV.DAO.consultaDAO;
import DEV.JV.MODEL.consultaMODEL;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Classe de teste para inserir uma nova consulta.
 */
public class INSERTS_CONSULTA {

    /**
     * Método principal para execução do teste de inserção da consulta.
     *
     * @param args Argumentos da linha de comando.
     */
    public static void main(String[] args) {
        // Cria uma instância de consultaDAO para realizar operações no banco de dados.
        consultaDAO dao = new consultaDAO();

        // Cria uma nova consultaMODEL.
        consultaMODEL consulta = new consultaMODEL(null, "22222222222", "66666666666",
                LocalDate.of(2024, 12, 05), LocalTime.of(14, 30, 00),
                4L, false);

        // Salva a nova consulta no banco de dados.
        dao.save(consulta);
    }
}
