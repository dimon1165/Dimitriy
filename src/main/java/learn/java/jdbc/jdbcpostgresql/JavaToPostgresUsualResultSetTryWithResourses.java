package learn.java.jdbc.jdbcpostgresql;

import java.sql.*;

/**
 *
 * Created by Voropai_Dmytro on 22.01.17.
 * Using try with resources.
 * Resources is all what implemented AutoCloseable interface.
 * For indication try with resources we should indicate "resources" by putting the into try() and they exists
 * during the life of try statement.
 * Close method from try-with-resources block calls any time even if we have not called it explicitly.
 * If exception thrown form resources and the same exception will be thrown from close method of AutoCloseable
 * the JVM will show only one exception thrown by resources and will not show exception from close() method.
 * Java track it as suppressed exception.
 */
public class JavaToPostgresUsualResultSetTryWithResourses {
//    Set up the driver, url and password to db
    private static final String JDBC_POSTGRESQL_URL = "jdbc:postgresql://localhost:5432/postgres";
    public static final String PASSWORD = "";
    public static final String USER = "postgres";

    public static void main(String[] args) throws SQLException {
        try {
//            Register driver
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            e.getMessage();
        }

//        Try with resources
        try (Connection connection = DriverManager.getConnection(JDBC_POSTGRESQL_URL, USER, PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM \"Countries\".\"Country\"");
             )
        {
//            Iterate on statement
            while (resultSet.next()){
//                set format of printing result on screen
                String format = "%-20s%-20s%-20s%-20s\n";
                System.out.format(format,resultSet.getString("France"),
                                         resultSet.getString("Ukraine"),
                                         resultSet.getString("United States"),
                                         resultSet.getString("Ganduras"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            e.getMessage();
        }
    }
}
