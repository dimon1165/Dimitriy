package learn.java.jdbc.jdbcmysql;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Voropai Dmytro on 12.06.2017.
 * Connection to Mysql DB with MySQLDataSource object
 */
public class JDBCDataSourceUsing {
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL("jdbc:mysql://localhost:3306/mydb");
        dataSource.setPassword("root");
        dataSource.setUser("root");
        Connection connection = null;
        Statement statement;
        ResultSet resultSet;
        try {
//            Register driver
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            e.getMessage();
        }
        try {
            connection = dataSource.getConnection(USER_NAME, PASSWORD);
            System.out.println(connection.getMetaData().getSQLKeywords());
            statement = connection.createStatement();
            statement.setFetchSize(3);
            resultSet = statement.executeQuery("select * from user");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("user_first_name"));
            }
            connection.setAutoCommit(false);
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
