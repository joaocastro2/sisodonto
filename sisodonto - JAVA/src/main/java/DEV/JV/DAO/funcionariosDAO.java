package DEV.JV.DAO;

import DEV.JV.INFRA.ConnectionFactory;
import DEV.JV.MODEL.funcionariosMODEL;
import DEV.JV.MODEL.tratamentosMODEL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class funcionariosDAO implements IfuncionariosDAO{


    @Override
    public funcionariosMODEL save(funcionariosMODEL funcionarios) {
        String sql = "INSERT INTO funcionarios (cpfFuncionario, nomeFuncionario, setor, telefone, email, cep, endereco, dataNascimento, dataAdimissao)" +
                                                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection connection = ConnectionFactory.getConnection()) {

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, funcionarios.getCpfFuncionario());
            preparedStatement.setString(2, funcionarios.getNomeFuncionario());
            preparedStatement.setString(3, funcionarios.getSetor().toString());
            preparedStatement.setString(4, funcionarios.getTelefone());
            preparedStatement.setString(5, funcionarios.getEmail());
            preparedStatement.setString(6, funcionarios.getCep());
            preparedStatement.setString(7, funcionarios.getEndereco());
            preparedStatement.setDate(8, java.sql.Date.valueOf(funcionarios.getDataNascimento()));
            preparedStatement.setDate(9, java.sql.Date.valueOf(funcionarios.getDataAdimissao()));

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return funcionarios;
    }

    @Override
    public funcionariosMODEL update(funcionariosMODEL funcionarios) {
        return null;
    }

    @Override
    public void delete(String cpfFuncionario) {

    }

    @Override
    public List<tratamentosMODEL> findAll() {
        return List.of();
    }

    @Override
    public Optional<funcionariosMODEL> findByCpf(String cpfFuncionario) {
        return Optional.empty();
    }
}
