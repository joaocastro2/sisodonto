package DEV.JV.DAO;

import DEV.JV.CLASSES_ENUM.tiposTratamento;
import DEV.JV.MODEL.tratamentosMODEL;

import java.util.List;
import java.util.Optional;

/**
 * Interface Data Access Object (DAO) para a tabela de tratamentos.
 * Define os métodos principais para operações CRUD (Create, Read, Update, Delete).
 */
public interface ItratamentosDAO {

    /**
     * Salva um novo tratamento no banco de dados.
     *
     * @param tratamentos Objeto tratamentosMODEL contendo os dados do tratamento a ser salvo.
     * @return tratamentosMODEL O objeto tratamento após ser salvo no banco de dados.
     */
    tratamentosMODEL save(tratamentosMODEL tratamentos);

    /**
     * Atualiza um tratamento existente no banco de dados.
     *
     * @param tratamentos Objeto tratamentosMODEL contendo os dados atualizados do tratamento.
     * @return tratamentosMODEL O objeto tratamento após ser atualizado no banco de dados.
     */
    tratamentosMODEL update(tratamentosMODEL tratamentos);

    /**
     * Deleta um tratamento do banco de dados com base no ID fornecido.
     *
     * @param idTratamento O ID do tratamento a ser deletado.
     */
    void delete(Long idTratamento);

    /**
     * Encontra todos os tratamentos no banco de dados.
     *
     * @return List<tratamentosMODEL> Uma lista contendo todos os tratamentos encontrados.
     */
    List<tratamentosMODEL> findAll();

    /**
     * Encontra um tratamento no banco de dados com base no ID fornecido.
     *
     * @param idTratamento O ID do tratamento a ser encontrado.
     * @return Optional<tratamentosMODEL> Um objeto Optional contendo o tratamento encontrado, se houver.
     */
    Optional<tratamentosMODEL> findById(Long idTratamento);

    /**
     * Encontra tratamentos no banco de dados com base na categoria fornecida.
     *
     * @param categoria A categoria do tratamento a ser encontrada.
     * @return List<tratamentosMODEL> Uma lista contendo todos os tratamentos encontrados na categoria fornecida.
     */
    List<tratamentosMODEL> findByCategoria(tiposTratamento categoria);

}
