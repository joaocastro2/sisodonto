package DEV.JV.TEST_FUNCTIONS.LISTS;

import DEV.JV.DAO.pagamentosDAO;
import DEV.JV.MODEL.pagamentosMODEL;

import java.util.Optional;

/**
 * Classe de teste para listar pagamentos.
 */
public class LISTS_PAGAMENTOS {

    /**
     * Método principal para execução do teste de listagem dos pagamentos.
     *
     * @param args Argumentos da linha de comando.
     */
    public static void main(String[] args) {

        // Cria uma instância de pagamentosDAO para realizar operações no banco de dados.
        pagamentosDAO dao = new pagamentosDAO();

        // Código comentado para listar todos os pagamentos.
        //List<pagamentosMODEL> pagamentos = dao.findAll();
        //for(pagamentosMODEL pagamento : pagamentos) {
        //    System.out.println("ID DO PAGAMENTO: " + pagamento.getIdPagamento());
        //    System.out.println("ID DA CONSULTA: " + pagamento.getFk_idConsulta());
        //    System.out.println("DATA DO PAGAMENTO: " + pagamento.getDataPagamento());
        //    System.out.println("VALOR: " + pagamento.getValor());
        //    System.out.println("FORMA PAGAMENTO " + pagamento.getFormaPagamento());
        //    System.out.println("SITUAÇÃO: " + pagamento.isSituacao());
        //    System.out.println("==================================================");
        //}

        // Recupera um pagamento específico pelo ID (2L) e o imprime se presente.
        Optional<pagamentosMODEL> pagamentosMODELOptional = dao.findById(2L);

        pagamentosMODELOptional.ifPresent(pagamentosMODEL -> {
            System.out.println("ID DO PAGAMENTO: " + pagamentosMODEL.getIdPagamento());
            System.out.println("ID DA CONSULTA: " + pagamentosMODEL.getFk_idConsulta());
            System.out.println("DATA DO PAGAMENTO: " + pagamentosMODEL.getDataPagamento());
            System.out.println("VALOR: " + pagamentosMODEL.getValor());
            System.out.println("FORMA PAGAMENTO: " + pagamentosMODEL.getFormaPagamento());
            System.out.println("SITUAÇÃO: " + pagamentosMODEL.isSituacao());
        });
    }
}

