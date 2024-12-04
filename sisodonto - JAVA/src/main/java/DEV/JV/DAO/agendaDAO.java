package DEV.JV.DAO;

import DEV.JV.INFRA.ConnectionFactory;
import DEV.JV.MODEL.agendaMODEL;
import DEV.JV.MODEL.funcionariosMODEL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
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
        String sql = "SELECT * FROM agendas";

        List<agendaMODEL> agendas = new ArrayList<>();

        try(Connection connection = ConnectionFactory.getConnection()){

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Long idAgenda = rs.getLong("idAgenda");
                String cpfFuncionario = rs.getString("fk_cpfFuncionario");
                LocalDate inicioAgenda = rs.getDate("inicioAgenda").toLocalDate();

                agendaMODEL agenda = new agendaMODEL(idAgenda, cpfFuncionario, inicioAgenda);
                agendas.add(agenda);

            }
        } catch (SQLException ex) {
            throw new RuntimeException();
        }
        return agendas;
    }

    @Override
    public Optional<agendaMODEL> findById(Long idAgenda) {
        return Optional.empty();
    }
}
