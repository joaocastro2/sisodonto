package DEV.JV.DAO;

import DEV.JV.MODEL.pacientesMODEL;
import java.util.List;
import java.util.Optional;

/**
 * Interface Data Access Object (DAO) para a tabela de pacientes.
 * Define os métodos principais para operações CRUD (Create, Read, Update, Delete).
 */
public interface IpacientesDAO {

    /**
     * Salva um novo paciente no banco de dados.
     *
     * @param pacientes Objeto pacientesMODEL contendo os dados do paciente a ser salvo.
     * @return pacientesMODEL O objeto paciente após ser salvo no banco de dados.
     */
    pacientesMODEL save(pacientesMODEL pacientes);

    /**
     * Atualiza um paciente existente no banco de dados.
     *
     * @param pacientes Objeto pacientesMODEL contendo os dados atualizados do paciente.
     * @return pacientesMODEL O objeto paciente após ser atualizado no banco de dados.
     */
    pacientesMODEL update(pacientesMODEL pacientes);

    /**
     * Deleta um paciente do banco de dados com base no CPF fornecido.
     *
     * @param cpfPaciente O CPF do paciente a ser deletado.
     */
    void delete(String cpfPaciente);

    /**
     * Encontra todos os pacientes no banco de dados.
     *
     * @return List<pacientesMODEL> Uma lista contendo todos os pacientes encontrados.
     */
    List<pacientesMODEL> findAll();

    /**
     * Encontra um paciente no banco de dados com base no CPF fornecido.
     *
     * @param cpfPaciente O CPF do paciente a ser encontrado.
     * @return Optional<pacientesMODEL> Um objeto Optional contendo o paciente encontrado, se houver.
     */
    Optional<pacientesMODEL> findByCpf(String cpfPaciente);
}
