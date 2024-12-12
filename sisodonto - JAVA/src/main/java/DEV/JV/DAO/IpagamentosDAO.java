package DEV.JV.DAO;

import DEV.JV.MODEL.pagamentosMODEL;

import java.util.List;
import java.util.Optional;

public interface IpagamentosDAO {

    pagamentosMODEL save(pagamentosMODEL pagamentos);
    pagamentosMODEL update (pagamentosMODEL pagamentosMODEL);
    void delete (Long idPagamento);
    List<pagamentosMODEL> findAll();
    Optional<pagamentosMODEL> findById(Long idPagamento);

}
