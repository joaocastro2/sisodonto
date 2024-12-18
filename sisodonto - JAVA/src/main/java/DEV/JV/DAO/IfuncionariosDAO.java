package DEV.JV.DAO;

import DEV.JV.MODEL.funcionariosMODEL;

import java.util.List;
import java.util.Optional;

/**
 * Interface Data Access Object (DAO) para a tabela de funcionários.
 * Define os métodos principais para operações CRUD (Create, Read, Update, Delete).
 */
public interface IfuncionariosDAO {

    /**
     * Salva um novo funcionário no banco de dados.
     *
     * @param funcionarios Objeto funcionariosMODEL contendo os dados do funcionário a ser salvo.
     * @return funcionariosMODEL O objeto funcionário após ser salvo no banco de dados.
     */
    funcionariosMODEL save(funcionariosMODEL funcionarios);

    /**
     * Atualiza um funcionário existente no banco de dados.
     *
     * @param funcionarios Objeto funcionariosMODEL contendo os dados atualizados do funcionário.
     * @return funcionariosMODEL O objeto funcionário após ser atualizado no banco de dados.
     */
    funcionariosMODEL update(funcionariosMODEL funcionarios);

    /**
     * Deleta um funcionário do banco de dados com base no CPF fornecido.
     *
     * @param cpfFuncionario O CPF do funcionário a ser deletado.
     */
    void delete(String cpfFuncionario);

    /**
     * Encontra todos os funcionários no banco de dados.
     *
     * @return List<funcionariosMODEL> Uma lista contendo todos os funcionários encontrados.
     */
    List<funcionariosMODEL> findAll();

    /**
     * Encontra um funcionário no banco de dados com base no CPF fornecido.
     *
     * @param cpfFuncionario O CPF do funcionário a ser encontrado.
     * @return Optional<funcionariosMODEL> Um objeto Optional contendo o funcionário encontrado, se houver.
     */
    Optional<funcionariosMODEL> findByCpf(String cpfFuncionario);
}
