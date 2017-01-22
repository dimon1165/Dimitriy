package learm.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * Created by Voropai_Dmytro on 22.01.17.
 */
public class JavaToPostgres {

    private static final String JDBC_POSTGRESQL_URL = "jdbc:postgresql://localhost:5432/postgres";
    public static final String PASSWORD = "";
    public static final String USER = "";

    public static void main(String[] args) {
            Connection connection = null;
        try {
            connection = DriverManager.getConnection(JDBC_POSTGRESQL_URL,
                    USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("The error message is: " + e.getMessage());

        }

    }
}
