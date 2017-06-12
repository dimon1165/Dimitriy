package learn.java.jdbc.jdbcpostgresql;

import java.sql.*;

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
 * Statement Interface - used to execute static SQL statements
 * Has methods:
 * - ResultSet executeQuery();
 * - int executeUpdate();
 * - boolean execute(); (used when as result of operation is going to be more than one ResultSet).
 *
 * The process of getting data form DB is:
 * - Set up connection;
 * - Create statement object;
 * - Execute query;
 * - Process the result set;
 *
 *  Iterating through resultSet:
 *  Result set get data from DB as table. ResultSet has pointer inside and firstly it is point on
 *  "nothing" before the first row of the table. We need explicitly indicate the data for him.
 *  There are methods which MOVES CURSOR:
 *  - beforeFirst() - put cursor before table rows;
 *  - afterLast() - put cursor after the last tables row;
 *  - first() - moves the cursor to the first row;
 *  - last() - moves the cursor to the last row;
 *  - previous() - moves to previous;
 *  - next() - moves to next row;
 *  - getRow() - returns the number of row where the cursor pointing;
 *
 *
 */
public class JavaToPostgresUsualResultSet {
//    Set up the driver, url and password to db
    private static final String JDBC_POSTGRESQL_URL = "jdbc:postgresql://localhost:5432/postgres";
    public static final String PASSWORD = "";
    public static final String USER = "postgres";

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
//            Register driver
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            e.getMessage();
        }
        try {
//            Open connection to DB in behalf of Driver manager method getConnection
            connection = DriverManager.getConnection(JDBC_POSTGRESQL_URL, USER, PASSWORD);
            System.out.println("Connection establish...");

//            Create statement
            statement = connection.createStatement();

//            Execute query and get number of rows in table
            resultSet = statement.executeQuery("SELECT * FROM \"Countries\".\"Country\"");

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
        finally {
//            close result set
            if (resultSet != null){
                resultSet.close();
            }
//            close statement
            if (statement != null){
                statement.close();
            }
//            close connection to database
            if (connection != null){
                connection.close();
                System.out.println("Connection closed...");
            }
        }
    }
}
