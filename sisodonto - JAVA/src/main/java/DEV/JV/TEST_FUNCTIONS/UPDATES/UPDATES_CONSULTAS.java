package DEV.JV.TEST_FUNCTIONS.UPDATES;

import DEV.JV.DAO.consultaDAO;
import DEV.JV.MODEL.consultaMODEL;

import java.util.Optional;

/**
 * Classe de teste para atualizar uma consulta.
 */
public class UPDATES_CONSULTAS {

    /**
     * Método principal para execução do teste de atualização da consulta.
     *
     * @param args Argumentos da linha de comando.
     */
    public static void main(String[] args) {

        // Cria uma instância de consultaDAO para realizar operações no banco de dados.
        consultaDAO dao = new consultaDAO();

        // Recupera uma consulta específica pelo ID (1L).
        Optional<consultaMODEL> consultaMODELOptional = dao.findById(1L);

        // Verifica se a consulta está presente e imprime os detalhes.
        if (consultaMODELOptional.isPresent()) {
            consultaMODEL consulta = consultaMODELOptional.get();
            System.out.println("ID DA CONSULTA: " + consulta.getIdConsulta());
            System.out.println("CPF DO PACIENTE: " + consulta.getFk_cpfPaciente());
            System.out.println("CPF DO FUNCIONARIO: " + consulta.getFk_cpfFuncionario());
            System.out.println("DATA MARCADA: " + consulta.getDataConsulta());
            System.out.println("HORA MARCADA: " + consulta.getHoraConsulta());
            System.out.println("TIPO DE TRATAMENTO: " + consulta.getFk_idTratamento());
            System.out.println("SITUAÇÃO: " + consulta.getSituacao());

            // Código comentado para atualizar a situação da consulta.
            // consulta.setSituacao(true);
            // dao.update(consulta);
        } else {
            System.out.println("Consulta com ID 1 não encontrada.");
        }
    }
}
