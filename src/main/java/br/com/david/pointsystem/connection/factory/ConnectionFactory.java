package br.com.david.pointsystem.connection.factory;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author David Arruda
 */
public interface ConnectionFactory {
    
    /**
     * Retorna a conexão com o banco
     * @return Connection
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
    public Connection get() throws ClassNotFoundException, SQLException;
}
