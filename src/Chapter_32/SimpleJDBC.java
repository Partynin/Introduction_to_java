package Chapter_32;

import java.sql.*;
import java.util.Locale;

public class SimpleJDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Load the JDBC driver
        Class.forName("oracle.jdbc.driver.OracleDriver");
        System.out.println("Driver loaded");

        // Connect to a database
        Locale.setDefault(Locale.ENGLISH);
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",
                "scott", "tiger");
        System.out.println("Database connected");

        // Create a statement
        Statement statement = connection.createStatement();

        // Execute a statement
        ResultSet resultSet = statement.executeQuery("select firstName, mi, lastName from " +
                "Student where lastName = 'Smith'");

        // Iterate through the result and print the student names
        while (resultSet.next())
            System.out.println(resultSet.getString(1) + "\t" +
                    resultSet.getString(2) + "\t" + resultSet.getString(3));

        // Close the connection
        connection.close();
    }
}
