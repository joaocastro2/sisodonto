package DEV.JV.TEST_FUNCTIONS.LISTS;

import DEV.JV.DAO.consultaDAO;
import DEV.JV.MODEL.consultaMODEL;

import java.util.Optional;

/**
 * Classe de teste para listar consultas.
 */
public class LISTS_CONSULTAS {

    /**
     * Método principal para execução do teste de listagem de consultas.
     *
     * @param args Argumentos da linha de comando.
     */
    public static void main(String[] args) {
        // Cria uma instância de consultaDAO para realizar operações no banco de dados.
        consultaDAO dao = new consultaDAO();

        /**
         * Código comentado para listar todas as consultas.
         */

        //List<consultaMODEL> consultas = dao.findAll();
        //for(consultaMODEL consulta : consultas) {
        //    System.out.println("ID DA CONSULTA: " + consulta.getIdConsulta());
        //    System.out.println("CPF DO PACIENTE: " + consulta.getFk_cpfPaciente());
        //    System.out.println("CPF DO FUNCIONARIO: " + consulta.getFk_cpfFuncionario());
        //    System.out.println("DATA MARCADA: " + consulta.getDataConsulta());
        //    System.out.println("HORA MARCADA: " + consulta.getHoraConsulta());
        //    System.out.println("TIPO DE TRATAMENTO: " + consulta.getFk_idTratamento());
        //    System.out.println("SITUAÇÃO: " + consulta.getSituacao());
        //    System.out.println("==================================================");
        //}

        // Recupera uma consulta específica pelo ID e a imprime se presente.
        Optional<consultaMODEL> consultaMODELOptional = dao.findById(1L);

        consultaMODELOptional.ifPresent(consultaMODEL -> {
            System.out.println("ID DA CONSULTA: " + consultaMODEL.getIdConsulta());
            System.out.println("CPF DO PACIENTE: " + consultaMODEL.getFk_cpfPaciente());
            System.out.println("CPF DO FUNCIONARIO: " + consultaMODEL.getFk_cpfFuncionario());
            System.out.println("DATA MARCADA: " + consultaMODEL.getDataConsulta());
            System.out.println("HORA MARCADA: " + consultaMODEL.getHoraConsulta());
            System.out.println("TIPO DE TRATAMENTO: " + consultaMODEL.getFk_idTratamento());
            System.out.println("SITUAÇÃO: " + consultaMODEL.getSituacao());
        });
    }
}
