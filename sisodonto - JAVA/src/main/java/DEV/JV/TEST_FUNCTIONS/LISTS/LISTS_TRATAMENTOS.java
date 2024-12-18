package DEV.JV.TEST_FUNCTIONS.LISTS;

import DEV.JV.CLASSES_ENUM.tiposTratamento;
import DEV.JV.DAO.tratamentosDAO;
import DEV.JV.MODEL.tratamentosMODEL;

import java.util.List;
import java.util.Optional;

/**
 * Classe de teste para listar tratamentos.
 */
public class LISTS_TRATAMENTOS {

    /**
     * Método principal para execução do teste de listagem dos tratamentos.
     *
     * @param args Argumentos da linha de comando.
     */
    public static void main(String[] args) {

        // Cria uma instância de tratamentosDAO para realizar operações no banco de dados.
        tratamentosDAO dao = new tratamentosDAO();

        // Código comentado para listar todos os tratamentos.
        // List<tratamentosMODEL> tratamentos = dao.findAll();
        // for (tratamentosMODEL tournaments : tratamentos) {
        //     System.out.println("ID: " + tournaments.getIdTratamento());
        //     System.out.println("CATEGORIA: " + tournaments.getCategoriaTratamento());
        //     System.out.println("DESCRIÇÃO: " + tournaments.getDescricao());
        //     System.out.println("CUSTO: " + tournaments.getCusto());
        //     System.out.println("======================================================");
        // }

        // Código comentado para listar um tratamento específico pelo ID.
        // Optional<tratamentosMODEL> tratamentos = dao.findById(1L);
        // tratamentos.ifPresent(tratamentosMODEL -> {
        //     System.out.println("ID: " + tratamentosMODEL.getIdTratamento());
        //     System.out.println("CATEGORIA: " + tratamentosMODEL.getCategoriaTratamento());
        //     System.out.println("DESC.: " + tratamentosMODEL.getDescricao());
        //     System.out.println("CUSTO: " + tratamentosMODEL.getCusto());
        // });

        // Recupera todos os tratamentos de uma categoria específica (CIRURGIA) e imprime os detalhes.
        List<tratamentosMODEL> tratamentos = dao.findByCategoria(tiposTratamento.CIRURGIA);
        for (tratamentosMODEL tournaments : tratamentos) {
            System.out.println("ID: " + tournaments.getIdTratamento());
            System.out.println("CATEGORIA: " + tournaments.getCategoriaTratamento());
            System.out.println("DESCRIÇÃO: " + tournaments.getDescricao());
            System.out.println("CUSTO: " + tournaments.getCusto());
            System.out.println("======================================================");
        }
    }
}
