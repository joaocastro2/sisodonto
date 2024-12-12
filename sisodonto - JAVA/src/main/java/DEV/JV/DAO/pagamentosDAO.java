package DEV.JV.DAO;

import DEV.JV.INFRA.ConnectionFactory;
import DEV.JV.MODEL.pagamentosMODEL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class pagamentosDAO implements IpagamentosDAO {
    @Override
    public pagamentosMODEL save(pagamentosMODEL pagamentos) {

        try (Connection connection = ConnectionFactory.getConnection()) {

            String sql = "INSERT INTO pagamentos (fk_idConsulta, dataPagamento, Valor, Forma_Pagamento, situação) " +
                    "VALUES = (?, ?, ?, ?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, pagamentos.getFk_idConsulta());
            preparedStatement.setDate(2, java.sql.Date.valueOf(pagamentos.getDataPagamento()));
            preparedStatement.setDouble(3, pagamentos.getValor());
            preparedStatement.setString(4, pagamentos.getFormaPagamento().toString());
            preparedStatement.setBoolean(5, pagamentos.isSituacao());

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            throw new RuntimeException();
        }
        return pagamentos;
    }

    @Override
    public pagamentosMODEL update(pagamentosMODEL pagamentosMODEL) {
        return null;
    }

    @Override
    public void delete(Long idPagamento) {

    }

    @Override
    public List<pagamentosMODEL> findAll() {
        return List.of();
    }

    @Override
    public Optional<pagamentosMODEL> findById(Long idPagamento) {
        return Optional.empty();
    }
}
