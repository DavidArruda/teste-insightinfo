package br.com.david.pointsystem.connection.factory;

import br.com.david.pointsystem.connection.ConnectionSingleton;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author David Arruda
 */
public class ConnectionFactoryImpl implements ConnectionFactory{

    @Override
    public Connection get() throws ClassNotFoundException, SQLException {
      return ConnectionSingleton.getConnection();
    }
    
}
