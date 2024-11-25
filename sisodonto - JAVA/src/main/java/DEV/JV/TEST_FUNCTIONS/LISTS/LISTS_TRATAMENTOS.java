package DEV.JV.TEST_FUNCTIONS.LISTS;

import DEV.JV.DAO.tratamentosDAO;
import DEV.JV.MODEL.tratamentosMODEL;

import java.util.List;

public class LISTS_TRATAMENTOS {

    public static void main(String[] args) {

        tratamentosDAO dao = new tratamentosDAO();
        List<tratamentosMODEL> tratamentos = dao.findAll();

       for (tratamentosMODEL tournaments : tratamentos) {
            System.out.println("ID: " + tournaments.getIdTratamento());
            System.out.println("CATEGORIA: " + tournaments.getCategoriaTratamento());
            System.out.println("DESCRIÇÃO: " + tournaments.getDescricao());
            System.out.println("CUSTO: " + tournaments.getCusto());

            System.out.println("======================================================");
        }
    }
}
