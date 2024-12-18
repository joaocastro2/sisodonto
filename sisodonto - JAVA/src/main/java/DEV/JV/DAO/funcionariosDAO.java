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

/**
 * Classe Data Access Object (DAO) para a tabela de funcionários.
 */
public class funcionariosDAO implements IfuncionariosDAO {

    /**
     * Salva um novo funcionário no banco de dados.
     *
     * @param funcionarios Objeto funcionariosMODEL contendo os dados do funcionário a ser salvo.
     * @return funcionariosMODEL O objeto funcionário após ser salvo no banco de dados.
     */
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

    /**
     * Atualiza um funcionário existente no banco de dados.
     *
     * @param funcionarios Objeto funcionariosMODEL contendo os dados atualizados do funcionário.
     * @return funcionariosMODEL O objeto funcionário após ser atualizado no banco de dados.
     */
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
            throw new RuntimeException(ex);
        }
        return funcionarios;
    }

    /**
     * Deleta um funcionário do banco de dados com base no CPF fornecido.
     *
     * @param cpfFuncionario O CPF do funcionário a ser deletado.
     */
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

    /**
     * Encontra todos os funcionários no banco de dados.
     *
     * @return List<funcionariosMODEL> Uma lista contendo todos os funcionários encontrados.
     */
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
            throw new RuntimeException(ex);
        }
        return funcionarios;
    }

    /**
     * Encontra um funcionário no banco de dados com base no CPF fornecido.
     *
     * @param cpfFuncionario O CPF do funcionário a ser encontrado.
     * @return Optional<funcionariosMODEL> Um objeto Optional contendo o funcionário encontrado, se houver.
     */
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
            throw new RuntimeException(ex);
        }
        return Optional.ofNullable(funcionario);
    }
}
