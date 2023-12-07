package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class mDBconnection {
    private static Connection con;
    public static Connection createDBconnection() {
    try {
        String dbUrl = "jdbc:mysql://localhost/carrental";
        String username = "root";
        String password = "";

        con = DriverManager.getConnection(dbUrl, username, password);
    } catch (SQLException e) {
        System.err.println(e.getMessage());
    }
    return con;
}
}
