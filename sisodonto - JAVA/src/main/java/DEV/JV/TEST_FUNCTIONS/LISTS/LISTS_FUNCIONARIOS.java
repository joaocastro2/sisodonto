package DEV.JV.TEST_FUNCTIONS.LISTS;

import DEV.JV.DAO.funcionariosDAO;
import DEV.JV.MODEL.funcionariosMODEL;

import java.util.List;

/**
 * Classe de teste para listar todos os funcionários.
 */
public class LISTS_FUNCIONARIOS {

    /**
     * Método principal para execução do teste de listagem dos funcionários.
     *
     * @param args Argumentos da linha de comando.
     */
    public static void main(String[] args) {

        // Cria uma instância de funcionariosDAO para realizar operações no banco de dados.
        funcionariosDAO dao = new funcionariosDAO();

        // Código comentado para listar um funcionário específico pelo CPF.
        //Optional<funcionariosMODEL> funcionariosMODELOptional = dao.findByCpf("33333333333");

        //funcionariosMODELOptional.ifPresent(funcionariosMODEL -> {
        //      System.out.println("ID: " + funcionariosMODEL.getIdFuncionario());
        //      System.out.println("CPF: " + funcionariosMODEL.getCpfFuncionario());
        //      System.out.println("NOME: " + funcionariosMODEL.getNomeFuncionario());
        //      System.out.println("SETOR: " + funcionariosMODEL.getSetor());
        //});

        // Recupera todos os funcionários do banco de dados.
        List<funcionariosMODEL> funcionarios = dao.findAll();

        // Itera sobre a lista de funcionários e imprime os detalhes de cada um.
        for (funcionariosMODEL funcionario : funcionarios) {
            System.out.println("ID: " + funcionario.getIdFuncionario());
            System.out.println("CPF: " + funcionario.getCpfFuncionario());
            System.out.println("NOME: " + funcionario.getNomeFuncionario());
            System.out.println("SETOR: " + funcionario.getSetor());
            System.out.println("==================================================");
        }
    }
}
