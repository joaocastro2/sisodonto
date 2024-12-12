package DEV.JV.TEST_FUNCTIONS.LISTS;

import DEV.JV.DAO.consultaDAO;
import DEV.JV.DAO.pagamentosDAO;
import DEV.JV.MODEL.consultaMODEL;
import DEV.JV.MODEL.pagamentosMODEL;

import java.util.List;
import java.util.Optional;

public class LISTS_PAGAMENTOS {

    public static void main(String[] args) {

        pagamentosDAO dao = new pagamentosDAO();
        //List<pagamentosMODEL> pagamentos = dao.findAll();
        //    for(pagamentosMODEL pagamento : pagamentos) {
        //        System.out.println("ID DO PAGAMENTO: " + pagamento.getIdPagamento());
        //        System.out.println("ID DA CONSULTA: " + pagamento.getFk_idConsulta());
        //        System.out.println("DATA DO PAGAMENTO: " + pagamento.getDataPagamento());
        //        System.out.println("VALOR: " + pagamento.getValor());
        //        System.out.println("FORMA PAGAMENTO " + pagamento.getFormaPagamento());
        //        System.out.println("SITUAÇÃO: " + pagamento.isSituacao());
        //        System.out.println("==================================================");
        //}

        Optional<pagamentosMODEL> pagamentosMODELOptional = dao.findById(2L);

        pagamentosMODELOptional.ifPresent(pagamentosMODEL -> {
            System.out.println("ID DO PAGAMENTO: " + pagamentosMODEL.getIdPagamento());
                    System.out.println("ID DA CONSULTA: " + pagamentosMODEL.getFk_idConsulta());
                    System.out.println("DATA DO PAGAMENTO: " + pagamentosMODEL.getDataPagamento());
                    System.out.println("VALOR: " + pagamentosMODEL.getValor());
                    System.out.println("FORMA PAGAMENTO " + pagamentosMODEL.getFormaPagamento());
                    System.out.println("SITUAÇÃO: " + pagamentosMODEL.isSituacao());
        });

    }

}
