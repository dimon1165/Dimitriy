package learn.java.jdbc.jdbcpostgresql;

import org.postgresql.ds.PGConnectionPoolDataSource;

import javax.sql.PooledConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Voropai_Dmytro on 23.01.17.
 * Pool connections
 * While logical connection closed the physical connection always set open for other threads.
 *
 * public class PGConnectionPoolDataSource extends BaseDataSource implements ConnectionPoolDataSource, Serializable
 * PostgreSQL implementation of ConnectionPoolDataSource.
 * The app server or middleware vendor should provide a DataSource implementation that takes advantage of this
 * ConnectionPoolDataSource. If not, you can use the PostgreSQL implementation known as PoolingDataSource,
 * but that should only be used if your server or middleware vendor does not provide their own.
 * Why? The server may want to reuse the same Connection across all EJBs requesting a Connection within
 * the same Transaction, or provide other similar advanced features.
 */
public class ConnectionPoolingJDBC {
    public static void main(String[] args) throws SQLException {
//        organize connection pool with adding data source
        PGConnectionPoolDataSource dataSource = new PGConnectionPoolDataSource();
        dataSource.setServerName("localhost");
        dataSource.setPortNumber(5432);
        dataSource.setUser("postgres");
        dataSource.setPassword("");

//      Establish pooled connection
        PooledConnection pooledConnection = dataSource.getPooledConnection();
        Connection connection = pooledConnection.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM \"Countries\".\"Country\"");

//      Iterate on statement
        while (resultSet.next()){
//                set format of printing result on screen
            String format = "%-20s%-20s%-20s%-20s\n";
            System.out.format(format,resultSet.getString("France"),
                    resultSet.getString("Ukraine"),
                    resultSet.getString("United States"),
                    resultSet.getString("Ganduras"));
        }
        resultSet.close();
        statement.close();
        connection.close();
        pooledConnection.close();
    }
}
