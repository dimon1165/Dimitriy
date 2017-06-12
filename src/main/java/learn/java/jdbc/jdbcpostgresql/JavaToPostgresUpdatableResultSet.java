package learn.java.jdbc.jdbcpostgresql;

import java.sql.*;

/**
 *
 * Created by Voropai_Dmytro on 22.01.17.
 * Using try with resources.
 * Using updatable resultSet.
 * Contains methods for updating resultSets:
 * - public void updateString(int columnIndex, String s) - changes string in the specified column;
 * - public void updateString(String columnName, String s) - changes string in the specified column by passing name.
 * If we would like to update row in database we need to use updateRow(); deleteRow(); refreshRow(); cancelRowUpdates()
 * insertRow() .
 *
 */
public class JavaToPostgresUpdatableResultSet {
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
//         here we make result set scrollable and updatable read only
             Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet resultSet = statement.executeQuery("SELECT * FROM \"Countries\".\"Country\"");
             )
        {
//            set cursor on second row
            resultSet.absolute(2);

//          update the row
            resultSet.updateString("France","Francoise");
            resultSet.updateRow();

            System.out.println("Record updated successfully");
        } catch (SQLException e) {
            e.printStackTrace();
            e.getMessage();
        }
    }
}
