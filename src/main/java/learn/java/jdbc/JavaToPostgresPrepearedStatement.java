package learn.java.jdbc;

import java.sql.*;

/**
 *
 * Created by Voropai_Dmytro on 22.01.17.
 * Using try with resources.
 *
 * Prepared statement - it is sub-interface of statement.
 * - It improves the performance;
 * - Prevents SQL dependency injection attacks;
 * - We can use the same SQL query and supplies it with different values.
 * To use Prepared statement we need to use method set(position, value);
 *
 * If we would like to insert or update table with help of PS we nedd to write like this:
 * PreparedStatement preparedStatement = conn.preparedStatement(insert into <table name> values(?,?,?,?,?));
 *
 * If we would like to call stored procedure we need to use callable statement like this:
 * CallableStatement cstm = conn.prepareCall("{call StoredProcedureName([Parameter Definition])}")
 */
public class JavaToPostgresPrepearedStatement {
//    Set up the driver, url and password to db
    private static final String JDBC_POSTGRESQL_URL = "jdbc:postgresql://localhost:5432/postgres";
    public static final String PASSWORD = "";
    public static final String USER = "postgres";

    public static void main(String[] args) {
        try {
//            Register driver
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            e.getMessage();
        }
        try{
//      Create connection
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        connection = DriverManager.getConnection(JDBC_POSTGRESQL_URL, USER, PASSWORD);

//      Form sql query for ps
        String sql = "SELECT * FROM \"Countries\".\"Country\" WHERE \"Countries\".\"Country\".\"France\" = ? ";

//      Prepared statemnt
        preparedStatement = connection.prepareStatement(sql,
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY);

//      Pass the parameters and execute
        preparedStatement.setString(1,"third");
        resultSet = preparedStatement.executeQuery();

//        Get info
        System.out.println("PREPARED STATEMENT: ");
        while (resultSet.next()){
//           set format of printing result on screen
            String format = "%-20s%-20s%-20s%-20s\n";
            System.out.format(format,resultSet.getString("France"),
                    resultSet.getString("Ukraine"),
                    resultSet.getString("United States"),
                    resultSet.getString("Ganduras"));
        }
//        show the total number rof rows
        resultSet.last();
        System.out.println("The number of rows is: " +resultSet.getRow());
        } catch (SQLException ex){
            ex.getMessage();
            ex.printStackTrace();
        }
    }
}
