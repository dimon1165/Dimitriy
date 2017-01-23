package learn.java.jdbc;

import java.sql.*;

/**
 *
 * Created by Voropai_Dmytro on 22.01.17.
 * Using try with resources.
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
