package DEV.JV.DAO;

import DEV.JV.CLASSES_ENUM.setores;
import DEV.JV.INFRA.ConnectionFactory;
import DEV.JV.MODEL.funcionariosMODEL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
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
        try (Connection connection = ConnectionFactory.getConnection()){
            String sql = "UPDATE funcionarios SET cpfFuncionario = ?, nomeFuncionario = ?, setor = ?, telefone = ?, " +
                         "email = ?, cep = ?, endereco = ?, dataNascimento = ?, dataAdimissao = ?" +
                         "WHERE cpfFuncionario = ?;";

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
            preparedStatement.setString(10, funcionarios.getCpfFuncionario());

            preparedStatement.executeUpdate();

        } catch (SQLException ex){
            throw new RuntimeException();
        }
        return funcionarios;
    }

    @Override
    public void delete(String cpfFuncionario) {
        try (Connection connection = ConnectionFactory.getConnection()){
            String sql = "DELETE FROM funcionarios WHERE cpfFuncionario = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, cpfFuncionario);
            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public List<funcionariosMODEL> findAll() {
        String sql = "SELECT * FROM funcionarios";

        List<funcionariosMODEL> funcionarios = new ArrayList<>();

        try (Connection connection = ConnectionFactory.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Long idFuncionario = rs.getLong("idFuncionario");
                String cpfFunc = rs.getString("cpfFuncionario");
                String nome = rs.getString("nomeFuncionario");
                setores setor = setores.valueOf(rs.getString("setor"));
                String telefone = rs.getString("telefone");
                String email = rs.getString("email");
                String cep = rs.getString("cep");
                String endereco = rs.getString("endereco");
                LocalDate dataNasc = rs.getDate("dataNascimento").toLocalDate();
                LocalDate dataAdm = rs.getDate("dataAdimissao").toLocalDate();

                funcionariosMODEL funcionario = new funcionariosMODEL(idFuncionario, cpfFunc, nome, setor, telefone, email, cep, endereco, dataNasc, dataAdm);
                funcionarios.add(funcionario);
            }
        } catch (SQLException ex){
            throw new RuntimeException();
        }
        return funcionarios;
    }

    @Override
    public Optional<funcionariosMODEL> findByCpf(String cpfFuncionario) {
        String sql = "SELECT * FROM funcionarios WHERE cpfFuncionario = ?";

        funcionariosMODEL funcionario = null;

        try(Connection connection = ConnectionFactory.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, cpfFuncionario);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                Long idFuncionario = rs.getLong("idFuncionario");
                String cpfFunc = rs.getString("cpfFuncionario");
                String nome = rs.getString("nomeFuncionario");
                setores setor = setores.valueOf(rs.getString("setor"));
                String telefone = rs.getString("telefone");
                String email = rs.getString("email");
                String cep = rs.getString("cep");
                String endereco = rs.getString("endereco");
                LocalDate dataNasc = rs.getDate("dataNascimento").toLocalDate();
                LocalDate dataAdm = rs.getDate("dataAdimissao").toLocalDate();

                funcionario = new funcionariosMODEL(idFuncionario, cpfFunc, nome, setor, telefone, email, cep, endereco, dataNasc, dataAdm);
            }
        } catch (SQLException ex){
            throw new RuntimeException();
        }
        return Optional.ofNullable(funcionario);
    }
}
