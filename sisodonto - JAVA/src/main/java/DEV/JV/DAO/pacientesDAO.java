package DEV.JV.DAO;

import DEV.JV.INFRA.ConnectionFactory;
import DEV.JV.MODEL.pacientesMODEL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Classe Data Access Object (DAO) para a tabela de pacientes.
 */
public class pacientesDAO implements IpacientesDAO {

    /**
     * Salva um novo paciente no banco de dados.
     *
     * @param pacientes Objeto pacientesMODEL contendo os dados do paciente a ser salvo.
     * @return pacientesMODEL O objeto paciente após ser salvo no banco de dados.
     */
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

    /**
     * Atualiza um paciente existente no banco de dados.
     *
     * @param pacientes Objeto pacientesMODEL contendo os dados atualizados do paciente.
     * @return pacientesMODEL O objeto paciente após ser atualizado no banco de dados.
     */
    @Override
    public pacientesMODEL update(pacientesMODEL pacientes) {
        try (Connection connection = ConnectionFactory.getConnection()){
            String sql = "UPDATE pacientes SET cpfPaciente = ?, nomePaciente = ?, nascimento = ?, sexo = ?, cep = ?" +
                    ", endereço = ?, telefone = ?, email = ? WHERE cpfPaciente = ?;";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, pacientes.getCpfPaciente());
            preparedStatement.setString(2, pacientes.getNomePaciente());
            preparedStatement.setDate(3, java.sql.Date.valueOf(pacientes.getNascimento()));
            preparedStatement.setString(4, pacientes.getSexo());
            preparedStatement.setString(5, pacientes.getCep());
            preparedStatement.setString(6, pacientes.getEndereco());
            preparedStatement.setString(7, pacientes.getTelefone());
            preparedStatement.setString(8, pacientes.getEmail());
            preparedStatement.setString(9, pacientes.getCpfPaciente());

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return pacientes;
    }

    /**
     * Deleta um paciente do banco de dados com base no CPF fornecido.
     *
     * @param cpfPaciente O CPF do paciente a ser deletado.
     */
    @Override
    public void delete(String cpfPaciente) {
        try (Connection connection = ConnectionFactory.getConnection()){
            String sql = "DELETE FROM pacientes WHERE cpfPaciente = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, cpfPaciente);
            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * Encontra todos os pacientes no banco de dados.
     *
     * @return List<pacientesMODEL> Uma lista contendo todos os pacientes encontrados.
     */
    @Override
    public List<pacientesMODEL> findAll() {
        String sql = "SELECT * FROM pacientes";

        List<pacientesMODEL> pacientes = new ArrayList<>();

        try (Connection connection = ConnectionFactory.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String cpfPaciente = rs.getString("cpfPaciente");
                String nomePaciente = rs.getString("nomePaciente");
                LocalDate nascimento = rs.getDate("nascimento").toLocalDate();
                String sexo = rs.getString("sexo");
                String cep = rs.getString("cep");
                String endereco = rs.getString("endereço");
                String telefone = rs.getString("telefone");
                String email = rs.getString("email");

                pacientesMODEL paciente = new pacientesMODEL(cpfPaciente, nomePaciente, nascimento, sexo, cep, endereco, telefone, email);
                pacientes.add(paciente);
            }

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return pacientes;
    }

    /**
     * Encontra um paciente no banco de dados com base no CPF fornecido.
     *
     * @param cpfPaciente O CPF do paciente a ser encontrado.
     * @return Optional<pacientesMODEL> Um objeto Optional contendo o paciente encontrado, se houver.
     */
    @Override
    public Optional<pacientesMODEL> findByCpf(String cpfPaciente) {
        String sql = "SELECT * FROM pacientes WHERE cpfPaciente = ?";

        pacientesMODEL paciente = null;
        try (Connection connection = ConnectionFactory.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, cpfPaciente);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String pkCpf = rs.getString("cpfPaciente");
                String nomePaciente = rs.getString("nomePaciente");
                LocalDate nascimento = rs.getDate("nascimento").toLocalDate();
                String sexo = rs.getString("sexo");
                String cep = rs.getString("cep");
                String endereco = rs.getString("endereço");
                String telefone = rs.getString("telefone");
                String email = rs.getString("email");

                paciente = new pacientesMODEL(pkCpf, nomePaciente, nascimento, sexo, cep, endereco, telefone, email);
            }

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return Optional.ofNullable(paciente);
    }
}
