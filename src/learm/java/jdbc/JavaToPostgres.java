package learm.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * Created by Voropai_Dmytro on 22.01.17.
 */
public class JavaToPostgres {
    public static void main(String[] args) {
            Connection connection = null;
        try {
            connection = DriverManager.getConnection("","dimon1165","Marot1165");
        } catch (SQLException e) {
            System.out.println("The error message is: " + e.getMessage());
        }

    }
}
