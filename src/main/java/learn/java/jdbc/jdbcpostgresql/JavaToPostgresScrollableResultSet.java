package learn.java.jdbc.jdbcpostgresql;

import java.sql.*;

/**
 *
 * Created by Voropai_Dmytro on 22.01.17.
 * Using try with resources.
 * Using scrollable resultSet. If we would like to go with cursor in the table we should use
 * scrollable resultSet.
 *
 */
public class JavaToPostgresScrollableResultSet {
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
//         here we make result ser scrollable and read only
             Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             ResultSet resultSet = statement.executeQuery("SELECT * FROM \"Countries\".\"Country\"");
             )
        {
//            set before table and iterate forward
            resultSet.beforeFirst();

//            Iterate on statement
            System.out.println("Iteration on ResultSet: ");
            while (resultSet.next()){
//                set format of printing result on screen
                String format = "%-20s%-20s%-20s%-20s\n";
                System.out.format(format,resultSet.getString("France"),
                                         resultSet.getString("Ukraine"),
                                         resultSet.getString("United States"),
                                         resultSet.getString("Ganduras"));
             }

//          Set after and return to previous, iterate backward
             resultSet.afterLast();
            System.out.println("Iteration on ResultSet in backward: ");
            while (resultSet.previous()){
                String format = "%-20s%-20s%-20s%-20s\n";
                System.out.format(format,resultSet.getString("France"),
                        resultSet.getString("Ukraine"),
                        resultSet.getString("United States"),
                        resultSet.getString("Ganduras"));
            }

//          Set cursor to first line of result set and print it
            System.out.println("The first line in ResultSet");
            resultSet.first();
            String format = "%-20s%-20s%-20s%-20s\n";
            System.out.format(format,resultSet.getString("France"),
                    resultSet.getString("Ukraine"),
                    resultSet.getString("United States"),
                    resultSet.getString("Ganduras"));

//          Set cursor to last line of result set and print it
            resultSet.last();
            System.out.println("The last row in ResultSet");
            System.out.format(format,resultSet.getString("France"),
                    resultSet.getString("Ukraine"),
                    resultSet.getString("United States"),
                    resultSet.getString("Ganduras"));

//          We can also choose row by its number
            resultSet.absolute(2);
            System.out.println("Row by number: ");
            System.out.format(format,resultSet.getString("France"),
                    resultSet.getString("Ukraine"),
                    resultSet.getString("United States"),
                    resultSet.getString("Ganduras"));

//          Now we can move cursor forward on one....n rows
//          If we want to go backward we need to put negative integer -1 for example to go on one row back.
            resultSet.relative(1);
            System.out.println("Move cursor backward and forward: ");
            System.out.format(format,resultSet.getString("France"),
                    resultSet.getString("Ukraine"),
                    resultSet.getString("United States"),
                    resultSet.getString("Ganduras"));
        } catch (SQLException e) {
            e.printStackTrace();
            e.getMessage();
        }
    }
}
