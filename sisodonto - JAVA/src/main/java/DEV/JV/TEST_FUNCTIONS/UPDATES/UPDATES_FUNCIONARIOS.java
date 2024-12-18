package DEV.JV.TEST_FUNCTIONS.UPDATES;

import DEV.JV.DAO.funcionariosDAO;
import DEV.JV.MODEL.funcionariosMODEL;

import java.util.Optional;

/**
 * Classe de teste para atualizar um funcionário.
 */
public class UPDATES_FUNCIONARIOS {

    /**
     * Método principal para execução do teste de atualização do funcionário.
     *
     * @param args Argumentos da linha de comando.
     */
    public static void main(String[] args) {

        // Cria uma instância de funcionariosDAO para realizar operações no banco de dados.
        funcionariosDAO funcionarios = new funcionariosDAO();

        // Recupera um funcionário específico pelo CPF ("33333333333").
        Optional<funcionariosMODEL> funcionariosMODELOptional = funcionarios.findByCpf("33333333333");

        // Verifica se o funcionário está presente e imprime os detalhes.
        if (funcionariosMODELOptional.isPresent()) {
            funcionariosMODEL funcionario = funcionariosMODELOptional.get();
            System.out.println("CPF: " + funcionario.getCpfFuncionario());
            System.out.println("NOME: " + funcionario.getNomeFuncionario());
            System.out.println("SETOR: " + funcionario.getSetor().toString());
            System.out.println("TELEFONE: " + funcionario.getTelefone());
            System.out.println("EMAIL: " + funcionario.getEmail());
            System.out.println("CEP: " + funcionario.getCep());
            System.out.println("ENDEREÇO: " + funcionario.getEndereco());
            System.out.println("NASC: " + funcionario.getDataNascimento());
            System.out.println("ADIMISSÃO: " + funcionario.getDataAdimissao());

            // Código comentado para atualizar o nome do funcionário.
            //funcionario.setNomeFuncionario("kg");
            //funcionarios.update(funcionario);
        } else {
            System.out.println("Funcionário com CPF 33333333333 não encontrado.");
        }
    }
}
