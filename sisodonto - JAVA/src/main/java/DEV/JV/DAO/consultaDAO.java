package DEV.JV.DAO;

import DEV.JV.INFRA.ConnectionFactory;
import DEV.JV.MODEL.consultaMODEL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Classe Data Access Object (DAO) para a tabela de consultas.
 */
public class consultaDAO implements IconsultaDAO {

    /**
     * Salva uma nova consulta no banco de dados.
     *
     * @param consulta Objeto consultaMODEL contendo os dados da consulta a ser salva.
     * @return consultaMODEL O objeto consulta após ser salvo no banco de dados.
     */
    @Override
    public consultaMODEL save(consultaMODEL consulta) {
        String sql = "INSERT INTO consultas (fk_cpfPaciente, fk_cpfFuncionario, dataConsulta, horaConsulta, fk_idTratamento, situacao) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection connection = ConnectionFactory.getConnection()) {

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, consulta.getFk_cpfPaciente());
            preparedStatement.setString(2, consulta.getFk_cpfFuncionario());
            preparedStatement.setDate(3, java.sql.Date.valueOf(consulta.getDataConsulta()));
            preparedStatement.setTime(4, java.sql.Time.valueOf(consulta.getHoraConsulta()));
            preparedStatement.setLong(5, consulta.getFk_idTratamento());
            preparedStatement.setBoolean(6, consulta.getSituacao());

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return consulta;
    }

    /**
     * Atualiza uma consulta existente no banco de dados.
     *
     * @param consulta Objeto consultaMODEL contendo os dados atualizados da consulta.
     * @return consultaMODEL O objeto consulta após ser atualizado no banco de dados.
     */
    @Override
    public consultaMODEL update(consultaMODEL consulta) {
        try (Connection connection = ConnectionFactory.getConnection()) {

            String sql = "UPDATE consultas SET fk_cpfPaciente = ?, fk_cpfFuncionario = ?, dataConsulta = ?, horaConsulta = ?, fk_idTratamento = ?, " +
                    "situacao = ? WHERE idConsulta = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, consulta.getFk_cpfPaciente());
            preparedStatement.setString(2, consulta.getFk_cpfFuncionario());
            preparedStatement.setDate(3, java.sql.Date.valueOf(consulta.getDataConsulta()));
            preparedStatement.setTime(4, java.sql.Time.valueOf(consulta.getHoraConsulta()));
            preparedStatement.setLong(5, consulta.getFk_idTratamento());
            preparedStatement.setBoolean(6, consulta.getSituacao());
            preparedStatement.setLong(7, consulta.getIdConsulta());

            preparedStatement.executeUpdate();

        } catch (SQLException exc) {
            throw new RuntimeException(exc);
        }
        return consulta;
    }

    /**
     * Deleta uma consulta do banco de dados com base no ID fornecido.
     *
     * @param idConsulta O ID da consulta a ser deletada.
     */
    @Override
    public void delete(Long idConsulta) {
        try (Connection connection = ConnectionFactory.getConnection()) {

            String sql = "DELETE FROM consultas WHERE idConsulta = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, idConsulta);
            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * Encontra todas as consultas no banco de dados.
     *
     * @return List<consultaMODEL> Uma lista contendo todas as consultas encontradas.
     */
    @Override
    public List<consultaMODEL> findAll() {

        String sql = "SELECT * FROM consultas";

        List<consultaMODEL> consulta = new ArrayList<>();

        try (Connection connection = ConnectionFactory.getConnection()) {

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Long idConsulta = rs.getLong("idConsulta");
                String cpfPac = rs.getString("fk_cpfPaciente");
                String cpfFunc = rs.getString("fk_cpfFuncionario");
                LocalDate dataConsulta = rs.getDate("dataConsulta").toLocalDate();
                LocalTime horaConsulta = rs.getTime("horaConsulta").toLocalTime();
                Long idTrat = rs.getLong("fk_idTratamento");
                Boolean situacao1 = rs.getBoolean("situacao");

                consultaMODEL consultas = new consultaMODEL(idConsulta, cpfPac, cpfFunc, dataConsulta, horaConsulta, idTrat, situacao1);
                consulta.add(consultas);
            }

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return consulta;
    }

    /**
     * Encontra uma consulta no banco de dados com base no ID fornecido.
     *
     * @param idConsulta O ID da consulta a ser encontrada.
     * @return Optional<consultaMODEL> Um objeto Optional contendo a consulta encontrada, se houver.
     */
    @Override
    public Optional<consultaMODEL> findById(Long idConsulta) {
        String sql = "SELECT * FROM consultas WHERE idConsulta = ?";

        consultaMODEL consulta = null;

        try (Connection connection = ConnectionFactory.getConnection()) {

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, idConsulta);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Long idConsulta1 = rs.getLong("idConsulta");
                String cpfPac = rs.getString("fk_cpfPaciente");
                String cpfFunc = rs.getString("fk_cpfFuncionario");
                LocalDate dataConsulta = rs.getDate("dataConsulta").toLocalDate();
                LocalTime horaConsulta = rs.getTime("horaConsulta").toLocalTime();
                Long idTrat = rs.getLong("fk_idTratamento");
                Boolean situacao1 = rs.getBoolean("situacao");

                consulta = new consultaMODEL(idConsulta1, cpfPac, cpfFunc, dataConsulta, horaConsulta, idTrat, situacao1);
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return Optional.ofNullable(consulta);
    }
}
