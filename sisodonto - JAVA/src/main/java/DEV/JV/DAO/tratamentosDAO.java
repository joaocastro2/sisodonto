package DEV.JV.DAO;

import DEV.JV.CLASSES_ENUM.tiposTratamento;
import DEV.JV.INFRA.ConnectionFactory;
import DEV.JV.MODEL.pacientesMODEL;
import DEV.JV.MODEL.tratamentosMODEL;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class tratamentosDAO implements ItratamentosDAO{

    @Override
    public tratamentosMODEL save(tratamentosMODEL tratamentos) {

        try (Connection connection = ConnectionFactory.getConnection()) {
            String sql = "INSERT INTO  tratamentos (categoriaTratamento, descricao, Custo)" +
                                                     "VALUES (?, ?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, tratamentos.getCategoriaTratamento().toString());
            preparedStatement.setString(2, tratamentos.getDescricao());
            preparedStatement.setDouble(3, tratamentos.getCusto());

            preparedStatement.executeUpdate();

        } catch (SQLException ex){
            throw new RuntimeException();
        }

        return tratamentos;
    }

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
            throw new RuntimeException();
        }
        return tratamentos;
    }

    @Override
    public void delete(Long idTratamento) {
        try (Connection connection = ConnectionFactory.getConnection()){
            String sql = "DELETE FROM tratamentos WHERE idTratamento = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, idTratamento);
            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

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
