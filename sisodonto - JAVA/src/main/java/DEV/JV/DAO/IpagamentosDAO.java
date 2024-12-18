package DEV.JV.DAO;

import DEV.JV.MODEL.pagamentosMODEL;

import java.util.List;
import java.util.Optional;

/**
 * Interface Data Access Object (DAO) para a tabela de pagamentos.
 * Define os métodos principais para operações CRUD (Create, Read, Update, Delete).
 */
public interface IpagamentosDAO {

    /**
     * Salva um novo pagamento no banco de dados.
     *
     * @param pagamentos Objeto pagamentosMODEL contendo os dados do pagamento a ser salvo.
     * @return pagamentosMODEL O objeto pagamento após ser salvo no banco de dados.
     */
    pagamentosMODEL save(pagamentosMODEL pagamentos);

    /**
     * Atualiza um pagamento existente no banco de dados.
     *
     * @param pagamentos Objeto pagamentosMODEL contendo os dados atualizados do pagamento.
     * @return pagamentosMODEL O objeto pagamento após ser atualizado no banco de dados.
     */
    pagamentosMODEL update(pagamentosMODEL pagamentos);

    /**
     * Deleta um pagamento do banco de dados com base no ID fornecido.
     *
     * @param idPagamento O ID do pagamento a ser deletado.
     */
    void delete(Long idPagamento);

    /**
     * Encontra todos os pagamentos no banco de dados.
     *
     * @return List<pagamentosMODEL> Uma lista contendo todos os pagamentos encontrados.
     */
    List<pagamentosMODEL> findAll();

    /**
     * Encontra um pagamento no banco de dados com base no ID fornecido.
     *
     * @param idPagamento O ID do pagamento a ser encontrado.
     * @return Optional<pagamentosMODEL> Um objeto Optional contendo o pagamento encontrado, se houver.
     */
    Optional<pagamentosMODEL> findById(Long idPagamento);
}
