package DEV.JV.DAO;

import DEV.JV.INFRA.ConnectionFactory;
import DEV.JV.MODEL.agendaMODEL;
import DEV.JV.MODEL.funcionariosMODEL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class agendaDAO implements IagendaDAO{


    @Override
    public agendaMODEL save(agendaMODEL agenda) {
        String sql = "INSERT INTO agendas (fk_cpfFuncionario, inicioAgenda) " +
                     "VALUES (?, ?)";

        try (Connection connection = ConnectionFactory.getConnection()) {

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, agenda.getFk_idFuncionario());
            preparedStatement.setDate(2, java.sql.Date.valueOf(agenda.getInicioAgenda()));

            preparedStatement.executeUpdate();

        } catch (SQLException exception){
            throw new RuntimeException();
        }
        return agenda;
    }

    @Override
    public agendaMODEL update(agendaMODEL agenda) {
        return null;
    }

    @Override
    public agendaMODEL delete(Long idAgenda) {
        return null;
    }

    @Override
    public List<agendaMODEL> findAll() {
        return List.of();
    }

    @Override
    public Optional<agendaMODEL> findById(Long idAgenda) {
        return Optional.empty();
    }
}
