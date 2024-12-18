package DEV.JV.TEST_FUNCTIONS.INSERTS;

import DEV.JV.DAO.pacientesDAO;
import DEV.JV.MODEL.pacientesMODEL;

import java.time.LocalDate;

/**
 * Classe de teste para inserir um novo paciente.
 */
public class INSERTS_PACIENTES {

    /**
     * Método principal para execução do teste de inserção do paciente.
     *
     * @param args Argumentos da linha de comando.
     */
    public static void main(String[] args) {
        // Cria uma instância de pacientesDAO para realizar operações no banco de dados.
        pacientesDAO insertPac = new pacientesDAO();

        // Cria uma nova instancia de pacientesMODEL.
        pacientesMODEL pacientes = new pacientesMODEL("78641646", "",
                LocalDate.of(2006, 04, 21), "", "",
                "", "", "");

        // Salva o novo paciente no banco de dados.
        insertPac.save(pacientes);
    }
}
