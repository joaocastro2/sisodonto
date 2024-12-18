package DEV.JV.DAO;

import DEV.JV.CLASSES_ENUM.tiposTratamento;
import DEV.JV.INFRA.ConnectionFactory;
import DEV.JV.MODEL.tratamentosMODEL;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Classe Data Access Object (DAO) para a tabela de tratamentos.
 * Implementa as operações CRUD (Create, Read, Update, Delete) definidas pela interface ItratamentosDAO.
 */
public class tratamentosDAO implements ItratamentosDAO {

    /**
     * Salva um novo tratamento no banco de dados.
     *
     * @param tratamentos Objeto tratamentosMODEL contendo os dados do tratamento a ser salvo.
     * @return tratamentosMODEL O objeto tratamento após ser salvo no banco de dados.
     */
    @Override
    public tratamentosMODEL save(tratamentosMODEL tratamentos) {

        try (Connection connection = ConnectionFactory.getConnection()) {
            String sql = "INSERT INTO tratamentos (categoriaTratamento, descricao, custo)" +
                    "VALUES (?, ?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, tratamentos.getCategoriaTratamento().toString());
            preparedStatement.setString(2, tratamentos.getDescricao());
            preparedStatement.setDouble(3, tratamentos.getCusto());

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

        return tratamentos;
    }

    /**
     * Atualiza um tratamento existente no banco de dados.
     *
     * @param tratamentos Objeto tratamentosMODEL contendo os dados atualizados do tratamento.
     * @return tratamentosMODEL O objeto tratamento após ser atualizado no banco de dados.
     */
    @Override
    public tratamentosMODEL update(tratamentosMODEL tratamentos) {
        try (Connection connection = ConnectionFactory.getConnection()) {
            String sql = "UPDATE tratamentos SET categoriaTratamento = ?, descricao = ?, custo = ? WHERE idTratamento = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, tratamentos.getCategoriaTratamento().toString());
            preparedStatement.setString(2, tratamentos.getDescricao());
            preparedStatement.setDouble(3, tratamentos.getCusto());
            preparedStatement.setLong(4, tratamentos.getIdTratamento());

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return tratamentos;
    }

    /**
     * Deleta um tratamento do banco de dados com base no ID fornecido.
     *
     * @param idTratamento O ID do tratamento a ser deletado.
     */
    @Override
    public void delete(Long idTratamento) {
        try (Connection connection = ConnectionFactory.getConnection()) {
            String sql = "DELETE FROM tratamentos WHERE idTratamento = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, idTratamento);
            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * Encontra todos os tratamentos no banco de dados.
     *
     * @return List<tratamentosMODEL> Uma lista contendo todos os tratamentos encontrados.
     */
    @Override
    public List<tratamentosMODEL> findAll() {
        String sql = "SELECT * FROM tratamentos";

        List<tratamentosMODEL> tratamentos = new ArrayList<>();

        try (Connection connection = ConnectionFactory.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Long idTratamento = rs.getLong("idTratamento");
                tiposTratamento categoriaTratamento = tiposTratamento.valueOf(rs.getString("categoriaTratamento"));
                String descricao = rs.getString("descricao");
                Double custo = rs.getDouble("custo");

                tratamentosMODEL tratamento = new tratamentosMODEL(idTratamento, categoriaTratamento, descricao, custo);
                tratamentos.add(tratamento);
            }

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return tratamentos;
    }

    /**
     * Encontra um tratamento no banco de dados com base no ID fornecido.
     *
     * @param idTratamento O ID do tratamento a ser encontrado.
     * @return Optional<tratamentosMODEL> Um objeto Optional contendo o tratamento encontrado, se houver.
     */
    @Override
    public Optional<tratamentosMODEL> findById(Long idTratamento) {

        String sql = "SELECT * FROM tratamentos WHERE idTratamento = ?";

        tratamentosMODEL tratamentos = null;
        try (Connection connection = ConnectionFactory.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, idTratamento);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Long idTratamento1 = rs.getLong("idTratamento");
                tiposTratamento categoriaTratamento = tiposTratamento.valueOf(rs.getString("categoriaTratamento"));
                String descricao = rs.getString("descricao");
                Double custo = rs.getDouble("custo");

                tratamentos = new tratamentosMODEL(idTratamento1, categoriaTratamento, descricao, custo);
            }

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return Optional.ofNullable(tratamentos);
    }

    /**
     * Encontra tratamentos no banco de dados com base na categoria fornecida.
     *
     * @param categoria A categoria do tratamento a ser encontrada.
     * @return List<tratamentosMODEL> Uma lista contendo todos os tratamentos encontrados na categoria fornecida.
     */
    @Override
    public List<tratamentosMODEL> findByCategoria(tiposTratamento categoria) {
        String sql = "SELECT * FROM tratamentos WHERE categoriaTratamento = ?";

        List<tratamentosMODEL> tratamentos = new ArrayList<>();

        try (Connection connection = ConnectionFactory.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, categoria.toString());

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Long idTratamento = rs.getLong("idTratamento");
                tiposTratamento categoriaTrataments = tiposTratamento.valueOf(rs.getString("categoriaTratamento"));
                String descricao = rs.getString("descricao");
                Double custo = rs.getDouble("custo");

                tratamentosMODEL tratamento = new tratamentosMODEL(idTratamento, categoriaTrataments, descricao, custo);
                tratamentos.add(tratamento);
            }

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

        return tratamentos;
    }
}
