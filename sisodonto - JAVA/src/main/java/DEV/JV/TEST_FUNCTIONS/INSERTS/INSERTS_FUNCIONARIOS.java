package DEV.JV.TEST_FUNCTIONS.INSERTS;

import DEV.JV.CLASSES_ENUM.setores;
import DEV.JV.DAO.funcionariosDAO;
import DEV.JV.MODEL.funcionariosMODEL;

import java.time.LocalDate;

/**
 * Classe de teste para inserir um novo funcionário.
 */
public class INSERTS_FUNCIONARIOS {

    /**
     * Método principal para execução do teste de inserção do funcionário.
     *
     * @param args Argumentos da linha de comando.
     */
    public static void main(String[] args) {

        // Cria uma instância de funcionariosDAO para realizar operações no banco de dados.
        funcionariosDAO dao = new funcionariosDAO();

        // Cria uma nova instancia de funcionariosMODEL.
        funcionariosMODEL funcionarios = new funcionariosMODEL(null, "44444444444", "JV", setores.OUTROS,
                "0000000000", "teste@gmail.com", "88888888", "qd 8 lt 12 - aguas lindas",
                /* NASCIMENTO: */ LocalDate.of(2024, 12, 01),
                /* ADIMISSÃO: */ LocalDate.of(2024, 12, 01));

        // Salva o novo funcionário no banco de dados.
        dao.save(funcionarios);
    }
}
