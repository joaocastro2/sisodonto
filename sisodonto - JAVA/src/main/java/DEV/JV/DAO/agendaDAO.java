package DEV.JV.DAO;

import DEV.JV.INFRA.ConnectionFactory;
import DEV.JV.MODEL.agendaMODEL;

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
        try (Connection connection = ConnectionFactory.getConnection()) {

            String sql = "UPDATE agendas SET fk_cpfFuncionario = ?, inicioAgenda = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, agenda.getFk_idFuncionario());
            preparedStatement.setDate(2, java.sql.Date.valueOf(agenda.getInicioAgenda()));

            preparedStatement.executeUpdate();
        } catch(SQLException ex){
            throw new RuntimeException();
        }
        return agenda;
    }

    @Override
    public void delete(Long idAgenda) {
        try (Connection connection = ConnectionFactory.getConnection()) {
            String sql = "DELETE FROM agendas WHERE idAgenda = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, idAgenda);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            throw new RuntimeException();
        }
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
        String sql = "SELECT * FROM agendas WHERE idAgenda = ?";

        agendaMODEL agendas = null;

        try(Connection connection = ConnectionFactory.getConnection()){

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, idAgenda);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Long idAgenda2 = rs.getLong("idAgenda");
                String fk_cpfFuncionario = rs.getString("fk_cpfFuncionario");
                LocalDate inicioAgenda = rs.getDate("inicioAgenda").toLocalDate();

                agendas = new agendaMODEL(idAgenda2, fk_cpfFuncionario, inicioAgenda);
            }
        } catch (SQLException ex){
            throw new RuntimeException();
        }
        return Optional.ofNullable(agendas);
    }
}
