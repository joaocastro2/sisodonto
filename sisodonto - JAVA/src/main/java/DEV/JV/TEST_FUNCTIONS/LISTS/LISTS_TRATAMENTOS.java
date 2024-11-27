package DEV.JV.TEST_FUNCTIONS.LISTS;

import DEV.JV.CLASSES_ENUM.tiposTratamento;
import DEV.JV.DAO.tratamentosDAO;
import DEV.JV.MODEL.tratamentosMODEL;

import java.util.List;
import java.util.Optional;

public class LISTS_TRATAMENTOS {

    public static void main(String[] args) {

          tratamentosDAO dao = new tratamentosDAO();
//        List<tratamentosMODEL> tratamentos = dao.findAll();
//        for (tratamentosMODEL tournaments : tratamentos) {
//            System.out.println("ID: " + tournaments.getIdTratamento());
//            System.out.println("CATEGORIA: " + tournaments.getCategoriaTratamento());
//            System.out.println("DESCRIÇÃO: " + tournaments.getDescricao());
//            System.out.println("CUSTO: " + tournaments.getCusto());

//            System.out.println("======================================================");
//        }

//        Optional<tratamentosMODEL> tratamentos = dao.findById(1L);

//        tratamentos.ifPresent(tratamentosMODEL -> {
//            System.out.println("ID: " + tratamentosMODEL.getIdTratamento());
//            System.out.println("CATEGORIA: " + tratamentosMODEL.getCategoriaTratamento());
//            System.out.println("DESC.: " + tratamentosMODEL.getDescricao());
//            System.out.println("CUSTO: " + tratamentosMODEL.getCusto());
//        });

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
