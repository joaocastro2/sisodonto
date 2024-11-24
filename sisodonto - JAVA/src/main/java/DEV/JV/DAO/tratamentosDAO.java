package DEV.JV.DAO;

import DEV.JV.CLASSES_ENUM.tiposTratamento;
import DEV.JV.INFRA.ConnectionFactory;
import DEV.JV.MODEL.tratamentosMODEL;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class tratamentosDAO implements ItratamentosDAO{

    @Override
    public tratamentosMODEL save(tratamentosMODEL tratamentos) {

        try (Connection connection = ConnectionFactory.getConnection()) {
            String sql = "INSERT INTO  tratamentos (categoriaTratamento, descricao, Custo)" +
                                                     "VALUES (?, ?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, tratamentos.getCategoriaTratamento().toString());
            preparedStatement.setString(2, tratamentos.getDescricao());
            preparedStatement.setDouble(3, tratamentos.getCusto());

            preparedStatement.executeUpdate();

            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            resultSet.next();

        } catch (SQLException ex){
            throw new RuntimeException();
        }

        return tratamentos;
    }

    @Override
    public tratamentosMODEL update(tratamentosMODEL tratamentos) {
        return null;
    }

    @Override
    public void delete(int idTratamento) {

    }

    @Override
    public List<tratamentosMODEL> findAll() {
        String sql = "SELECT * FROM tratamentos";

        List <tratamentosMODEL> tratamentos = new ArrayList<>();

        try (Connection connection = ConnectionFactory.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            ResultSet rs = preparedStatement.executeQuery();

            while(rs.next()){
                Long idTratamento = rs.getLong("idTratamento");
                tiposTratamento categoriaTratamento = tiposTratamento.valueOf(rs.getString("categoriaTratamento"));
                String descricao = rs.getString("descricao");
                Double custo = rs.getDouble("custo");

                tratamentosMODEL tratamento = new tratamentosMODEL(idTratamento, categoriaTratamento, descricao, custo);
                tratamentos.add(tratamento);

            }

        } catch(SQLException ex) {
            throw new RuntimeException();
        }
        return tratamentos;
    }

    @Override
    public Optional<tratamentosMODEL> findById(int idTratamento) {
        return Optional.empty();
    }
}
