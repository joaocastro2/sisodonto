package DEV.JV.DAO;

import DEV.JV.INFRA.ConnectionFactory;
import DEV.JV.MODEL.consultaMODEL;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class consultaDAO implements IconsultaDAO{
    @Override
    public consultaMODEL save(consultaMODEL consulta) {
        String sql = "INSERT INTO consultas (fk_cpfPaciente, fk_cpfFuncionario, dataConsulta, horaConsulta, fk_idTratamento, situacao) " +
                     "VALUES (?, ?, ?, ?, ?, ?)";

        try(Connection connection = ConnectionFactory.getConnection()){

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, consulta.getFk_cpfPaciente());
            preparedStatement.setString(2, consulta.getFk_cpfFuncionario());
            preparedStatement.setDate(3, java.sql.Date.valueOf(consulta.getDataConsulta()));
            preparedStatement.setTime(4, java.sql.Time.valueOf(consulta.getHoraConsulta()));
            preparedStatement.setLong(5, consulta.getFk_idTratamento());
            preparedStatement.setBoolean(6, consulta.getSituacao());

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

        String sql = "SELECT * FROM consultas";

        List<consultaMODEL> consulta = new ArrayList<>();

        try(Connection connection = ConnectionFactory.getConnection()){

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
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

        } catch (SQLException ex){
            throw new RuntimeException();
        }
        return consulta;
    }

    @Override
    public Optional<consultaMODEL> findById(Long idConsulta) {
        return Optional.empty();
    }
}
