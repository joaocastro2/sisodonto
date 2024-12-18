package DEV.JV.TEST_FUNCTIONS.UPDATES;

import DEV.JV.CLASSES_ENUM.tiposTratamento;
import DEV.JV.DAO.tratamentosDAO;
import DEV.JV.MODEL.tratamentosMODEL;

import java.util.Optional;

/**
 * Classe de teste para atualizar um tratamento.
 */
public class UPDATES_TRATAMENTS {

    /**
     * Método principal para execução do teste de atualização do tratamento.
     *
     * @param args Argumentos da linha de comando.
     */
    public static void main(String[] args) {
        // Cria uma instância de tratamentosDAO para realizar operações no banco de dados.
        tratamentosDAO dao = new tratamentosDAO();

        // Recupera um tratamento específico pelo ID.
        Optional<tratamentosMODEL> tratamentosOptional = dao.findById(1L);

        // Verifica se o tratamento está presente e imprime os detalhes.
        if (tratamentosOptional.isPresent()) {
            tratamentosMODEL tratamentos = tratamentosOptional.get();
            System.out.println("ID: " + tratamentos.getIdTratamento());
            System.out.println("DESCRIÇÃO: " + tratamentos.getDescricao());
            System.out.println("CATEGORIA: " + tratamentos.getCategoriaTratamento());
            System.out.println("CUSTO: " + tratamentos.getCusto());

            // Código comentado para atualizar o tratamento.
            //tratamentos.setDescricao("MANUTENÇÃO DE APARELHO");
            //tratamentos.setCategoriaTratamento(tiposTratamento.MANUTENCAO);
            //tratamentos.setCusto(120.0);

            dao.update(tratamentos);
        } else {
            System.out.println("Tratamento com ID 1 não encontrado.");
        }
    }
}

