package Chapter_32;

import java.sql.*;
import java.util.Locale;

public class FindUserTables {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Load the JDBC driver
        Class.forName("oracle.jdbc.driver.OracleDriver");
        System.out.println("Driver loaded");

        // Connect to a database
        Locale.setDefault(Locale.ENGLISH);
        Connection connection = DriverManager.getConnection
                ("jdbc:oracle:thin:@localhost:1521:XE",
                        "scott", "tiger");
        System.out.println("Database connected");

        DatabaseMetaData dbMetaData = connection.getMetaData();

        ResultSet rsTables = dbMetaData.getTables(null, null,
                null, new String[] {"TABLE"});
        System.out.println("User tables: ");
        while (rsTables.next())
            System.out.println(rsTables.getString("TABLE_NAME") + " ");

        // Close the connection
        connection.close();
    }
}
