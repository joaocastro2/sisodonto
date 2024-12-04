package DEV.JV.DAO;

import DEV.JV.INFRA.ConnectionFactory;
import DEV.JV.MODEL.consultaMODEL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class consultaDAO implements IconsultaDAO{
    @Override
    public consultaMODEL save(consultaMODEL consulta) {
        String sql = "INSERT INTO consultas (fk_cpfPaciente, fk_cpfFuncionario, dataConsulta, horaConsulta, fk_idTratamento) " +
                     "VALUES (?, ?, ?, ?, ?)";

        try(Connection connection = ConnectionFactory.getConnection()){

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, consulta.getFk_cpfPaciente());
            preparedStatement.setString(2, consulta.getFk_cpfFuncionario());
            preparedStatement.setDate(3, java.sql.Date.valueOf(consulta.getDataConsulta()));
            preparedStatement.setTime(4, java.sql.Time.valueOf(consulta.getHoraConsulta()));
            preparedStatement.setLong(5, consulta.getFk_idTratamento());

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            throw new RuntimeException();
        }
        return consulta;
    }

    @Override
    public consultaMODEL update(consultaMODEL consulta) {
        return null;
    }

    @Override
    public void delete(Long idConsulta) {

    }

    @Override
    public List<consultaMODEL> findAll() {
        return List.of();
    }

    @Override
    public Optional<consultaMODEL> findById(Long idConsulta) {
        return Optional.empty();
    }
}
