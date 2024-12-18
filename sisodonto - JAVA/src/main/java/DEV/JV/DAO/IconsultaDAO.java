package DEV.JV.DAO;

import DEV.JV.MODEL.consultaMODEL;

import java.util.List;
import java.util.Optional;

/**
 * Interface Data Access Object (DAO) para a tabela de consultas.
 * Define os métodos principais para operações CRUD (Create, Read, Update, Delete).
 */
public interface IconsultaDAO {

    /**
     * Salva uma nova consulta no banco de dados.
     *
     * @param consulta Objeto consultaMODEL contendo os dados da consulta a ser salva.
     * @return consultaMODEL O objeto consulta após ser salvo no banco de dados.
     */
    consultaMODEL save(consultaMODEL consulta);

    /**
     * Atualiza uma consulta existente no banco de dados.
     *
     * @param consulta Objeto consultaMODEL contendo os dados atualizados da consulta.
     * @return consultaMODEL O objeto consulta após ser atualizado no banco de dados.
     */
    consultaMODEL update(consultaMODEL consulta);

    /**
     * Deleta uma consulta do banco de dados com base no ID fornecido.
     *
     * @param idConsulta O ID da consulta a ser deletada.
     */
    void delete(Long idConsulta);

    /**
     * Encontra todas as consultas no banco de dados.
     *
     * @return List<consultaMODEL> Uma lista contendo todas as consultas encontradas.
     */
    List<consultaMODEL> findAll();

    /**
     * Encontra uma consulta no banco de dados com base no ID fornecido.
     *
     * @param idConsulta O ID da consulta a ser encontrada.
     * @return Optional<consultaMODEL> Um objeto Optional contendo a consulta encontrada, se houver.
     */
    Optional<consultaMODEL> findById(Long idConsulta);
}
