package DEV.JV.DAO;

import DEV.JV.MODEL.agendaMODEL;

import java.util.List;
import java.util.Optional;

/**
 * Interface Data Access Object (DAO) para a tabela de agendas.
 * Define os métodos principais para operações CRUD (Create, Read, Update, Delete).
 */
public interface IagendaDAO {

    /**
     * Salva uma nova agenda no banco de dados.
     *
     * @param agenda Objeto agendaMODEL contendo os dados da agenda a ser salva.
     * @return agendaMODEL O objeto agenda após ser salvo no banco de dados.
     */
    agendaMODEL save(agendaMODEL agenda);

    /**
     * Atualiza uma agenda existente no banco de dados.
     *
     * @param agenda Objeto agendaMODEL contendo os dados atualizados da agenda.
     * @return agendaMODEL O objeto agenda após ser atualizado no banco de dados.
     */
    agendaMODEL update(agendaMODEL agenda);

    /**
     * Deleta uma agenda do banco de dados com base no ID fornecido.
     *
     * @param idAgenda O ID da agenda a ser deletada.
     */
    void delete(Long idAgenda);

    /**
     * Encontra todas as agendas no banco de dados.
     *
     * @return List<agendaMODEL> Uma lista contendo todas as agendas encontradas.
     */
    List<agendaMODEL> findAll();

    /**
     * Encontra uma agenda no banco de dados com base no ID fornecido.
     *
     * @param idAgenda O ID da agenda a ser encontrada.
     * @return Optional<agendaMODEL> Um objeto Optional contendo a agenda encontrada, se houver.
     */
    Optional<agendaMODEL> findById(Long idAgenda);
}
