package DEV.JV.INFRA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe fábrica para gerenciar conexões com o banco de dados.
 * Fornece uma conexão com o banco de dados MySQL.
 */
public class ConnectionFactory {

    // Construtor privado para impedir instanciação
    private ConnectionFactory() {}

    /**
     * Obtém uma conexão com o banco de dados.
     *
     * @return Connection Objeto Connection para o banco de dados.
     * @throws RuntimeException Se ocorrer um erro ao tentar se conectar ao banco de dados.
     */
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/sisodonto", "root", "123321");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
