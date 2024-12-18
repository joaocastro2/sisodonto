package DEV.JV.TEST_FUNCTIONS.DELETS;

import DEV.JV.DAO.pacientesDAO;

/**
 * Classe de teste para deletar um paciente específico.
 */
public class DELETS_PACIENTES {

    /**
     * Método principal para execução do teste de deleção do paciente.
     *
     * @param args Argumentos da linha de comando.
     */
    public static void main(String[] args) {
        // Cria uma instância de pacientesDAO para realizar operações no banco de dados.
        pacientesDAO pacientesDel = new pacientesDAO();

        // Deleta o paciente com o CPF especificado. Aqui, o CPF está vazio.
        // Substitua "" pelo CPF real do paciente a ser deletado.
        pacientesDel.delete("");
    }
}
