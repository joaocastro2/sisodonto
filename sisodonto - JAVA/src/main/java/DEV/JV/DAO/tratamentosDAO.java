package DEV.JV.DAO;

import DEV.JV.INFRA.ConnectionFactory;
import DEV.JV.MODEL.tratamentosMODEL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
        return null;
    }

    @Override
    public void delete(int idTratamento) {

    }

    @Override
    public List<tratamentosMODEL> findALL() {
        return List.of();
    }

    @Override
    public Optional<tratamentosMODEL> findById(int idTratamento) {
        return Optional.empty();
    }
}
