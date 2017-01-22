package learm.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * Created by Voropai_Dmytro on 22.01.17.
 *
 * The structure of JDBC could be 3 or 2 tier.
 * If we want to work with JDBC we will need ot use:
 * JDBC API - Application to JDBC Manager Connection
 * JDBC Driver API - Supports JDBC Manager Connection to Driver connection.
 *
 * Role of Driver Manager is:
 * - it is a basic service for managing a set of JDBC drivers.
 * If we need to connect to Oracle database(for example) we need to load in driver manager relevant
 * JDBC driver of Oracle database with help of:
 * Class.forName("oracle.jdbc.driver.OracleDriver");
 * Driver Manager has methods - getConnection and getDrivers.
 *
 */
public class JavaToPostgres {
//    Set up the driver, url and password to db
    private static final String JDBC_POSTGRESQL_URL = "jdbc:postgresql://localhost:5432/postgres";
    public static final String PASSWORD = "";
    public static final String USER = "postgres";

    public static void main(String[] args) {
            Connection connection = null;
        try {
//            Register driver
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            e.getMessage();
        }
        try {
//            Open connetcion to DB in behalf of Driver manager method getConnection
            connection = DriverManager.getConnection(JDBC_POSTGRESQL_URL, USER, PASSWORD);
            System.out.println("Connection establish...");
        } catch (SQLException e) {
            e.printStackTrace();
            e.getMessage();
        }

    }
}
