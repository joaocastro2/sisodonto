package DEV.JV.DAO;

import DEV.JV.CLASSES_ENUM.formasPagamento;
import DEV.JV.INFRA.ConnectionFactory;
import DEV.JV.MODEL.pagamentosMODEL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class pagamentosDAO implements IpagamentosDAO {
    @Override
    public pagamentosMODEL save(pagamentosMODEL pagamentos) {

        try (Connection connection = ConnectionFactory.getConnection()) {

            String sql = "INSERT INTO pagamentos (fk_idConsulta, dataPagamento, Valor, Forma_Pagamento, situação) " +
                    "VALUES (?, ?, ?, ?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, pagamentos.getFk_idConsulta());
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
    public pagamentosMODEL update(pagamentosMODEL pagamentos) {

        try(Connection connection = ConnectionFactory.getConnection()){

            String sql =   "UPDATE pagamentos SET  fk_idConsulta = ?, dataPagamento = ?, Valor = ?, Forma_Pagamento = ?, situação";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, pagamentos.getFk_idConsulta());
            preparedStatement.setDate(2, java.sql.Date.valueOf(pagamentos.getDataPagamento()));
            preparedStatement.setDouble(3, pagamentos.getValor());
            preparedStatement.setString(4, pagamentos.getFormaPagamento().toString());
            preparedStatement.setBoolean(5, pagamentos.isSituacao());

            preparedStatement.executeUpdate();

        } catch (SQLException ex){
            throw new RuntimeException();
        }

        return pagamentos;
    }

    @Override
    public void delete(Long idPagamento) {
        try (Connection connection = ConnectionFactory.getConnection()){
            String sql = "DELETE FROM pagamentos WHERE idPagamento = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, idPagamento);
            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public List<pagamentosMODEL> findAll() {

        List<pagamentosMODEL> pagamentos = new ArrayList<>();

        try (Connection connection = ConnectionFactory.getConnection()) {

            String sql  = "SELECT * FROM pagamentos";

            PreparedStatement prepareStatement  = connection.prepareStatement(sql);
            ResultSet  rs = prepareStatement.executeQuery();

            while (rs.next()){
                Long idPagamento =  rs.getLong("idPagamento");
                Long fk_idConsulta = rs.getLong("fk_idConsulta");
                LocalDate dataPagamento = rs.getDate("dataPagamento").toLocalDate();
                Double valor = rs.getDouble("Valor");
                formasPagamento formaPagamento =  formasPagamento.valueOf(rs.getString("Forma_Pagamento"));
                Boolean situacao = rs.getBoolean("situação");

                pagamentosMODEL pagamento = new pagamentosMODEL(idPagamento, fk_idConsulta,  dataPagamento, valor, formaPagamento, situacao);
                pagamentos.add(pagamento);

            }

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

        return pagamentos;
    }

    @Override
    public Optional<pagamentosMODEL> findById(Long idPagamento) {

        pagamentosMODEL pagamentos  = null;

        try (Connection connection  = ConnectionFactory.getConnection()){

            String sql = "SELECT * FROM pagamentos WHERE idPagamento = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, idPagamento);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                Long idPagamento1 =  rs.getLong("idPagamento");
                Long fk_idConsulta = rs.getLong("fk_idConsulta");
                LocalDate dataPagamento = rs.getDate("dataPagamento").toLocalDate();
                Double valor = rs.getDouble("Valor");
                formasPagamento formaPagamento =  formasPagamento.valueOf(rs.getString("Forma_Pagamento"));
                Boolean situacao = rs.getBoolean("situação");

                pagamentos = new pagamentosMODEL(idPagamento1, fk_idConsulta,  dataPagamento, valor, formaPagamento, situacao);

            }

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

        return Optional.ofNullable(pagamentos);
    }
}
