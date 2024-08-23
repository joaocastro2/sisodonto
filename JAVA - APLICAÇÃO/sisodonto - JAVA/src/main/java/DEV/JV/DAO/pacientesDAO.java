package DEV.JV.DAO;

import DEV.JV.INFRA.ConnectionFactory;
import DEV.JV.MODEL.pacientesMODEL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class pacientesDAO implements IpacientesDAO {

    @Override
    public pacientesMODEL save(pacientesMODEL pacientes) {

        try (Connection connection = ConnectionFactory.getConnection()){
            String sql = "INSERT INTO pacientes (cpfPaciente, nomePaciente, nascimento, sexo, cep, endereço, telefone, email)" +
                         " VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, pacientes.getCpfPaciente());
            preparedStatement.setString(2, pacientes.getNomePaciente());
            preparedStatement.setDate(3, java.sql.Date.valueOf(pacientes.getNascimento()));
            preparedStatement.setString(4, pacientes.getSexo());
            preparedStatement.setString(5, pacientes.getCep());
            preparedStatement.setString(6, pacientes.getEndereco());
            preparedStatement.setString(7, pacientes.getTelefone());
            preparedStatement.setString(8, pacientes.getEmail());

            preparedStatement.executeUpdate();

        } catch (SQLException ex){
            throw new RuntimeException(ex);
        }
        return pacientes;
    }

    @Override
    public pacientesMODEL update(pacientesMODEL pacientes) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<pacientesMODEL> findAll() {
        return List.of();
    }

    @Override
    public Optional<pacientesMODEL> findById(Long id) {
        return Optional.empty();
    }
}
