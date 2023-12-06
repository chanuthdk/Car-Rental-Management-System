package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class mGetCarRentalsDetails {
    public List<CarRental> getCarRentalsDetails() {
        List<CarRental> carRentalList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = mDBconnection.createDBconnection();
            statement = connection.createStatement();
            String sql = "SELECT * FROM carrental";
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int rent_id = resultSet.getInt("rent_id");
                int vehicle_id = resultSet.getInt("vehicle_id");
                int customer_id = resultSet.getInt("customer_id");
                String rent_date = resultSet.getString("rent_date");
                String return_date = resultSet.getString("return_date");
                float fees = resultSet.getFloat("fees");

                CarRental carrental = new CarRental(rent_id, vehicle_id, customer_id, rent_date, return_date, fees);
                carRentalList.add(carrental);
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

        return carRentalList;
    }
}
