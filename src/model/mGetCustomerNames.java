package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class mGetCustomerNames {
    public List<String> getCustomerNames() {
        List<String> customerNames = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = mDBconnection.createDBconnection();
            statement = connection.createStatement();
            String sql = "SELECT first_name, last_name FROM customers";
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String fullName = firstName + " " + lastName;
                customerNames.add(fullName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return customerNames;
    }
}
