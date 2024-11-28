package DEV.JV.TEST_FUNCTIONS.UPDATES;

import DEV.JV.CLASSES_ENUM.tiposTratamento;
import DEV.JV.DAO.tratamentosDAO;
import DEV.JV.MODEL.tratamentosMODEL;

import java.util.Optional;

public class UPDATES_TRATAMENTS {

    public static void main(String[] args) {
        tratamentosDAO dao = new tratamentosDAO();
        Optional<tratamentosMODEL> tratamentosOptional = dao.findById(1L);

        tratamentosMODEL tratamentos = tratamentosOptional.get();
        System.out.println(tratamentos.getIdTratamento());
        System.out.println(tratamentos.getDescricao());
        System.out.println(tratamentos.getCategoriaTratamento());
        System.out.println(tratamentos.getCusto());

        //tratamentos.setDescricao("MANUTENÇÃO DE APARELHO");
        //tratamentos.setCategoriaTratamento(tiposTratamento.MANUTENCAO);
        //tratamentos.setCusto(120.0);

        dao.update(tratamentos);
    }

}
