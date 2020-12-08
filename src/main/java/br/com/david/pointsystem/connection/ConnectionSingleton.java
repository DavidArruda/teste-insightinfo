package br.com.david.pointsystem.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Responsável por fazer a conexão com o banco de dados
 * @author David Arruda
 */
public class ConnectionSingleton {

    private static Connection CONNECTION = null;

    private ConnectionSingleton() {
        // singleton
    }

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        if (isExistsConnection()) {
            return CONNECTION;
        }

        return createConnection();

    }

    private static Connection createConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        CONNECTION = DriverManager.getConnection("jdbc:postgresql://localhost:5432/INSIGHT?autoReconnect=true");
        return CONNECTION;
    }

    private static boolean isExistsConnection() {
        return CONNECTION != null;
    }

}
